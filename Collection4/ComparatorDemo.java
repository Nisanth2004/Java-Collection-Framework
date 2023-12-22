package com.collection4;

import java.util.Comparator;

public class ComparatorDemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		LapTop laptop1=(LapTop)o1;
		LapTop laptop2=(LapTop)o2;
//		if(laptop1.price>laptop2.price)
//		{
//			return 1;
//		}
//		else if(laptop1.price<laptop2.price)
//		{
//			return -1;
//		}
//		else
//		
//		return 0;
		
		// if we want to compare a string use compareTo method
		int result=laptop1.brand.compareTo(laptop2.brand);
		
		if(result>0)
		{
			return 1;
			
		}
		else if(result<0)
		{
			return -1;
		}
		else 
			return 0;
	}

}
