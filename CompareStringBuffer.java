package interview;

import java.util.Comparator;

public class CompareStringBuffer implements Comparator<StringBuffer>{

	public int compare(StringBuffer s1, StringBuffer s2) {
		// TODO Auto-generated method stub
		String ss1=s1.toString();
		String ss2=s2.toString();
		return ss1.compareTo(ss2);
	}

}
