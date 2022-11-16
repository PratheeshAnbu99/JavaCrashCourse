package com.lao.mapExamples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new LinkedHashMap<String,String>();

		map.put("Iron Man", "Tony");
		map.put("Bat Man", "Bruce");
		map.put("Super Man", "Clark");
		//insertion order is maintained in Linked Hash Map
		
		/*
		 * map.put(null, "Tony");
		 *  map.put(null, "Bruce");
		 *   map.put("Super Man", "Clark");
		 */
		    //values will be over-writed if we use multiple null keys

		System.out.println("LinkedHashMap  :"+map);


		Map<String, String> map1 = new HashMap<String,String>();

		map1.put("Iron Man", "Tony");
		map1.put("Bat Man", "Bruce");
		map1.put("Super Man", "Clark");
		//insertion order is NOT maintained in  Hash Map

		/*
		 * map1.put(null, "Tony");
		 *  map1.put(null, "Bruce");
		 *   map1.put("Super Man", "Clark");
		 *   
		 *   //values will be over-writed if we use multiple null keys
		 */
		System.out.println("HashMap  :"+map1);


       //Other methods are as same as in HashMap




	}

}
