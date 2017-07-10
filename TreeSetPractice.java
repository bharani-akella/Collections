package interview;

import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer> t1=new TreeSet<Integer>();
System.out.println("Using normal constructor->");

t1.add(1);
t1.add(2);
t1.add(3);
System.out.println(t1);

TreeSet<Integer> t2=new TreeSet<Integer>(new MyComparator());
t2.add(1);
t2.add(2);
t2.add(3);

System.out.println("Using comparator to print in descending order->");
System.out.println(t2);

TreeSet<Integer> t3=new TreeSet<Integer>(new Compare2());
t3.add(1);
t3.add(2);
t3.add(3);
t3.add(4);
t3.add(5);
t3.add(6);
t3.add(7);

System.out.println("Using comparator to print in descending odd followed by even->");
System.out.println(t3);

	}

}
