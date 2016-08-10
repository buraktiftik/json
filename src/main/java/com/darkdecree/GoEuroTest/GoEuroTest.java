package com.darkdecree.GoEuroTest;

import com.darkdecree.GoEuroTest.csvtools.CSVWriter;
import com.darkdecree.GoEuroTest.json.JSONReader;

public class GoEuroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		if(args.length==0 || args.length>1){
			System.out.println("Usage: java -jar GoEuroTest.jar \"CITY_NAME\"");
		}
		
		else{
		String cityName=args[0].toString(); 
		
		JSONReader myJSONReader = new JSONReader();

		CSVWriter myWriter = new CSVWriter();
		myWriter.writeToFile(cityName+"Result", myJSONReader.readJSON(cityName));
		
		}
		System.exit(0);
	}

}
