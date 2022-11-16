package com.lao.stringConcepts;

public class StringMethodsExample {
public void take() {
	
}
	
	static String name = "  Arunprasath  ";
static	int num = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//charAt
		System.out.println(name.charAt(2));
		
		
		//length
		System.out.println(name.length());
		
		//equals
		System.out.println(name.equals("arunprasath"));
		
		//equalsIgnoreCase
		
		System.out.println(name.equalsIgnoreCase("  arunprasath  "));
		
		//concat
		System.out.println(name.concat("Fire"));
		
		
		//contains
		System.out.println(name.contains("A"));
		
		//isEmpty
		System.out.println(name.isEmpty());
		
		//valueOf
		System.out.println(String.valueOf(num));
		
		//toUpperCase
		System.out.println(name.toUpperCase());
		
		//toLowerCase
		System.out.println(name.toLowerCase());
		
		
		//substring
		
		System.out.println(name.substring(5));
		
		//substring( , )
		System.out.println(name.substring(5,9));
		
		//indexOf
		System.out.println(name.indexOf("a"));
		
		System.out.println(name.indexOf('a',2));
		
		System.out.println(name.indexOf("unp"));
		
		System.out.println(name.indexOf("unp",2));
		
		
		//trim
		System.out.println(name.trim());
		
		//replace
		//replaces all the "a" in the string
		System.out.println(name.replace("a", "l"));
		
		
		//join
		
		System.out.println(String.join("-","Learn","Automation","Online"));
		
		//split
		
		String toSplit = "Learn,Automation,Online";
		String[] splitted=toSplit.split(",");
		
		
		for (String Iterated : splitted) {
			System.out.println(Iterated);	
		}
	
		

	}

}
