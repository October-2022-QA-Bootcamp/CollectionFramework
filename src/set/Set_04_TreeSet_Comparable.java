package set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_04_TreeSet_Comparable {

	public static void main(String[] args) {
		SortedSet set = new TreeSet();   
        // Add the elements in the given set.  
        set.add(22);  
        set.add(44);  
        set.add(11);  
        set.add(33);  
        set.add(55);  
        System.out.println("The list of elements is given as:");  
        for (Object object : set) {  
             System.out.println(object);    
        }  
        System.out.println("The comparator is given as: " + set.comparator());     
		
	}

}
