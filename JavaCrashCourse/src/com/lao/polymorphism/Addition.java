package com.lao.polymorphism;

public class Addition {
	
	
	
	public int add(int a, int b){
		return a+b;
	
	}
	
	
	public int add(int a, int b,int c){
		return a+b-c;
		
	}
	
	protected float add(float a, float b){
		return a+b;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition addition = new Addition();
	System.out.println(addition.add(20, 10)+" - "+"this is first add ");
	
	System.out.println(addition.add(20,10, 5)+" - "+"this is second add ");
	
	System.out.println(addition.add(25,35 )+" - "+"this is third add ");
		
		
		

	}

}
