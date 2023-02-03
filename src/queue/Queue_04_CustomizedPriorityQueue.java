package queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue; 

/* In this class we created and Added some obj of OctBatch class so that we can see in 
 * PriorityQuue obj are stored in Priority basis what we implemented in CompareSt class (in overridden Compare() method
 */
//Note: Also see CompareSt class


public class Queue_04_CustomizedPriorityQueue {

	public static void main(String[] args) {
		// crated some objs of OctBatch class

		OctBatch st1 = new OctBatch("Noman", 100);
		OctBatch st2 = new OctBatch("Mahmuda", 98);
		OctBatch st3 = new OctBatch("Sohag", 80);
		
		
	
		
		//PriorityQueue Obj creation as <OctBath> generic type
		Queue<OctBatch>  queue =new PriorityQueue<>(new CompareSt());
		//added OctBatch obj as element
		queue.add(st1);
		queue.add(st2);
		queue.add(st3);
		
		//checking which element at the top--to see diff order we can change the logic in CompareSt class (in compare() like positive 1 and negative 1 vice a versa 
		//	System.out.println(queue.peek().name);
		
		queue.forEach(o->System.out.println(o.name+"-"+o.result));
		
		
	
		
		
		

	}

}
