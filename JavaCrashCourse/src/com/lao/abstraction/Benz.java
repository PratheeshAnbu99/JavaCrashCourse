package com.lao.abstraction;

public class Benz extends Car implements UpComingProjects,Interface2{


	@Override
	public void engineSecret() {
		System.out.println("Benz secret");

	}

	@Override
	public void companyVault() {
		// TODO Auto-generated method stub
		System.out.println("Benz company vault");

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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Car car = new Benz();
		car.companyVault();
		car.engineSecret();

		System.out.println(projectName);
		
		
		
		UpComingProjects projects = new Benz();
		
		projects.project1();
		projects.project2();
	}

}

