package interview;

import java.util.Comparator;

public class Compare2 implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		if(i1<i2){
			if(i1%2==0){
				return +1;
			}else{
				return -1;
			}
		}else if(i1>i2){
			if(i1%2==0){
				return +1;
			}else{
				return -1;
			}
			
		}
		return 0;
	}

}
