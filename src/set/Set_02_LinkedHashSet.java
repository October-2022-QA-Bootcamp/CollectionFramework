package set;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Set_02_LinkedHashSet {
	
	//following insertion order

	public static void main(String[] args) {
		LinkedHashSet<Integer> lSet=new LinkedHashSet<>();
		lSet.add(105);
		lSet.add(101);
		lSet.add(110);
		lSet.add(102);
		lSet.add(103);
		lSet.add(103);//duplicate not possible
		
		
		//2nd obj
		LinkedHashSet<Integer> lSet2=new LinkedHashSet<>();
		lSet2.add(505); //added one element in lSet2
		//now adding all in lSet2 from lSet obj (we created first set obj)
		lSet2.addAll(lSet);
		
		
		//Print all element from lSet2 by using forEach()
		lSet2.forEach(n->System.out.println(n));
		
		
		//removing one element from lSet2
		lSet2.remove(505);
		//Print all element from lSet2 by using forEach()
				lSet2.forEach(n->System.out.println(n));
	}

}
