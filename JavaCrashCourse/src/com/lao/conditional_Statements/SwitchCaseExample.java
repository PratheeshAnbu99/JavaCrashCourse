package com.lao.conditional_Statements;

public class SwitchCaseExample {
	
	String superBike;
	
	public SwitchCaseExample(String Bmw){
		  superBike=Bmw;
		switch (superBike) {
		case "Ducati":
			System.out.println("This is Ducatti");
			break;
			
		case "R1":
			System.out.println("This is R1");
			break;
			
		case "S1000rr":
			System.out.println("This is SuperBike S1000rr");
			break;
		case "Zx10r":
			System.out.println("Here comes Greeny");
			break;


		default:
			System.out.println("Superbike Absent");
			
		}
		
	}
	public static void main(String[] args) {
		SwitchCaseExample example = new SwitchCaseExample("S1000rr");

	}

}
