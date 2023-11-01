package com.tests.pr;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Read {
	public static void main(String[] args) throws IOException, ParseException {
		readData();
	}
	public static void readData() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		File fis = new File("C:\\Users\\yfarhan\\eclipse-workspace\\TestProject\\Accounts.json");
		FileReader fileReader = new FileReader(fis);
		JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
		System.out.println(jsonObject.get("name"));
		
	}
}
