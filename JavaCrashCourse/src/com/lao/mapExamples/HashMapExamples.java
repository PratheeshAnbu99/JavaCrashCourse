package com.lao.mapExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {


	public void methodsOfHashMap() {
		Map< String, Integer> hashMap = new HashMap< String, Integer>();

		//put
		hashMap.put("Hiii", 1);
		hashMap.put("Hello", 3);
		hashMap.put("Heyyy", 2);
		hashMap.put("welcome", 10);

		System.out.println("Put method  :"+hashMap);
		System.out.println("--------------------------");

		//putAll
		Map< String, Integer> hashMap1 = new HashMap< String, Integer>();
		hashMap1.putAll(hashMap);
		System.out.println(hashMap1);
		System.out.println("--------------------------");

		//clear
		hashMap1.clear();
		System.out.println(hashMap1);
		System.out.println("--------------------------");


		//IsEmpty
		System.out.println(hashMap1.isEmpty());

		//containsKey

		System.out.println(hashMap.containsKey("Hello"));

		//ContainsValue
		System.out.println(hashMap.containsValue(10));

		//clone
		//	clone  method is specific to hashMapClass so that is casted here
		((HashMap) hashMap).clone();
		System.out.println("clone  :"+hashMap);

		//keySet
		System.out.println("KeySet  :"+hashMap.keySet());

		//get
		System.out.println("Get Mthd  :"+hashMap.get("Hiii"));

		//values
		System.out.println("Values  :"+hashMap.values());

		//EntrySet
		System.out.println("EntrySet  :"+hashMap.entrySet());



	}

	public static void main(String[] args) {
		HashMapExamples examples = new HashMapExamples();
		examples.methodsOfHashMap();


	}

}
