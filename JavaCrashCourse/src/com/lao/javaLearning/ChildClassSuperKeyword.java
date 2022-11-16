package com.lao.javaLearning;

public class ChildClassSuperKeyword extends SuperKeyword  {

	String word;
	String Sentence;


	public ChildClassSuperKeyword(String words, String Sentences){
		
		//here super() keyword is automatically created when extends keyword is used;

		this.word=words;
	this.Sentence=Sentences;

		System.out.println("I am child  "  +word+"  "+Sentence);

	}

	public static void main(String[] args) {
		ChildClassSuperKeyword example = new ChildClassSuperKeyword("hibye","this is a sentence");


	}

}
