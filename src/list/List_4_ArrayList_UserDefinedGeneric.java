package list;
import java.util.ArrayList;

/*
 * As we know in collection we are adding objects
 * In this class we will add our own created class type obj (elements) in arrayList
 * we have created one class Oct22 here we will create some obj of that class and add in arraylist */

public class List_4_ArrayList_UserDefinedGeneric {

	public static void main(String[] args) {
		/*	as we saw we add elements (Integer type)
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		
		same way we will add Oct22 typ obj
		 */
		
		//creating obj of Oct22 class so that we can add in arrayList 
		Oct22 st1=new Oct22("Mahmuda");
		Oct22 st2=new Oct22("Numan");
		Oct22 st3=new Oct22("Dakpa");
		
		
		
		
		//creating arraylist obj which will only accepts <Oct22>
		ArrayList<Oct22> arrayList = new ArrayList<>();
		
		//adding elements of Oct22
		arrayList.add(st1);
		arrayList.add(st2);
		arrayList.add(st3);
		
		
		
		//getting element in index 1 then getting name variable value of that specific obj
		System.out.println(arrayList.get(1).name);
		
		
		
		
		
	}

}
