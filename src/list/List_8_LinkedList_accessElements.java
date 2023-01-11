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
		
		
		for(int i=0;i<linkedList.size();i++) {
			System.out.println(linkedList.get(i));
		}
		
		for(int n:linkedList) {
			System.out.println(n);
		}
		
		Iterator<Integer> it=linkedList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		linkedList.forEach((n)->{System.out.println(n);});
		
		
		
		
		

	}

}
