package interview;
import java.util.Iterator;
import java.util.Stack;
public class IteratorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s=new Stack<Integer>();
		
		for(int i=0;i<=10;i++){
			s.push(i);
		}
		
		System.out.println("Initial List->");
		System.out.println(s);
		
	Iterator<Integer> i=s.iterator();
	while(i.hasNext()){
	       int element= i.next();	
	       if(element%2==0){
	    	  
	       }else{
	    	   i.remove();
	       }
	}
	
	System.out.println("\nAfter deleting odd elements->");
	System.out.println(s);
	
	
	}

}
