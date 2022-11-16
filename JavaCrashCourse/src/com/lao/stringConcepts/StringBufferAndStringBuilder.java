package com.lao.stringConcepts;

public class StringBufferAndStringBuilder {

	static StringBuffer buffer = new StringBuffer("Shark");
	
	static StringBuilder builder = new StringBuilder("BuilderPro");
	
	
	public static void main(String[] args) {
		
		//append
		System.out.println(buffer.append("VsWhale"));
		
		//Reverse
		System.out.println(buffer.reverse());
		//as stringBuilder and StringBuffer are mutable once reversed  will be saved as such and further operations take place with reversed string so 
		//here again reverse function is used so that the value will be in correct order again....
		buffer.reverse();
		
		
		//Replace
		System.out.println(buffer.replace(1,4,"tac"));
		
		//both StringBuilder and StringBuffer have same methods so both are used here
		//delete
		System.out.println(builder.delete(5, 7));
		
		
		//Insert
		System.out.println(builder.insert(0, "HereComes - "));
		
		//capacity
		System.out.println(builder.capacity());
		
		
	
	}
}
