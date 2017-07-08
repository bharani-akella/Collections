package interview;
import java.util.*;
public class ListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> basket=new ArrayList<String>();
		
		basket.add("orange");
		basket.add("banana");
		basket.add("apple");
		basket.add("apple");
		

		System.out.println("Direct printing->");
		
		System.out.println(basket);

		System.out.println("\nThrough for each->");
		
		for(String item:basket){
			System.out.print(item+" ");
		}
		
		Iterator<String> i=basket.iterator();

		System.out.println("\n\nThrough iterator->");
		
		while(i.hasNext()){
			System.out.print(i.next());
		}
		
		
	}

}
