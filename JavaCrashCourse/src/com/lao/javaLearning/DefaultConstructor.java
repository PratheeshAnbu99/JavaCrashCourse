package com.lao.javaLearning;

public class DefaultConstructor {


	Long accountNumber = 12345678901l;
	String accountHolderName="FireKumar";
	static	int balance= 560;
	


	public void getBalance() {
		System.out.println("Available Balance  "+ balance);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(balance);
//to call a method in class outside the main method object of classname is created;
		
		DefaultConstructor account = new DefaultConstructor();
		account.getBalance();
		
		byte[] name =	account.accountHolderName.getBytes();
		System.out.println(name);

		//to call a data type its wrap class is called
		Integer integer = new Integer(balance);
		System.out.println(integer);
		
		




	}

}
