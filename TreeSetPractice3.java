package interview;

import java.util.TreeSet;

public class TreeSetPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

TreeSet<StringBuffer> t3=new TreeSet<StringBuffer>(new CompareStringBuffer());
t3.add(new StringBuffer("a"));
t3.add(new StringBuffer("b"));
t3.add(new StringBuffer("c"));
t3.add(new StringBuffer("d"));
t3.add(new StringBuffer("e"));
t3.add(new StringBuffer("e"));

System.out.println("Reverse alphabet printing using comparator->");
System.out.println(t3);

	}

}
