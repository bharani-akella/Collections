package interview;

import java.util.TreeSet;

public class TreeSetPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

TreeSet<String> t3=new TreeSet<String>(new CompareReverseAlphabet());
t3.add("a");
t3.add("b");
t3.add("c");
t3.add("d");
t3.add("e");
t3.add("f");
t3.add("g");

System.out.println("Reverse alphabet printing using comparator->");
System.out.println(t3);

	}

}
