package list;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.Random;

public class List_7_LinkedList_Basic {
	

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList=new LinkedList<>();
		linkedList.add(5);
		linkedList.add(15);
	//	linkedList.add(25);
		linkedList.add(35);
		linkedList.add(45);
		//adding in specific index
		linkedList.add(2, 500);
		
		//adding element by using random class
//		for(int i=0;i<5;i++) {
//			Random rm=new Random(100);
//			
//			linkedList.add(rm.nextInt());
//		}
//		
		
		System.out.println(linkedList.get(0));
		
		
		
	
		
		
		
		
		

	}

}
