package com.lao.abstraction;

public class Bmw extends Car implements UpComingProjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car car = new Bmw();
		car.engineSecret();
		car.companyVault();
		//when we hover the mouse over the method name here it will be directed to the abstract class not to the overrided method here;
		//this is the process of hiding the implementation of abstraction...

		UpComingProjects projects = new Bmw();
		projects.project1();
		projects.project2();
		
	}

	@Override
	public void engineSecret() {
		System.out.println("this is my engine secret");
		
	}

	@Override
	public void companyVault() {
		// TODO Auto-generated method stub
		System.out.println("this is my company vault");
		
	}

	@Override
	public void project1() {
		// TODO Auto-generated method stub
		System.out.println("this is project1");

	}

	@Override
	public void project2() {
		// TODO Auto-generated method stub
		System.out.println("this is project2");

	}
	
	
	

}
