package com.collection4;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo 
{

	public static void main(String[] args) 
	{
		ArrayList arrayList=new ArrayList();
		arrayList.add("89");
		arrayList.add("Kaaviyan");
		arrayList.add("Nisanth");
		arrayList.add("90");
		Collections.sort(arrayList);
		System.out.println(arrayList);
		System.out.println(Collections.binarySearch(arrayList, "90"));
		
		
		
	}

}
