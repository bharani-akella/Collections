package interview;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
public class ListIteratorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s=new Stack<Integer>();
		
		for(int i=0;i<=10;i++){
			s.push(i);
		}
		
		System.out.println("Initial List->");
		System.out.println(s);
		System.out.println("");
		
	ListIterator<Integer> i=s.listIterator();
	while(i.hasNext()){
	       int element= i.next();	
	       if(element==5){
	    	 
	    	   break;
	       }
	}
	
	while(i.hasPrevious()){
		 int element= i.previous();
		 System.out.println(element+" is being deleted ");
	      i.remove();
	}
	
	System.out.println("\nAfter deleting half of the list->");
	System.out.println(s);
	
	ListIterator<Integer> i2=s.listIterator();
	
	int k=0;
	while(i2.hasNext()){
		
		System.out.println("\nreplacing "+i2.next()+" with "+(++k));
		i2.set(k);
	}
	System.out.println("\nAfter replacing the values in the list->");
	
	System.out.println(s);
	
	ListIterator<Integer> i3=s.listIterator();
	
	int z=5;
	while(i3.hasNext()){
		i3.next();
		i3.add(++z);
	}
	System.out.println("\nAfter adding values in the list->");
	System.out.println(s);
	
	
	}
	
}
