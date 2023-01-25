package map;

import java.util.LinkedHashMap;
import java.util.Set;

public class Map_03_LinkedHashMap {

	public static void main(String[] args) {
		
		//like HashMpa ---LinkedHashMap is a class giving implementation of Map interface
		
		/*
		 * We will check in LinkedHashMap insrtion order is following*
		 */
		 
		
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
		
		map.put(0, 10001);//null key---possible
		map.put(0, 10001);//duplicate or two null keys ----not possible
		map.put(105, 10002);
		map.put(102, 10002);//duplicate value possible
		map.put(107, 10002);//duplicate value possible
		map.put(101, 10007);
		map.put(103, 10001);

		//single element returns
		System.out.println(map.get(101));
		
	
		//get all keys and print
		
		Set<Integer> keys=map.keySet();
		
		System.out.println(keys);
		
		//using for each loop--and print all
		for(int k:keys) {
			System.out.println(map.get(k));
			
		}
		
		
		
		
		
		
	}

}
