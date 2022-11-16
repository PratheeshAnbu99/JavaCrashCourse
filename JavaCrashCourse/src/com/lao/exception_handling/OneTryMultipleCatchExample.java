package com.lao.exception_handling;

public class OneTryMultipleCatchExample {
	
	static String name;
	
	public static void main(String[] args) {
		try {
			int a = 2;
			int b = 3;
			int result=a+b;
			System.out.println(result);
			
			
			System.out.println(name.length());
			
			
			
			
		}catch(ArithmeticException e){
			
			System.out.println("arithmetic exception");
			
		}
		
		catch(NullPointerException e){
			System.out.println("NullPointerException");
			
		}
		
		catch(Exception e) {
			System.out.println("Exception");
			
		}
	}

}
