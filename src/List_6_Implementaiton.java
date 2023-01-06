import java.util.ArrayList;
import java.util.List;

public class List_6_Implementaiton {

	public static void main(String[] args) {
		
		//Implementation of List interface
		List<Integer> arrayList=new ArrayList<>();
		
		//insertion order (ordered way)---which way we are adding elements same way we will get
		arrayList.add(5);
		arrayList.add(50);
		arrayList.add(15);
		arrayList.add(15);//duplicate is possible
		
		//if we print we will get same order
		for(int i:arrayList) {
			System.out.println(i);
		}
		
		System.out.println("*******adding element explicitly in a specicif position*********");
		
		arrayList.add(0, 55);
		for(int i:arrayList) {
			System.out.println(i);
		}
		

	}

}
