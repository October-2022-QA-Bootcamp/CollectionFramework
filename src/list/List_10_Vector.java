package list;

import java.util.List;
import java.util.Vector;

public class List_10_Vector {
	
	

	public static void main(String[] args) {
		//when we create by using default constructor---we will get capacity=10
		//Vector<Integer> v =new Vector<Integer>();
		
		//creating obj by parameterized constructor and passing 15---it means capacity will be  15
		Vector<Integer> v =new Vector<Integer>(15);
		v.add(5);
		v.add(15);
		v.add(25);
		//in Vector we can use AddElement() to add element
		v.addElement(15);
		v.add(5);
		v.add(15);
		v.add(25);
		v.add(5);
		v.add(15);
		v.add(25);
		v.add(5);
		v.add(15);
		v.add(25);
		v.add(25);
		v.add(25);//15th index-----index-14
		//capacity()---will return current capacity of stack
		System.out.println(v.capacity());//15
		//added more elements
		v.add(25);//here capacity increased to 30---->double of the prev capacity
		
		//now the capacity
		System.out.println(v.capacity());//30
		
		
		//find the first element-
		System.out.println(v.firstElement());

	}

}
