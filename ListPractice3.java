package interview;
import java.util.*;
public class ListPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> basket=new ArrayList<Object>();
		
		basket.add(1);
		basket.add(1);
		basket.add(1);
		basket.add(1);
		
		System.out.println(basket);		
		
		List<Object> color=new ArrayList<Object>();
		color.add("blue");
		color.add("blue");
		
		basket.addAll(0, color);
		System.out.println(basket);		
		
		System.out.println("\nFirst index of 1");
		System.out.println(basket.indexOf(1));		
		System.out.println("\nlast index of 1");
		
		System.out.println(basket.lastIndexOf(1));		
		
		ListIterator<Object> i=basket.listIterator();
		
		System.out.println("\nUSING LIST ITERATOR->");
		
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		
				
			}

}
