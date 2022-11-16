package com.lao.exception_handling;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class TryCtachFinallyFile {
	
	static String Filelocation = "ReadMe.txt";
	
	static BufferedReader reader=null;
	static FileReader reader1 =null;

  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			reader1 = new FileReader(Filelocation);
		reader = new BufferedReader(reader1);
		
		String readedLine;
		while((readedLine =	reader.readLine())!=null) {
			System.out.println(readedLine);
		}
			
		

	}catch (IOException e){
		e.printStackTrace();
		
	}
	finally {
		try {
			if(reader!=null)
				reader.close();
			
			if(reader1!=null)
				reader1.close();
			
		}catch (IOException e){
			e.printStackTrace();
			
		}
	}

}}
