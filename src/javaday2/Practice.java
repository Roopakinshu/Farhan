package javaday2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws IOException, ParseException {
		List<String> abs = new ArrayList<String>();
		abs.add("hakf");
		abs.stream().filter(e->e.contains("h")).count();
//		String advvv= "abaca";
		test();
//		findDublicateCharacter(advvv);
		String string1 = "abs";
//				new String("abc");
		String string2 = "abs";
//				new String("abc");
//		System.out.println(string1==string2);
//		System.out.println("String1 & String2: "+ string1==string2);
		String string = "ztyzgzabacabacabacabacacabacam";
//		readDataFromJson();
//		reverseString(string);
//		findUniqueCharactersFromString(string);
//		findDublicateCharactersFromString(string);
//
//		String string1 = "java is a programming language java is a object oriented language java is platform independent";
//		findUniqueWordFromString(string1);
//		findDublicateWordFromString(string1);

//		sortMap(string);

		// reverse string using stringbuffer
		StringBuffer buffer = new StringBuffer("abc");
//		System.out.println(buffer.reverse());

		// reverse string using stringBuilder
		StringBuilder builder = new StringBuilder("hjlk");
//		System.out.println(builder.reverse());
	}

	public static void findDublicateCharacter(String string) {
		Set<Character> cha = new HashSet<Character>();
		for (char e : string.toCharArray()) {
			cha.add(e);
		}
		System.out.println(cha);
	}

	public static void reverseString(String string) {
		String reverseString = "";
		for (char e : string.toCharArray()) {
			reverseString = e + reverseString;
		}
		System.out.println(reverseString);
	}

	public static void findUniqueCharactersFromString(String string) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char e : string.toCharArray()) {
			if (map.containsKey(e)) {
				map.put(e, map.get(e) + 1);
			} else {
				map.put(e, 1);
			}
		}
		System.out.println(map);
		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() == 1) {
				System.out.println(e.getKey());
			}
		}
	}

	public static void findDublicateCharactersFromString(String string) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char e : string.toCharArray()) {
			if (map.containsKey(e)) {
				map.put(e, map.get(e) + 1);
			} else {
				map.put(e, 1);
			}
		}
		System.out.println(map);
		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() > 1) {
				System.out.println(e.getKey() + " " + e.getValue());
			}
		}
	}


	
	public static void findUniqueWordFromString(String string) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String e : string.split(" ")) {
			if (map.containsKey(e)) {
				map.put(e, map.get(e) + 1);
			} else {
				map.put(e, 1);
			}
		}
		System.out.println(map);
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			if (e.getValue() == 1) {
				System.out.println(e.getKey());
			}
		}
	}

	public static void findDublicateWordFromString(String string) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String e : string.split(" ")) {
			if (map.containsKey(e)) {
				map.put(e, map.get(e) + 1);
			} else {
				map.put(e, 1);
			}
		}
		System.out.println(map);
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			if (e.getValue() > 1) {
				System.out.println(e.getKey() + " " + e.getValue());
			}
		}
		System.out.println("&&&&");
		map.forEach((k, v) -> {
			v = 1;
			System.out.println(k);
		});
	}

	public static void sortMap(String string) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char e : string.toCharArray()) {
			if (map.containsKey(e)) {
				map.put(e, map.get(e) + 1);
			} else {
				map.put(e, 1);
			}
		}
		LinkedHashMap<Character, Integer> sort = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(
						Map.Entry::getKey, 
						Map.Entry::getValue, 
						(oldkey, newKey) -> oldkey,
						LinkedHashMap::new));
		System.out.println(map);
		System.out.println(sort);
		sort.forEach((k, v) -> {
			v = 1;
			System.out.println(k);
		});
	}

	public void implicitWait() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void explicitWait() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = (WebDriverWait) driver;
		WebElement ele = null;
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}

	public void fluentWait() {
		WebDriver driver = new ChromeDriver();
		WebElement ele = null;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public static void readDataFromJson() throws IOException, ParseException {
		File file = new File("C:\\Users\\yfarhan\\eclipse-workspace\\TestProject\\Accounts.json");
		FileReader reader = new FileReader(file);
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(reader);

		System.out.println(obj.get("name"));
	}

	public static void test() {
		String s = "geeksforgeeks";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char sc : s.toCharArray()) {
			if (map.containsKey(sc)) {
				map.put(sc, map.get(sc) + 1);
			} else {
				map.put(sc, 1);
			}
		}

		for (Map.Entry<Character, Integer> sc : map.entrySet()) {
			if (sc.getValue() > 1) {
				System.out.println(sc.getKey());
			}
		}
		LinkedHashMap<Character, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldKey, newOld) -> oldKey,
						LinkedHashMap::new));
	}
}
