package list;

import java.util.Iterator;
import java.util.LinkedList;

public class List_8_LinkedList_accessElements {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList=new LinkedList<>();
		linkedList.add(5);
		linkedList.add(15);
		linkedList.add(25);
		linkedList.add(35);
		linkedList.add(45);
		
		
		//different approach to get accessed of the element in the list
		//for loop
		for(int i=0;i<linkedList.size();i++) {
			System.out.println(linkedList.get(i));
		}
		
		//for each loop
		for(int n:linkedList) {
			System.out.println(n);
		}
		
		//iterator mehtod
		Iterator<Integer> it=linkedList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//forEach()
		linkedList.forEach((n)->{System.out.println(n);});
		
		
		
		
		

	}

}
