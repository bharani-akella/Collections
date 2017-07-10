package interview;

import java.util.TreeSet;

public class TreeSetPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

TreeSet<Integer> t3=new TreeSet<Integer>(new CompareInorder());
t3.add(1);
t3.add(2);
t3.add(3);
t3.add(4);
t3.add(5);
t3.add(6);
t3.add(7);

System.out.println("Inorder printing using comparator->");
System.out.println(t3);

	}

}
