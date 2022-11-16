package com.lao.javaLearning;

public class ConstructorOverLoadingExample {
	
		String toWrite;
	ConstructorOverLoadingExample(){
		System.out.println("It's a No Args Constructor");
	}
		
		ConstructorOverLoadingExample(String statement){
			
			toWrite=statement;
			System.out.println("This is a Parameterized Constructor  "+ toWrite);
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverLoadingExample example = new ConstructorOverLoadingExample();
		ConstructorOverLoadingExample example2 = new ConstructorOverLoadingExample("Beleive Me!!!");
	}

}
