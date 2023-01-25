package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_01_HashSet {

	public static void main(String[] args) {

		// Set can contains unique element
		Set<Integer> set = new HashSet<Integer>(); // internally it creates a map
		set.add(101);
		set.add(105);
		set.add(101);// duplicate not possible
		set.add(107);
		set.add(108);
		set.add(0);// one null is possible

		// Printing set---there is no method to get specific element
		System.out.println(set);

		// another set obj
		Set<String> colorSet = new HashSet<>();
		colorSet.add("Red");
		colorSet.add("Red");// duplicate
		colorSet.add("Blue");
		colorSet.add("Green");
		colorSet.add("Yellow");
		colorSet.add("White");
		colorSet.add(null);// null

		// pring set
		System.out.println(colorSet);
		// pring size
		System.out.println(colorSet.size());
		// clear all element from the set obj
		// colorSet.clear();

		// checking isEmpty method
		System.out.println(colorSet.isEmpty());
		
		
		// forEach()----method added in java 1.8
		System.out.println("*******using forEach()*********");
		colorSet.forEach(n -> System.out.println(n));

		// using iterator to print all element from set obj
		Iterator<String> it = colorSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("*****************");

		// using for each loop--print all elements
		for (String c : colorSet) {
			// puting a condition before print
			if (!c.contains("Red")) {
				System.out.println(c);
			}
		}

		System.out.println("*******cheking by isEmpty()**********");
		// using condition by using sEmpty() and after that using for each loop to print element(if condition met)
		if (colorSet.isEmpty()) {
			for (String c : colorSet) {
				System.out.println(c);

			}
		}

		System.out.println("*****appling isEmpty() to check element is there or not************");
	
		if (colorSet.isEmpty()) {
			// true
			System.out.println("there is no test data");
		} else {
			System.out.println("there is a test data---lets test it");
		}
		
		//we can aslo check specific element present or not by using contains() method
		System.out.println(colorSet.contains("Red"));
		;

	}

}
