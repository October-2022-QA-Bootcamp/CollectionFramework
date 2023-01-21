package list;

import java.util.LinkedList;

public class List_9_LinkedList_UseSomeMethods {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList=new LinkedList<>();
		//usin add() to add element
		linkedList.add(5);
		linkedList.add(15);
		linkedList.add(25);
		linkedList.add(35);
		linkedList.add(45);
		
		
		
		//using----get() to get element
		
		System.out.println(linkedList.get(1));
		
		
		//using----size() to check the size --how many elements 
		System.out.println(linkedList.size());
		
		//using contains() to check it is the collection or not
		System.out.println(linkedList.contains(45));//true
		
		
		//check collection is emepyt or not
		System.out.println(linkedList.isEmpty());
		
		//having 2nd linkedlist
		LinkedList<Integer> linkedList1=new LinkedList<>();
		linkedList1.add(100);
		
		//now adding all elements from first linkedlist 
		linkedList1.addAll(1, linkedList);
		
		
		//now if we check index-2:
		System.out.println(linkedList1.get(2));
	
		//cloing and type casting
		LinkedList<Integer>	linkedlist2=(LinkedList<Integer>) linkedList1.clone();
		
		//check element in linkedlist2
		System.out.println(linkedlist2.get(5));
		
		//using isEmpty method to check colleciton is empty or not
		System.out.println(linkedList1.isEmpty());//false
		
		
		if(linkedList1.isEmpty()) {
			System.out.println("Nothing to do.....obj is empty");
		}else {
			
			linkedList1.clear();
			//System.out.println("removing item-"+arrayList.remove(i));
			
			
		}
		
		

	}

}
