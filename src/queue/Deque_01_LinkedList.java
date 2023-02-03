package queue;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_01_LinkedList {

	public static void main(String[] args) {
		//creating the obj
		
		Deque<Integer> dq =new LinkedList<>();
		dq.add(101); //add element
		dq.add(105);
		dq.add(100);
		dq.offer(109); //add element
		dq.add(107);
		dq.offer(1010);
		
		
		//getting the top element
		System.out.println(dq.peek());
		
		//getting all elements in 
		dq.forEach(n->System.out.println(n));
		
		
	}

}
