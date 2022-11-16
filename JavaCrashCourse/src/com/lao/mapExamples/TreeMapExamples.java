package com.lao.mapExamples;

import java.util.TreeMap;

public class TreeMapExamples {
	
	public static void main(String[] args) {
		TreeMap<String, String> places = new  TreeMap<String, String>();
		
		
		/*
		 * places.put("Tiruppur", null); places.put("Chennai", null);
		 * 
		 * System.out.println(places);
		 */
		
		
		places.put("Kanyakumari", "TamilNadu");
		places.put("Chennai", "TamilNadu");
		places.put("Tirunelveli", "TamilNadu");
		
		System.out.println(places);
		
		places.put("Tiruppur", "hey");
		places.put("Tiruppur", "hi");
		places.put("Tiruppur", "bye");
		System.out.println(places);
		
		//places.put(null, "OMG");
		//System.out.println(places);
		
		
		
		
		
		
		
		
		
		
		
	}

}
