package interview;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<String>();
		hs.add("1");
		hs.add("2");
		hs.add("3");
		hs.add("4");
		
		HashSet<Integer> hs2=new HashSet<Integer>(200);
		hs2.add(1);
		hs2.add(1);
		hs2.add(1);
		hs2.add(1);
		
		HashSet<Object> hs3=new HashSet<Object>(hs2);
		hs3.add(true);
		hs3.add(true);
		hs3.add(4);
		hs3.add("hello");
		
	System.out.println(hs);
	System.out.println(hs2);
	System.out.println(hs3);
	
	Iterator<Object> i=hs3.iterator();
	
	while(i.hasNext()){
		
		if(i.next()=="hello")i.remove();
	}
	System.out.println(hs3);
	
	
	}

}
