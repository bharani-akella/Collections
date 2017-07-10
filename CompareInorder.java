package interview;

import java.util.Comparator;

public class CompareInorder implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		if(i1==i2){
			return 0;
		}else{
			return 1;	
		}
		
	}

}
