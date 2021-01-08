package com.saminc.co2calculator;

import java.util.Map;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;

public class Application {

	public static void main(String[] args) {
		
		Options options = new Options();
		options.addRequiredOption(null, "distance", true, "Distance travelled");
		options.addRequiredOption(null, "unit-of-distance", true, "Unit of distance");
		
		
		HelpFormatter helpFormatter = new HelpFormatter();
		helpFormatter.printHelp("CO2-Calculator", options);
		
		
		Map<String, Integer> transportationMethod = Constants.getTransportationMethod();
		double res = Utility.calculateEmmission(20,"small-plugin-hybrid-car");
		System.out.println(res);
	}

}
