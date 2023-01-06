package list;
import java.util.ArrayList;

public class List_1_ArrayAndArrayList {

	public static void main(String[] args) {
		
		//array--how we create the array
		//int[]arr= {5,10,9,8,15};//----declaired the size+inserted the data
		int[]arr2= new int[5];
		
		//how insert data---mentioning index number
		
		arr2[0]=5;
		arr2[1]=15;
		arr2[2]=25;
		arr2[3]=25;
		arr2[4]=55;
		
		
		//if we want to insert more---we will get  exception
		//arr2[5]=35;
		
		
		//how we can print data---by mention index number
		System.out.println("get any any specic data in specific index "+arr2[4]);
		
		
		//how we can check the size---length property
		System.out.println("size of array: "+arr2.length);
		
		
		
		//arrayList---class
		//how we create arrayList----using new keyword+constructor (creating the obj)
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		//how we insert data---using add() and passing index
		arrayList.add(5);
		arrayList.add(15);
		arrayList.add(55);
	
		
		//how we can print---by using get()
		
		System.out.println("element in index 1: "+arrayList.get(1));
		
		
		//how we can check size of the arrayList---by using size()
		System.out.println("size of the arrayList: "+arrayList.size());
		
		
	}

}
