package com.lao.polymorphism;

public class TheWayWeTalk {
	
	
	public void talk(Parents WayOfTalking) {
		System.out.println("Humble");
		
	}
	
	
    public void talk(Partner WayOfTalking) {
    	System.out.println("Love And Romantic");
		
	}
    
    
    public void talk(Boss WayOfTalking) {
    	System.out.println("Professional");
		
   	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TheWayWeTalk weTalk = new TheWayWeTalk();
		
		Parents parents=new Parents();
		weTalk.talk(parents);
		
		
		Partner partner = new Partner();
		weTalk.talk(partner);
		
		Boss boss = new Boss();
		weTalk.talk(boss);
		
	}

}
