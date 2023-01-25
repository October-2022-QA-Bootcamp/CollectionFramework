package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class Set_03_TreeSet {
	//TreeSet is a class in collection---it gives implementation of SortedSet interface
	
	public static void main(String[] args) {
		
	//following sorting
	
	SortedSet<String> set=new TreeSet<>();
	set.add("Mahmuda");
	set.add("Arif");
	set.add("Dupka");
	set.add("Noman");
	
	//using some methods to get specic elements
	System.out.println("using first()--"+set.first());//first element after sorting
	System.out.println("using last()--"+set.last());//last element after sorting
	System.out.println("using headSet()--"+set.headSet("Dupka"));////headset of passing element element after sorting
	System.out.println("using tailSet()--"+set.tailSet("Dupka"));
	System.out.println("using subSet()--"+set.subSet("Arif","Mahmuda"));
	
	
	
	
	//System.out.println(set.comparator());//will be used when we explicitly sort
	
	System.out.println("*******using forEach()**********");
	set.forEach(s->System.out.println(s));
	
	}

}
