package list;

import java.util.List;
import java.util.Vector;

public class List_10_Vector {

	public static void main(String[] args) {
		Vector<Integer> v =new Vector<Integer>(15);
		v.add(5);
		v.add(15);
		v.add(25);
		v.addElement(15);
		
		System.out.println(v.capacity());//15
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
		v.add(25);//
		v.add(25);
		v.add(25);
		v.add(25);
		v.add(25);
		v.add(25);
		v.add(25);
		
		System.out.println(v.capacity());//30
		
		System.out.println(v.firstElement());

	}

}
