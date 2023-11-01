package com.test.code;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;

import org.json.simple.JSONObject;
import org.json.simple.JsonArray;
import org.json.simple.parser.*;

public class ReadDataFromJSON {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\yfarhan\\eclipse-workspace\\TestProject\\Accounts.json");
		JSONParser jsonParser = new JSONParser();
		FileReader fileReader = new FileReader(file);
		Object obj = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) obj;
		System.out.println(jsonObject.get("name"));
		
		
	}
}
