package javaLearning;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadingExample {

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonParser = new JSONParser();
		FileReader fileReader = new FileReader("haris.json");
		Object parsedObject =jsonParser.parse(fileReader);
		JSONObject jsonObject=(JSONObject) parsedObject;
		
		String name =(String)jsonObject.get("Name");
		Long age =(Long)jsonObject.get("age");
		
		JSONArray array =(JSONArray)jsonObject.get("Special Features");
		Iterator iterator =array.iterator();
		
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		while(iterator.hasNext()) {
			System.out.println("Specail Features are "+iterator.next());
		}

	}

}
