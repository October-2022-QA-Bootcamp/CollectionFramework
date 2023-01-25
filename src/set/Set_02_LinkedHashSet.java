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
		lSet2.add(505);
		
		lSet2.addAll(lSet);
		
		lSet2.remove(505);
		
		

		lSet2.forEach(n->System.out.println(n));
		
		
		
		
		
	}

}
