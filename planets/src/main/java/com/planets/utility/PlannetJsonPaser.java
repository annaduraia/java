package com.planets.utility;

import java.util.Objects;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
/**
 * @author annadurai_a
 *
 */
public class PlannetJsonPaser {
	
	private JsonArray planetArray;

	@SuppressWarnings("deprecation")
	public PlannetJsonPaser(String jsonSting) throws JsonSyntaxException {
//		Objects.isNull(jsonSting);
		try {
			JsonParser jsonParser = new JsonParser();
			JsonElement element = jsonParser.parse(jsonSting);
			if (element.isJsonArray()) {
				planetArray = element.getAsJsonArray();
			}
		} catch (JsonSyntaxException e) {
			System.out.println("parsing error");
			throw e;
		}
	}
	
	/**
	 * getPlanetArray()
	 * @return
	 */
	public JsonArray getPlanetArray() {
		return planetArray == null ? new JsonArray() : planetArray;
	}

}
