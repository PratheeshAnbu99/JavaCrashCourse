package com.lao.javaLearning;



public  class ReturnType {
	
	static double x ;
	int amountToBeCollected= 1000;
	public int collectedAmount() {
		System.out.println("Amount received : "+amountToBeCollected);
		return amountToBeCollected;
		
	}

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ReturnType collectMoney = new ReturnType(); 
		  int receivedeMoney =  collectMoney.collectedAmount(); 
		  System.out.println("HandOvered Money : "+  receivedeMoney);
		 
    System.out.println(collectMoney.amountToBeCollected);  
    
    System.out.println(x);
    
	}

}
