import java.util.ArrayList;

public class List_3_ArrayList_HetrogeniousAndGeneric {
	
	/*
	 *If dont make generic then we can add any type of objs--which is called Hetrogenious type*/

	public static void main(String[] args) {
		
		//adding Hatrogenious type element
		ArrayList<Comparable> arrayList = new ArrayList<Comparable>();
		arrayList.add(5); //Integer not int (it convrted already to Integer obj)
		arrayList.add(5.5);//Double
		arrayList.add("Sohag");
		arrayList.add('M');
		arrayList.add(false);
		
		//if we make generic then 
		ArrayList<String> arrayList1 = new ArrayList<>();
		arrayList1.add("Sohag"); 
		arrayList1.add("Sonia"); 
		arrayList1.add("Nabeel"); 
		arrayList1.add("Dakpa"); 
		//arrayList1.add('c'); //we cant do it---only String
		
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(5);
		arrayList2.add(15);
		arrayList2.add(25);
		//arrayList2.add(25.5);//not possible
		
		
		
	}

}
