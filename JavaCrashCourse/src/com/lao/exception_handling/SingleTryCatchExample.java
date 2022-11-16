package com.lao.exception_handling;

public class SingleTryCatchExample {
	
	public static void main(String[] args) {
		try{
			
			System.out.println("Inside Try Method");
			System.out.println(2/0);
			
		}catch(ArithmeticException e){
		
			System.out.println("There occurs an exception");
			
		}
		
}

}
