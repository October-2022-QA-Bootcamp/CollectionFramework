package list;
import java.util.ArrayList;
import java.util.Iterator;

/*
 In this class we will check diff approaces to get elements from the arraylist obj*/

public class List_5_ArrayList_diffApproachToGetElement {

	public static void main(String[] args) {
		//creating arraylist obj
		ArrayList<String> arrayList1 = new ArrayList<>();
		//adding elements
		arrayList1.add("Sohag"); 
		arrayList1.add("Sonia"); 
		arrayList1.add("Nabeel"); 
		arrayList1.add("Dakpa"); 
		
		
		
		System.out.println("//by using get()-- single element *******");
		System.out.println(arrayList1.get(3));
		
		
		
		System.out.println("//by using for loop to get all elements ****");
		for(int i=0;i<4;i++) {
			System.out.println(arrayList1.get(i));
		}
		
		
		System.out.println("//by using for each/advanced loop to get all elements**********");
		for(String n:arrayList1) {
			System.out.println(n);
		}
		
		//iterator()----this is a method available in collection--it will return Iterator type
		System.out.println("//by using for while loop**+ iterator()********");
		
		Iterator<String>it=arrayList1.iterator(); //iterator() will return Iterator type obj

		while (it.hasNext()) { //hasNext() method in Iterator will confirms next elements is available
			System.out.println(it.next()); //next() methos in Iterator will get the next element
			
		}
		
		System.out.println("//By using forEach() method we get all elements**********");
		//from java 1.8 this method is added in colleciton (in iterable interface
		//we are passing Consumer obj by using Lambda express
		arrayList1.forEach(n->System.out.println(n));
		
		
	}

}
