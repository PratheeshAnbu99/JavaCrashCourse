package com.lao.exception_handling;

public class UnCheckedExceptionExample {
	
	
	static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		System.out.println(name.length());
		//here Null-Pointer exception will occur when run...
		//here Null pointer exception is indicated only while the run time and not while the compilation process 
		//so its a UnChecked Exception or RunTimeException....
		

	}

}
