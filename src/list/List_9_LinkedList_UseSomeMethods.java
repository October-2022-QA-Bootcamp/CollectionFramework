package list;

import java.util.LinkedList;

public class List_9_LinkedList_UseSomeMethods {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList=new LinkedList<>();
		linkedList.add(5);
		linkedList.add(15);
		linkedList.add(25);
		linkedList.add(35);
		linkedList.add(45);
		
		
		
		//get()
		
		System.out.println(linkedList.get(1));
		
		System.out.println(linkedList.size());
		
		System.out.println(linkedList.contains(45));//true
		
		System.out.println(linkedList.isEmpty());
		
		
		LinkedList<Integer> linkedList1=new LinkedList<>();
		linkedList1.add(100);
		linkedList1.addAll(1, linkedList);
		
		
		
		
		System.out.println(linkedList1.get(2));
	
		
	LinkedList<Integer>	linkedlist2=(LinkedList<Integer>) linkedList1.clone();
		
		System.out.println(linkedlist2.get(5));
		
		System.out.println(linkedList1.isEmpty());//false
		
		
		if(linkedList1.isEmpty()) {
			System.out.println("Nothing to do.....obj is empty");
		}else {
			
			linkedList1.clear();
			//System.out.println("removing item-"+arrayList.remove(i));
			
			
		}
		
		

	}

}
