package com.lao.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {





	public void methodsOfHashSet() {
		HashSet<String> hashset = new HashSet<String>();


		//add
		hashset.add("hello");
		hashset.add("hi");
		hashset.add("hello");
		hashset.add("welcome");
		hashset.add("thankYou");
		System.out.println(hashset);


		//remove()
		hashset.remove("welcome");
		System.out.println(hashset);
		

		//contains

		System.out.println(hashset.contains("hello"));	

		//isEmpty
		System.out.println(hashset.isEmpty());
		
		

		//addAll
		HashSet<String> hashset1 = new HashSet<String>();
		hashset1.addAll(hashset);
		System.out.println("HashSet1  :"+hashset1);

		//size
		System.out.println(hashset.size());

		//clear

		
		hashset1.clear();
		System.out.println(hashset1);


		//containsAll
		System.out.println(hashset1.containsAll(hashset));


		//iterator
		Iterator<String> iterator = hashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());

		}


		//forEach

		for (String iterated : hashset) {

			System.out.println("For each  :"+iterated);

		}

		//equals

		System.out.println(	"equals    "+hashset.equals(hashset1));



		//toArray
		hashset.toArray();

		System.out.println(hashset);






	}




	public static void main(String[] args) {
		HashSetExample example = new HashSetExample();
		example.methodsOfHashSet();




	}

}
