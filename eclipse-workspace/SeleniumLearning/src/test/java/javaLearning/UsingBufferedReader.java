package javaLearning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		
		String location ="UsingBufferedWriter.txt";
		
		FileReader fileReader = new FileReader(location);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String currentLine;
		while((currentLine =bufferedReader.readLine())!=null) {
			System.out.println(currentLine);
		}

	}

}
