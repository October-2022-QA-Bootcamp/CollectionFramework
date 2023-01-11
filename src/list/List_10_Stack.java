package list;

import java.util.Iterator;
import java.util.Stack;

public class List_10_Stack {
	
	//in Stack the element which get inserted last will be retrived first

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		stack.push("Mahmuda");//added first
		stack.push("Noman");//second
		stack.push("Arif");//last
		
		
		
		//peek() will return the top element in list
		System.out.println(stack.peek());// will return too item arif
		
		
		//pop() will remove the top element in list
		//System.out.println(stack.pop());//removing top element-arif
		
		//now the top element will be--
		System.out.println(stack.peek());//noman
		
		//if we call pop() now it will reove--
		//System.out.println(stack.pop());//removing top element-noman
		
		
		//we can call search() to find the index of specific element
		System.out.println(stack.search("Mahmuda"));
		
		//geting element after checking available or not
		/*Iterator<String> it=stack.iterator();
		
		while(it.hasNext()) {
			System.out.println(stack.pop());			
		}
*/		
		//geting element after checking available or not
		for(int i=0;i<4;i++) {
		
		if(!stack.empty()) {
			System.out.println(stack.pop());
		}else {
			System.out.println("Its empty now");
		}
		
}
		
		
		
	}

}
