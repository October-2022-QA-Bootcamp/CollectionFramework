package list;
import java.util.ArrayList;

public class List_2_ArrayListCapacity {

	/*
	 In this class we are checking capacity of arrayList*/
	public static void main(String[] args) {

		// when we create arrayLiat obj by calling default constructor---it will give you 10 capacity
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);//0
		arrayList.add(5);//1
		arrayList.add(25);//2
		arrayList.add(35);//3
		arrayList.add(45);//4
		//arrayList.add(55);//5
		arrayList.add(65);//5
		
		
			if(arrayList.isEmpty()) {
				System.out.println("Nothing to do.....obj is empty");
			}else {
				
				arrayList.clear();
				//System.out.println("removing item-"+arrayList.remove(i));
				
				
			}
		
		
		//Note-once we occupied all 10 indexes it will automatically increase capacity --will be then 10+5=15
		//if we remove and reduced to 10 or less then again capacity will be 10 only

		// when we create arrayLiat obj by calling parameterized constructor---it will give you <passing value> capacity
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>(18);//it weill create  18 capacity

		arrayList1.add(5);
		arrayList1.add(5);
		

	}
}
