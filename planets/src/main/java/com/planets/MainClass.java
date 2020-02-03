package com.planets;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.planets.utility.Constants;
import com.planets.utility.PlannetJsonPaser;

/**
 * @author annadurai_a
 *
 */
public class MainClass {
	
	private static final String DISCOVERY_YEAR = "DiscoveryYear";
	
	private static final String RADIUS_JPT = "RadiusJpt";

	private static final String HOST_STAR_TEMP_K = "HostStarTempK";

	private static final String PLANET_IDENTIFIER = "PlanetIdentifier";

	private static final String X_X = "--------------------------------";
	
	private static final String CONTENT_TYPE = "Content-Type";
	
	private static final String APPLICATION_JSON = "application/json";

	private static final String CHARSET = "charset";

	private static final String UTF_8 = "UTF-8";

	private static final String Z = "\\Z";

	private static final String GET = "GET";

	private static final String LARGE = "large";

	private static final String MEDIUM = "medium";

	private static final String SMALL = "small";


	static List<String> identifierPlannetsList;

	static {
		identifierPlannetsList = Arrays.asList(Constants.identifierPlannets);
	}

	static Map<Integer, Map<String, List<JsonObject>>> planetsDiscoveredMap = new TreeMap<Integer, Map<String, List<JsonObject>>>();

	static List<JsonObject> orphanPlanetsList = new ArrayList<JsonObject>();
	static List<JsonObject> identyfyPlanetsJsonList = new ArrayList<JsonObject>();

	

	public static void main(String[] args) {
		String jsonSting = getDataFromEndPoint(Constants.URL);
		
		
		if(jsonSting != null) {
			PlannetJsonPaser plannet = new PlannetJsonPaser(jsonSting);
			JsonArray planetsJsonArray = plannet.getPlanetArray();
			
			String hotestStar = null;
			double tempMax = 0.0;

			for (JsonElement jsonElement : planetsJsonArray) {
				if (jsonElement.isJsonObject()) {
					JsonObject planetObj = jsonElement.getAsJsonObject();
					/**
					 * The number of orphan planets (no star).
					 */
					if (!identifierPlannetsList.contains(planetObj.get(PLANET_IDENTIFIER).getAsString())) {
						orphanPlanetsList.add(planetObj);
					} else {
						identyfyPlanetsJsonList.add(planetObj);
					}

					/**
					 * The name (planet identifier) of the planet orbiting the hottest star.
					 */
					if (planetObj.get(HOST_STAR_TEMP_K).isJsonPrimitive()
							&& planetObj.get(HOST_STAR_TEMP_K).getAsJsonPrimitive().isNumber()) {
						double max = planetObj.get(HOST_STAR_TEMP_K).getAsDouble();
						if (max > tempMax) {
							tempMax = max;
							hotestStar = planetObj.get(PLANET_IDENTIFIER).getAsString();
						}
					}

					/**
					 * A timeline of the number of planets discovered per year grouped by size. Use
					 * the following groups: 
					 * “small” is less than 1 Jupiter radii 
					 * “medium” is less than 2 Jupiter radii 
					 * anything bigger is considered “large”
					 */
					if (planetObj.get(DISCOVERY_YEAR).isJsonPrimitive()
							&& planetObj.get(RADIUS_JPT).isJsonPrimitive()) {
						JsonPrimitive jsonPrimitive = planetObj.get(DISCOVERY_YEAR).getAsJsonPrimitive();
						JsonPrimitive jsonPrimitiveRds = planetObj.get(RADIUS_JPT).getAsJsonPrimitive();
						if (jsonPrimitive.isNumber() && jsonPrimitiveRds.isNumber()) {
							double radiusJpt = planetObj.get(RADIUS_JPT).getAsDouble();
							int discoveryYear = planetObj.get(DISCOVERY_YEAR).getAsInt();
							Map<String, List<JsonObject>> value = null;
							if (planetsDiscoveredMap.get(discoveryYear) == null) {
								value = new HashMap<String, List<JsonObject>>();
								planetsDiscoveredMap.put(discoveryYear, value);
							} else {
								value = planetsDiscoveredMap.get(discoveryYear);
							}
							if (radiusJpt < 1.0) {
								String small = SMALL;
								List<JsonObject> jsonObjects = null;
								if (value.get(small) == null) {
									jsonObjects = new ArrayList<JsonObject>();
									value.put(small, jsonObjects);
								} else {
									jsonObjects = value.get(small);
								}
								jsonObjects.add(planetObj);
							} else if (radiusJpt < 2.0) {
								String medium = MEDIUM;
								List<JsonObject> jsonObjects = null;
								if (value.get(medium) == null) {
									jsonObjects = new ArrayList<JsonObject>();
									value.put(medium, jsonObjects);
								} else {
									jsonObjects = value.get(medium);
								}
								jsonObjects.add(planetObj);
							} else {
								String large = LARGE;
								List<JsonObject> jsonObjects = null;
								if (value.get(large) == null) {
									jsonObjects = new ArrayList<JsonObject>();
									value.put(large, jsonObjects);
								} else {
									jsonObjects = value.get(large);
								}
								jsonObjects.add(planetObj);
							}

						}
					}
				}

			}
			System.out.println(X_X);

			System.out.println("The Number of orphan planets : " + orphanPlanetsList.size());
			// System.out.println(identyfyPlanetsJsonList.size());
			System.out.println(X_X);

			System.out.println("Hotest Star : " + hotestStar);
			System.out.println(X_X);

//			System.out.println(planetsDiscoveredMap);

			for (Entry<Integer, Map<String, List<JsonObject>>> entry : planetsDiscoveredMap.entrySet()) {
				Map<String, List<JsonObject>> map = entry.getValue();
				System.out.println("In " + entry.getKey() + " we discovered "
						+ (map.get(SMALL) != null ? map.get(SMALL).size() : "0") + " small planets, "
						+ (map.get(MEDIUM) != null ? map.get(MEDIUM).size() : "0") + " medium planets, and "
						+ (map.get(LARGE) != null ? map.get(LARGE).size() : "0") + " large planets");
//				if(map.get("large") != null && map.get("large").size()>0){
//				System.out.println(map.get("large"));
//				}
			}
			System.out.println(X_X);
			
			//
		}else {
			System.out.println("Data not availble");
		}

	}

	private static String getDataFromEndPoint(String urlQueryString) {
		
		/*Logger logger = Logger.getLogger(MainClass.class);
		BasicConfigurator.configure();
		logger.debug("getDataFromEndPoint Start");
		*/
		try {
			URL url = new URL(urlQueryString);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod(GET);
			connection.setRequestProperty(CONTENT_TYPE, APPLICATION_JSON);
			connection.setRequestProperty(CHARSET, UTF_8);
			connection.connect();
			InputStream inStream = connection.getInputStream();
			return streamToString(inStream);
		} catch (IOException e) {
			System.out.println("Error connecting to the end point" + e);
			//logger.error("Error connecting to the end point" + e);
		}
		return null; 
	}
	
	private static String streamToString(InputStream inputStream) {
		@SuppressWarnings("resource")
		String text = new Scanner(inputStream, UTF_8).useDelimiter(Z).next();
		return text;
	}

}
