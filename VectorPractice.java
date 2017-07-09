package interview;
import java.util.Enumeration;
import java.util.Vector;
public class VectorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<String> v=new Vector<String>();

v.addElement("a");
v.addElement("b");
v.addElement("c");
v.addElement("d");
v.addElement("e");
v.addElement("f");


Enumeration<String> e=v.elements();

System.out.println("Through enumeration->");
while(e.hasMoreElements()){
	System.out.print(e.nextElement()+" ");
}
 		
System.out.println("\nThe first element is->\n"+v.firstElement());
System.out.println("\nThe last element is->\n"+v.lastElement());

v.removeElementAt(0);
System.out.println("\n"+v);
		
	}

}
