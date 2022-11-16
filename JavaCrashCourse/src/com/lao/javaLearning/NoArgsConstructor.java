package com.lao.javaLearning;

public class NoArgsConstructor {



	int employeeId;
	String employeeName;


	NoArgsConstructor(){
		employeeId=1234;
		employeeName="Power Pandi";

		System.out.println("EmployeeID  :"+employeeId + "  EmployeeName  :"+employeeName);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		NoArgsConstructor detailsExample = new NoArgsConstructor();
		/*
		 * System.out.println("EmployeeID  :" +detailsExample.employeeId+
		 * "  EmployeeName  : " + detailsExample.employeeName);
		 */


		/*if we write a constructor of our own then just  creating  an object for class in the
		 *main method will do the functions in the constructor we wrote..
		 *we can also do the functions with the help of the object created.
		 *
		 */

	}

}
