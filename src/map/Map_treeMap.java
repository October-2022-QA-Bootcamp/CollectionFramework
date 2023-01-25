package map;

import java.util.TreeMap;

public class Map_treeMap {
	//will be sorted (small-large)
	//no duplicate key
	//duplicate value--not a problem

	public static void main(String[] args) {
		
		TreeMap<Integer, Integer> treeMap=new TreeMap<>();
		treeMap.put(107, 1000);//largest key--will be last one
		treeMap.put(101, 200);//smallest key---will be the top
		treeMap.put(102, 3000);
		treeMap.put(103, 3000);//duplicate values allowed
		treeMap.put(102, 600);//duplicate key not allowed---it will be not added
		treeMap.put(104, 4050);
		treeMap.put(105, 5);
		
		System.out.println(treeMap);
		
		
		
		TreeMap<String, Integer> treeMap1=new TreeMap<>();
		treeMap1.put("Nabeel", 5);
		treeMap1.put("Mahmuda", 6);
		treeMap1.put("Sohag", 4);
		treeMap1.put("Abir", 7);
		treeMap1.put("Akash", 70);
		
		System.out.println(treeMap1);
		
		System.out.println("************");
		
		TreeMap<String, Integer> treeMap2=new TreeMap<>();
		treeMap2.put("Liton", 100);
		treeMap2.putAll(treeMap1);
		System.out.println(treeMap2);
		
		
		
		
		
	}

}
