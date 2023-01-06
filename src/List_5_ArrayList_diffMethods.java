import java.util.ArrayList;

public class List_5_ArrayList_diffMethods {
	
	/**
	 In this class we are checking some methods available in ArrayList*/

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		
		//adding elements
		
		names.add("Mahmuda");
		names.add("Khatun");
		names.add("Numan");
		names.add("Dakpa");
		names.add("");
		
		//checking single element using get() method
		System.out.println(names.get(3));
		
		////printing all elements by using using for loop and calling get() method
		//by using size() we are confirming condition
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
			
		}
		
		//calling clone() to get a copy of arrayList (need to typecast to store in a new arraylist
		ArrayList<String> name1 =(ArrayList<String>) names.clone();
		
		
		
		//clear() will clear every elements
		names.clear();
		
		
		//if you try to execute bellow line--you will see no more element in names (arraylist obj)
		//System.out.println(names.get(0)); //no more 0 index
		
		//by using isEmpty() we can confirm arraylist empty or not so that we can proceed accordingly
		if(names.isEmpty()) {
			System.out.println("We have no more elements");
		}else {
			System.out.println("We have elements");
		}
		
		
		//just checking our cloned arralist obj
		System.out.println(name1.get(0));
		
		
	}

}
