package com.lao.static_keyWord;

public class StaticVariable {
	
	static int price;
	
	
	
	  public  void price1() {
	  System.out.println(price=1000); 
	  }
	  
	 public  void price2(){
	  System.out.println(price=2000);
	 
	 }
	 
	
	
	//when syso the value will be as mentioned as in print statement;
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariable staticVariable = new StaticVariable();
		staticVariable.price1();
		staticVariable.price2();
		
		
		
		staticVariable.price= 1000;
		
		
		StaticVariable staticVariable2 = new StaticVariable();
		staticVariable2.price= 3000;
		
		System.out.println(staticVariable.price);
		System.out.println(staticVariable2.price);
		
	

		
		
	}

}
