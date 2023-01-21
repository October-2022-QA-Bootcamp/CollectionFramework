package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//element gets inserted in a key-value pair
//one null key is possible
//no duplicate key

public class Map_01_HashMap {

	public static void main(String[] args) {
		// create the obj
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Tofayel", 6666464);
		map.put("Lobid", 897998);
		map.put("Sohag", 7979155);
		map.put("Sohag", 7979155);
		map.put(null, 7979155);

		
		System.out.println("// to get value--need to pass key in get()**************************************************");	
		System.out.println(map.get("Sohag"));
		
		System.out.println("//keySet() will return all key keys----it returns a set, so you need put in a set***********************");
		System.out.println(map.keySet());
		Set<String> keys = map.keySet();

		System.out.println("// using for each loop we get key from keySet and pass into get()***********************");
		for (String k : keys) {
			System.out.println(k + ":" + map.get(k));
		}
		
		
		System.out.println("//entrySet() returns all entrys (key=value), need a set varibale to put that should be Entry generic and Entry should be as per KEY and VALUES*******");	
		System.out.println(map.entrySet());
		
		Set<Map.Entry<String, Integer>> entryset = map.entrySet();
		System.out.println(entryset);

		System.out.println("//after calling entrySet() if we call iterator() then finally we need to put in Iterator type variable");
		Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
