package interview;
import java.util.Stack;
public class StackPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> s=new Stack<String>();
		
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		s.push("f");
		
		System.out.print(s);

		s.pop();
		
		System.out.println("\n\nTop element is->\n"+s.peek());
		
		System.out.println("\n\nOffset of a is->\n"+s.search("a"));
		
		System.out.println("\n\nOffset of e is->\n"+s.search("e"));
		
		System.out.println("\n\nOffset of z is->\n"+s.search("z"));

		
	}

}
