package com.lao.javaLearning;

public class ParameterizedConstructor {
	
	
	String animal_Name;
	String animal_Type;
	
	ParameterizedConstructor(String name ,String type){
		animal_Name=name;
		animal_Type=type;
		//because name and type are local variables they can't be called in main method or any other methods ..so its populated to instance variable;
		 System.out.println(name+"  "+type); 
	}
	
	public void printIt() {
		System.out.println("Animal name is :  "+ animal_Name +"  Animal type is   :" + animal_Type );
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ParameterizedConstructor constructor = new ParameterizedConstructor("Black Racer", "R15");
		constructor.printIt();
		
		ParameterizedConstructor constructor2 = new ParameterizedConstructor("Black Racer PK ", "R15V3");
		constructor2.printIt();
		
	
		
	}

}
