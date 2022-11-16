package com.lao.exception_handling;

public class TryCatchFinallyExample {
	
	static String name;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 2;
			int b = 0;
			int result=a/b;
			System.out.println(result);
			
			//once exception occurs in try block it will be directed to respected catch block and further executions in try block will not get executed..
			//but finally gets executed even exception occurs in try block..
			
			System.out.println(name.length());
			
			
			
			
		}catch(ArithmeticException e){
			
			System.out.println("arithmetic exception");
			
		}
		
		catch(NullPointerException e){
			System.out.println("NullPointerException");
			
		}
		
		catch(Exception e) {
			System.out.println("Exception");
			
		}finally{
			
			System.out.println("In final");
			
			System.out.println("in"+"   Final");
			
		}

	}

}
