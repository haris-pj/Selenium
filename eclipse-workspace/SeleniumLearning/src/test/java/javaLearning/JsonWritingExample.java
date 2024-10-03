package javaLearning;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritingExample {

	public static void main(String[] args) throws IOException {
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Haris");
		jsonObject.put("age", 23);
		
		JSONArray array = new JSONArray();
		array.add("magical smile");
		array.add("magnetic eyes");
		
		jsonObject.put("Special Features", array);
		
		FileWriter fileWriter = new FileWriter("haris.json");
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();

	}

}
