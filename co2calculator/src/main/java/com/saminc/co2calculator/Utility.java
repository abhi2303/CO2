package com.saminc.co2calculator;

public class Utility {


	public static double calculateEmmission(double distance, String method) {
		return calculateEmmission(distance, method, getDefaultUnitOfDistance());
	}
	
	public static double calculateEmmission(double distance, String method, DistanceUnit unitOfDistance) {
		double emission = 0.0;
		emission = Constants.getTransportationMethod().get(method) * calculateDistance(distance, unitOfDistance);
		return emission;
	}
	
	public static double calculateDistance(double distance, DistanceUnit unitOfDistance) {
		if(unitOfDistance == DistanceUnit.M) {
			return distance/1000;
		}
		return distance;
	}
	public static DistanceUnit getDefaultUnitOfDistance() {
		return DistanceUnit.KM;
	}
	
	public static String getFinalEmission(double emission, EmissionUnit unit) {
		StringBuilder result = new StringBuilder();
		if(unit!=null && unit == EmissionUnit.G) {
			
		} else if(unit!=null && unit == EmissionUnit.KG) {
			
		}
		
		result.append("Total emission : "+emission+unit);
		return result.toString();
	}
}
