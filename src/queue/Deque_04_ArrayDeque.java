package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthSliderUI;


/*In this class we will create obj of Deque implemented by ArrayDeque class
 *Please see class note to understand the diff betweesd implemention by LinkedList and ArrayDeque class
 Please check other mehtods to use like Dqque implemention by LinkedList class*/

public class Deque_04_ArrayDeque {

	public static void main(String[] args) {
		Deque<Integer> qDeque = new ArrayDeque<Integer>();
		qDeque.add(101);
		qDeque.offer(100);
		qDeque.addFirst(102);
		qDeque.addLast(5000);
		qDeque.offerLast(88);
		qDeque.offerFirst(96);
		
		System.out.println(qDeque.peek()); //96
		
		System.out.println("**********************");
		
		//for each loop
		for(int q:qDeque) {
			System.out.println(q);
		}
		
		System.out.println("**********************");
		
		//forEach()
		qDeque.forEach(n->System.out.println(n));
		
		System.out.println("**********************");
		Iterator<Integer> it=qDeque.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		
	}

}
