package com.lao.polymorphism;

import java.io.IOException;

public class Son extends Parents {
	
	
	
	
	
	@Override
	public void marriage() {
		System.out.println(" Marrying my Love is my everything!!!");
		
		
		
	}
	


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		Parents parents=new Son();//syntax for dynamic polymorphism:parentsClass ref = new childClass();
		parents.properties();
		
		parents.marriage();
        
	}

}
