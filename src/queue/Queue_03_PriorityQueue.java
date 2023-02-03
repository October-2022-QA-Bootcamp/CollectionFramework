package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_03_PriorityQueue {

	public static void main(String[] args) {
		
		Queue<Integer> queue1 =new PriorityQueue<>();
		queue1.add(601);
		queue1.add(101);
		queue1.add(501);
		queue1.add(401);
		queue1.add(901);
		
		System.out.println(queue1.size());//2
		
		System.out.println(queue1.peek()); //101
		
		
		
		
		Queue<Integer> queue =new PriorityQueue<>();
		queue.add(701);
		queue.add(801);
		System.out.println(queue.equals(queue));
		System.out.println(queue.size());//2
		
		
		queue.addAll(queue1);
		System.out.println(queue.size());//7
		
		
	}

}
