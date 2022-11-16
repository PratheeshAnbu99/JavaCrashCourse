package com.lao.conditional_Statements;

public class IfElseIfStatmentExample {
	String superCar ;
	IfElseIfStatmentExample(String carName){
		superCar = carName;
		
		if(superCar.equals("Bugatti")) {
			System.out.println("This is Bugatti not Camry");
			
		}else if(superCar.equals("Lamborgini")) {
			System.out.println("This is Lamborgini not Camry");
			
		}else if(superCar.equals("Camry")) {
			System.out.println("Match Found..Lets drive");
			
	}else {
		System.out.println("No Car Matches Camry!!!");
	}
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IfElseIfStatmentExample example = new IfElseIfStatmentExample("Camry");
		/*
		 * IfElseIfStatmentExample example2 = new IfElseIfStatmentExample("Bugatti");
		 */
		
		

	}

}
