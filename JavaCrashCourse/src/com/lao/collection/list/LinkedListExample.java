package com.lao.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {


	public void methodsOfLinkedList() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		
		//add
		linkedList.add(123);
		linkedList.add(69);
		linkedList.add(99);
		linkedList.add(678);
		linkedList.add(456);
		linkedList.add(234);
		System.out.println("add method   :"+linkedList);

		System.out.println("-------------------------------------------------");

		//addFirst
		linkedList.addFirst(69);

		System.out.println("addFirst method  :"+ linkedList);
		System.out.println("-------------------------------------------------");

		//AddLast

		linkedList.addLast(63);

		System.out.println("addLast method  :"+ linkedList);
		System.out.println("-------------------------------------------------");


		//get(0);

		System.out.println("get(0) method  :"+ linkedList.get(0));
		System.out.println("-------------------------------------------------");


		//getFirst


		System.out.println("getFirst method  :"+ linkedList.getFirst());
		System.out.println("-------------------------------------------------");

		//get()

		System.out.println("get() method  :"+ linkedList.get(2));
		System.out.println("-------------------------------------------------");


		//RemoveFirst

		System.out.println("removeFirst method  :"+ linkedList.removeFirst());
		System.out.println("-------------------------------------------------");


		//removeLast

		System.out.println("removeLast method  :"+ linkedList.removeLast());
		System.out.println("-------------------------------------------------");


		//poll
		linkedList.poll();
		System.out.println("poll method  :"+ linkedList);
		System.out.println("-------------------------------------------------");

		//pollLast
		linkedList.pollLast();
		System.out.println("PollLast method  :"+ linkedList);
		System.out.println("-------------------------------------------------");


		//remove
		linkedList.remove();
		System.out.println("remove method  :"+ linkedList);
		System.out.println("-------------------------------------------------");


		//removeFirstOccurrence
		linkedList.removeFirstOccurrence(99);

		System.out.println("removeFirstOccurrence method  :"+ linkedList);
		System.out.println("-------------------------------------------------");

		//removeLastOccurrence
		linkedList.removeLastOccurrence(678);
		System.out.println("removeLastOccurrence method  :"+ linkedList);
		System.out.println("-------------------------------------------------");



	}


	public void UsingFor() {

		LinkedList<String> forLinkedList = new LinkedList<String>();

		forLinkedList.add("Hero");
		forLinkedList.add("Heroine");
		forLinkedList.add("Villian");


		for(int i=0;i<forLinkedList.size();i++) {
			System.out.println("Using for loop  :"+forLinkedList.get(i)); 

			System.out.println("-------------------------------------------------");

		}
	}

	public void UsingForEach() {

		LinkedList<String> forEachLinkedList = new LinkedList<String>();

		forEachLinkedList.add("Hero");
		forEachLinkedList.add("Heroine");
		forEachLinkedList.add("Villian");

		for (String iterated1 : forEachLinkedList) {

			System.out.println("Using forEach loop  :"+iterated1); 

			System.out.println("-------------------------------------------------");
		}

	}	
	public void Uisngwhile() {

		LinkedList<String> WhileLinkedList = new LinkedList<String>();

		WhileLinkedList.add("Hero");
		WhileLinkedList.add("Heroine");
		WhileLinkedList.add("Villian");

		int i = 0;
		while(i<WhileLinkedList.size()) {

			System.out.println("Using While LOOP   : "+ WhileLinkedList.get(i));
			i++;
		}

	}
	public void usingDoWhile() {


		LinkedList<String> doWhileLinkedList = new LinkedList<String>();

		doWhileLinkedList.add("Hero");
		doWhileLinkedList.add("Heroine");
		doWhileLinkedList.add("Villian");

		int i = 0;



		do{
			System.out.println("Using DoWhileLoop  :"+doWhileLinkedList.get(i));


			i++;

		}while(i<doWhileLinkedList.size());

	}

	public void UsingIterator() {

		
		
		LinkedList<String> IteratorLinkedList = new LinkedList<String>();
		IteratorLinkedList.add(null);

		IteratorLinkedList.add("Hero");
		IteratorLinkedList.add("Heroine");
		IteratorLinkedList.add("Villian");


		/*
		 * Iterator<String> iterator = IteratorLinkedList.iterator();
		 * while(iterator.hasNext()) {
		 * 
		 * System.out.println("using Iterator  :"+iterator.next());
		 * 
		 * }
		 */
		
		ListIterator<String> iterator = IteratorLinkedList.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Using list iterator  :"+iterator.next());
			
		}
		
		Iterator<String> desIterator =IteratorLinkedList.descendingIterator();
		while(desIterator.hasNext()) {
			System.out.println(desIterator.next());
			
		}
	}
	
	










	public static void main(String[] args) {
		// TODO Auto-generated method stub


		LinkedListExample example =  new LinkedListExample();

		example.methodsOfLinkedList();
		example.UsingFor();
		example.UsingForEach();
		example.Uisngwhile();
		example.usingDoWhile();
		example.UsingIterator();
		
		
		
		//just an example for depicting retain-all function 
		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("Hero");
		linkedList.add("Heroine");
		linkedList.add("Villian");

		LinkedList<String> linkedList1 = new LinkedList<>();
		linkedList1.addAll(linkedList);
		linkedList1.add("superhero");
		System.out.println(linkedList1);
		
		//retain all
		linkedList1.retainAll(linkedList);
		System.out.println(linkedList1);

	}

}
