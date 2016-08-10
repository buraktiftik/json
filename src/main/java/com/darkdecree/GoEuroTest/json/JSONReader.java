package com.darkdecree.GoEuroTest.json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONReader {

	private static final String baseAPIAdress = "http://api.goeuro.com/api/v2/position/suggest/en/";
	private static final int variableNumber = 5;
	private String cityName;
	private List<String[]> resultSet;

	public List<String[]> readJSON(String cityName) {
		resultSet = new ArrayList<String[]>();

		String jsonData = "";
		BufferedReader in = null;

		try {
			String line;
			URL apiAdress = new URL(baseAPIAdress + cityName);
			URLConnection yc = apiAdress.openConnection();
			in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

			while ((line = in.readLine()) != null) {
				jsonData += line + "\n";
			}
			in.close();
		} catch (Exception e) {
			System.out.println("Error Connecting and Reading from JSON");
			e.printStackTrace();
		}

		JSONArray myArray = new JSONArray(jsonData);

		JSONObject myObject;

		for (int i = 0; i < myArray.length(); i++) {
			myObject = myArray.getJSONObject(i);
			String[] singleEntry = new String[variableNumber];

			singleEntry[0] = myObject.get("_id").toString();
			singleEntry[1] = myObject.get("name").toString();
			singleEntry[2] = myObject.get("type").toString();
			myObject = myObject.getJSONObject("geo_position");
			singleEntry[3] = myObject.get("latitude").toString();
			singleEntry[4] = myObject.get("longitude").toString();

			resultSet.add(singleEntry);
			System.out.println();
		}

		return resultSet;

	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
