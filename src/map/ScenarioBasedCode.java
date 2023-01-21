package map;

import java.util.HashMap;
import java.util.Scanner;

public class ScenarioBasedCode {
	
	/*Make a program where if you put state name it will return temp of that state
	 * */
	

	public static void main(String[] args) {

		HashMap<String, Integer> map=new HashMap<>();
		map.put("NY", 42);
		map.put("NJ", 47);
		map.put("PA", 40);
		map.put("TX", 50);
		map.put("CA", 49);
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Put the State name");
		
		String state=scanner.nextLine();
		scanner.close();
		
		
		System.out.println(state+" temp "+map.get(state));

	}

}
