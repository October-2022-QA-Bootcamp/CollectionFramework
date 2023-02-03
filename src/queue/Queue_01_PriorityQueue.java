package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_01_PriorityQueue {

	public static void main(String[] args) {
		Queue<String> queue =new PriorityQueue<>();
		//PriorityQueue---internally having priority machanism 
		
		//for String----A-Z alphabetic order
		
		queue.add("Mahmuda");
		queue.add("Noman");
		queue.add("Sohag");
		queue.add("Abbas");
		queue.offer("Baker");
		
		
		//what element is the head
		
		System.out.println(queue.peek()); 
		//for integer---ascending order
		Queue<Integer> queue1 =new PriorityQueue<>();
		queue1.add(601);
		queue1.add(101);
		queue1.add(501);
		queue1.add(401);
		queue1.add(901);
		
		System.out.println(queue1.peek()); //101
	}

}
