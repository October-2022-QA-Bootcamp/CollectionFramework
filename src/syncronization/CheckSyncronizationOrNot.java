package syncronization;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;


public class CheckSyncronizationOrNot {
	
	//As we knkow ArrayList is not syncronized---if we use same obj at a time and manupulate 
	//arraylist obj will not get correct manupulated result
	
	
	//creating arraylist obj
	public static Stack<Integer> list=new Stack<>();
	
	// addElement method---when this method will be invoked it will add  one element
	public static void addElement() {
		list.add(1);
	}
	

	public static void main(String[] args) {
		
		
		
		//creating Threads
		//1st Thread
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				
				// this loop
				for(int i=0;i<1000;i++) {
					addElement();
				}
				
				
			}
			
		});
		
		//2nd Thread
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				
				// this loop
				for(int i=0;i<1000;i++) {
					addElement();
				}
				
				
			}
			
		});
		
		//3rd Thread
		Thread t3=new Thread(new Runnable() {

			@Override
			public void run() {
				
				// this loop
				for(int i=0;i<1000;i++) {
					addElement();
				}
						
			}
			
		});
		
		
		//start thread
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			t2.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//checking size
		System.out.println(list.size());//3000
		
		
	}

	
}
