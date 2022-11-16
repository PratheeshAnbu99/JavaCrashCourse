package com.lao.collection.list;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		List<String> arrayList = new ArrayList<String>();

		//add
		arrayList.add("Bugatti");
		arrayList.add(1, "Ferrari");
		arrayList.add(2, "Lamborgini");
		arrayList.add("Benz");


		arrayList.add(3, "Lamborgini");
		//	arrayList.add(null);
		System.out.println(arrayList);


		//sort
		//to use this list should not contain null value because sorting can't be done if there is a null value
		Collections.sort(arrayList);
		System.out.println("sorted list  "+ arrayList);


		//subList
		System.out.println("subLIST   :"+arrayList.subList(2, 4));


		//get	
		System.out.println("Get method1  :"+arrayList.get(0));	
		System.out.println("Get method1  :"+arrayList.get(3));	
		//indexof
		System.out.println(arrayList.indexOf("Ferrari")); 

		System.out.println(arrayList.indexOf("Chevrolet"));
		System.out.println("LastIndex	Of  :" +arrayList.lastIndexOf("Lamborgini"));
		System.out.println("FirstIndex	Of  :" +arrayList.indexOf("Lamborgini"));




		List<String> newArrayList = new ArrayList<String>();
		//addAll
		newArrayList.addAll(arrayList);

		System.out.println(newArrayList);

		//CLEAR
		newArrayList.clear();
		System.out.println(newArrayList);

		//remove
		arrayList.remove(0);
		System.out.println(arrayList);

		arrayList.remove("Ferrari");
		System.out.println(arrayList);

		//set
		arrayList.set(1, "Porsche");
		System.out.println(arrayList);

		//isEmpty
		System.out.println(arrayList.isEmpty());


		//Iterate:


		for (String Iterated : arrayList) {

			System.out.println("Using forEach Loop  :"+ Iterated);

		}
		System.out.println("------------------------------------------------------------------------");


		for (int i =0;i<arrayList.size();i++) {
			System.out.println("Using for loop  :"+arrayList.get(i));

		}
		System.out.println("------------------------------------------------------------------------");


		ListIterator< String> iteratorListIterator = arrayList.listIterator();
		while (iteratorListIterator.hasNext()) {
			System.out.println(iteratorListIterator.next()); 

		}
		System.out.println("------------------------------------------------------------------------");
		while(iteratorListIterator.hasPrevious()){
			System.out.println(iteratorListIterator.previous());


		}

		System.out.println("------------------------------------------------------------------------");


		Iterator<String> iterator = arrayList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());





		}

		System.out.println("------------------------------------------------------------------------");


		/*
		 * CopyOnWriteArrayList<String> arrayList2= new CopyOnWriteArrayList<String>();
		 * arrayList2.add("pen"); arrayList2.add("pendrive");
		 * 
		 * Iterator< String > iterator2 = arrayList2.iterator();
		 * 
		 * 
		 * while(iterator2.hasNext()) { System.out.println(iterator2.next());
		 * 
		 * arrayList2.add("pencil"); arrayList2.add("eraser");
		 * 
		 * System.out.println(arrayList2); }
		 */










	}

}
