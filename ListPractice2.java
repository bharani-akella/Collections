package interview;
import java.util.*;
public class ListPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> basket=new ArrayList<Object>();
		
		basket.add("orange");
		basket.add("banana");
		basket.add("apple");
		basket.add("orange");
		basket.add("banana");
		basket.add("apple");
		
		List<String> color=new ArrayList<String>();
		color.add("blue");
		color.add("red");
		color.add("green");
		
		List<Integer> number=new ArrayList<Integer>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		
		List<Boolean> bool=new ArrayList<Boolean>();
		bool.add(true);
		bool.add(true);
		bool.add(false);
		bool.add(false);
		
		
		basket.addAll(color);
		basket.addAll(number);
		basket.addAll(bool);
		
		System.out.println("Initial basket->");
		
		System.out.println(basket);
		
		System.out.println("Retaining ony numbers->");

		basket.retainAll(number);
		System.out.println(basket);
		
				
			}

}
