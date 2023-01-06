import java.util.ArrayList;

public class List_2_ArrayListCapacity {

	/*
	 In this class we are checking capacity of arrayList*/
	public static void main(String[] args) {

		// when we create arrayLiat obj by calling default constructor---it will give you 10 capacity
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		
		//Note-once we occupied all 10 indexes it will automatically increase capacity --will be then 10+5=15
		//if we remove and reduced to 10 or less then again capacity will be 10 only

		// when we create arrayLiat obj by calling parameterized constructor---it will give you <passing value> capacity
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>(18);//it weill create  18 capacity

		arrayList1.add(5);
		arrayList1.add(5);
		

	}
}
