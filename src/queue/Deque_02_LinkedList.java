package queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Deque_02_LinkedList {

	public static void main(String[] args) {
		//creating the obj
		
		Deque<Integer> dq =new LinkedList<>();
		dq.add(101);
		dq.offer(109);
		dq.add(107);
		dq.offer(1010);
		dq.addFirst(599); //2nd element
		dq.addFirst(600); //first element
		dq.addLast(200);
		dq.add(105);
		
		System.out.println(dq.poll());//it will remove the top element---when not found---it returns null
		System.out.println(dq.remove());//it will remove the top element----when not found (empty)---thowing exception
		
		dq.forEach(e->System.out.println(e));
		
		System.out.println("***************");
		
		
		Iterator<Integer> it=dq.descendingIterator();  //which way data get inserted --it returns opposite way
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
	}

}
