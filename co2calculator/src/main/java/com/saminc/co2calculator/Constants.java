package com.saminc.co2calculator;

import java.util.HashMap;
import java.util.Map;

public class Constants {

	private static Map<String, Integer> transportationMethod = new HashMap<String, Integer>(){{
		//Small cars
		transportationMethod.put("small-diesel-car", 142); 
		transportationMethod.put("small-petrol-car", 154); 
		transportationMethod.put("small-plugin-hybrid-car", 73); 
		transportationMethod.put("small-electric-car", 50);
		//Medium cars
		transportationMethod.put("medium-diesel-car", 171); 
		transportationMethod.put("medium-petrol-car", 192); 
		transportationMethod.put("medium-plugin-hybrid-car", 110); 
		transportationMethod.put("medium-electric-car", 58);
		//Large cars
		transportationMethod.put("large-diesel-car", 209); 
		transportationMethod.put("large-petrol-car", 282); 
		transportationMethod.put("large-plugin-hybrid-car", 126); 
		transportationMethod.put("large-electric-car", 73);
		//Bus
		transportationMethod.put("bus", 27); 
		//Train
		transportationMethod.put("train", 6); 
	}};

	public static Map<String, Integer> getTransportationMethod() {
		return transportationMethod;
	}
	
}
