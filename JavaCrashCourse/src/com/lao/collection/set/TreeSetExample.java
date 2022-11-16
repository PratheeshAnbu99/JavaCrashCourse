package com.lao.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {



	public void methodsOfTreeSet() {


		TreeSet<Integer> treeSet = new TreeSet<>();



		//add
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(6);
		treeSet.add(0);
		treeSet.add(7);
		System.out.println(treeSet.add(5));
		System.out.println("Add method   :"+ treeSet);
		System.out.println("--------------PK---------------");

		//first
		System.out.println("First element  :" +treeSet.first());

		System.out.println("--------------PK---------------");


		//last
		System.out.println("Last element  : "+ treeSet.last());
		System.out.println("--------------PK---------------");




		//headset
		System.out.println("Headset  :"+treeSet.headSet(3));
		System.out.println("--------------PK---------------");


		//tailSet
		System.out.println("Tailset  :"+treeSet.tailSet(3));
		System.out.println("--------------PK---------------");





		//subSet
		System.out.println("SubSet values  :"+treeSet.subSet(2, 7));
		System.out.println("--------------PK---------------");


		//Comparator

		System.out.println("Comparator  :"+treeSet.comparator());
		System.out.println("--------------PK---------------");


		//higher
		System.out.println("Higher Value  :"+treeSet.higher(3));
		System.out.println("--------------PK---------------");


		//Lower

		System.out.println("Lower Value  :"+treeSet.lower(3));
		System.out.println("--------------PK---------------");


		//pollFirst
		System.out.println("Poll first  :"+ treeSet.pollFirst());
		System.out.println(treeSet);

		//PollLast
		System.out.println("Poll last  :"+treeSet.pollLast());
		System.out.println(treeSet);

		System.out.println("--------------PK---------------");

		//ceiling
		System.out.println("Ceiling  :"+ treeSet.ceiling(4)	);	
		//descending-set
		System.out.println(treeSet.descendingSet());

		//floor
		System.out.println(treeSet.floor(10));





	}


	public void IteratorExample() {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(6);
		treeSet.add(0);
		treeSet.add(7);

		Iterator<Integer> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());

		}


		Iterator<Integer> descIterator = treeSet.descendingIterator();
		while(descIterator.hasNext()) {
			System.out.println(descIterator.next());

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSetExample example = new TreeSetExample();
		example.methodsOfTreeSet();
		example.IteratorExample();

	}

}
