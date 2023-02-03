package queue;

import java.util.PriorityQueue;
import java.util.Queue;

/*In this class we will check using of some conditional methods*/

public class Queue_02_PriorityQueue {

	public static void main(String[] args) {
		//adding elements
		Queue<Integer> queue1 =new PriorityQueue<>();
		queue1.add(601);
		queue1.add(101);
		queue1.add(501);
		queue1.add(401);
		queue1.add(901);
		
	
		//before serving we are checking it waiting q is not empty
		for(int i=0;i<10;i++) {
		if(!queue1.isEmpty()) {
		System.out.println(queue1.poll());
		
		}		}
		
	
		if(queue1.contains(501)) {
			System.out.println("Lets start game");
		}
		
		
		
	}

}
