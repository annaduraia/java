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

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.planets.utility.Constants;

/**
 * @author annadurai_a
 *
 */
public class PlanetExample {

	static List<String> identifierPlannetsList;

	static {
		identifierPlannetsList = Arrays.asList(Constants.identifierPlannets);
	}

	static Map<Integer, Map<String, List<JsonObject>>> planetsDiscoveredMap = new TreeMap<Integer, Map<String, List<JsonObject>>>();

	static List<JsonObject> orphanPlanetsList = new ArrayList<JsonObject>();
	static List<JsonObject> identyfyPlanetsJsonList = new ArrayList<JsonObject>();

	
	public static void main(String[] args) {

		jsonGetRequest(Constants.URL);

	}

	@SuppressWarnings("resource")
	private static String streamToString(InputStream inputStream) {
		String text = new Scanner(inputStream, "UTF-8").useDelimiter("\\Z").next();
		return text;
	}

	public static void jsonGetRequest(String urlQueryString) {
		String jsonStr = null;
		try {
			URL url = new URL(urlQueryString);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setRequestProperty("charset", "utf-8");
			connection.connect();
			InputStream inStream = connection.getInputStream();
			jsonStr = streamToString(inStream); // input stream to string

			JsonParser jsonParser = new JsonParser();

			JsonElement element = jsonParser.parse(jsonStr);
			JsonArray planetArray = null;

			if (element.isJsonArray()) {
				planetArray = element.getAsJsonArray();
			}
			String hotestStar = null;
			double tempMax = 0.0;

			for (JsonElement jsonElement : planetArray) {
				if (jsonElement.isJsonObject()) {
					JsonObject planetObj = jsonElement.getAsJsonObject();
					if (!identifierPlannetsList.contains(planetObj.get("PlanetIdentifier").getAsString())) {
						orphanPlanetsList.add(planetObj);
					} else {
						identyfyPlanetsJsonList.add(planetObj);
					}

					if (planetObj.get("HostStarTempK").isJsonPrimitive()
							&& planetObj.get("HostStarTempK").getAsJsonPrimitive().isNumber()) {
						double max = planetObj.get("HostStarTempK").getAsDouble();
						if (max > tempMax) {
							tempMax = max;
							hotestStar = planetObj.get("PlanetIdentifier").getAsString();
						}
					}

					if (planetObj.get("DiscoveryYear").isJsonPrimitive()
							&& planetObj.get("RadiusJpt").isJsonPrimitive()) {
						JsonPrimitive jsonPrimitive = planetObj.get("DiscoveryYear").getAsJsonPrimitive();
						JsonPrimitive jsonPrimitiveRds = planetObj.get("RadiusJpt").getAsJsonPrimitive();
						if (jsonPrimitive.isNumber() && jsonPrimitiveRds.isNumber()) {
							double radiusJpt = planetObj.get("RadiusJpt").getAsDouble();
							int discoveryYear = planetObj.get("DiscoveryYear").getAsInt();
							Map<String, List<JsonObject>> value = null;
							if (planetsDiscoveredMap.get(discoveryYear) == null) {
								value = new HashMap<String, List<JsonObject>>();
								planetsDiscoveredMap.put(discoveryYear, value);
							} else {
								value = planetsDiscoveredMap.get(discoveryYear);
							}
							if (radiusJpt < 1.0) {
								String small = "small";
								List<JsonObject> jsonObjects = null;
								if (value.get(small) == null) {
									jsonObjects = new ArrayList<JsonObject>();
									value.put(small, jsonObjects);
								} else {
									jsonObjects = value.get(small);
								}
								jsonObjects.add(planetObj);
							} else if (radiusJpt < 2.0) {
								String medium = "medium";
								List<JsonObject> jsonObjects = null;
								if (value.get(medium) == null) {
									jsonObjects = new ArrayList<JsonObject>();
									value.put(medium, jsonObjects);
								} else {
									jsonObjects = value.get(medium);
								}
								jsonObjects.add(planetObj);
							} else {
								String large = "large";
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
			System.out.println("--------------------------------");

			System.out.println("The Number of orphan plants " + orphanPlanetsList.size());
			// System.out.println(identyfyPlanetsJsonList.size());
			System.out.println("--------------------------------");

			System.out.println("hotest Star == " + hotestStar);

//			System.out.println(planetsDiscoveredMap);

			for (Entry<Integer, Map<String, List<JsonObject>>> entry : planetsDiscoveredMap.entrySet()) {
				Map<String, List<JsonObject>> map = entry.getValue();
				System.out.println("In " + entry.getKey() + " we discovered "
						+ (map.get("small") != null ? map.get("small").size() : "0") + " small planets, "
						+ (map.get("medium") != null ? map.get("medium").size() : "0") + " medium planets, and "
						+ (map.get("large") != null ? map.get("large").size() : "0") + " large planets");
//				if(map.get("large") != null && map.get("large").size()>0){
//				System.out.println(map.get("large"));
//				}
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
