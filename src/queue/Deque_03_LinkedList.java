package queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Deque_03_LinkedList {

	public static void main(String[] args) {
		//creating the obj
		
		Deque<Integer> dq =new LinkedList<>();
		dq.add(101);//when there is no space--it throws exception
		dq.offer(109);//when there is no space--it returns false
		dq.add(107);
		dq.add(105);
		
		System.out.println(dq.poll());//it will remove the top element---when not found---it returns null
		System.out.println(dq.remove());//it will remove the top element----when not found (empty)---thowing exception
		System.out.println(dq.remove(107));//it will remove passing element----when not found returns false
		System.out.println(dq.element());//top element
		System.out.println(dq.peek());//top elements
		System.out.println(dq.peekFirst());//top elements---when empty returns null
		
		
		
	}

}
