package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll=new LinkedList<String>();
		
		ll.addLast("hari");
		ll.addLast("suresh");
		ll.addLast("ramesh");
		ll.addLast("pari");
		ll.addLast("rahul");
		ll.addLast("sonal");
		
		Iterator<String> di=ll.descendingIterator();
		Iterator<String> i=ll.iterator();
		
		System.out.println("Descending list");
		while(di.hasNext()){
			System.out.print(di.next()+" ");
		}
		
		System.out.println("\n\nInorder list");
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		
		System.out.println("\n\nFirst element->\n"+ll.peekFirst());
		System.out.println("\nLast element->\n"+ll.peekLast());
		
		ll.pollFirst();
		ll.pollLast();
		System.out.println("\n\nAfter polling first and last elements->\n"+ll);
		
	}

}
