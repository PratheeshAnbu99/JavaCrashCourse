package com.lao.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	
	
	
	public void methodExample() {
		
		
		Set set = new LinkedHashSet();
		
		set.add(10);
		set.add("hiii");
		set.add(0.50);
		set.add("byeeee");
		
		
		
		System.out.println(set);
		
		// insertion order is maintained in linked-hash-set ...to depict that add method alone is used here...
		
		//all other methods are as same as HashSet refer hash-set program...
		
	
	}
	
	public static void main(String[] args) {
		
		LinkedHashSetExample example = new LinkedHashSetExample();
		example.methodExample();
		
	}
}
