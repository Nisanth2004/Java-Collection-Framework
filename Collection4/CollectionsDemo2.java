package com.collection4;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo2 
{

	public static void main(String[] args) 
	{
		LapTop dell=new LapTop("Inspiron",700000,8,true);
		LapTop lenova=new LapTop("IdeaPad",900000,16,false);
		
		LapTop mac=new LapTop("MacBook",1000000,500,true);
		
		ArrayList lapTopList=new ArrayList();
		lapTopList.add(dell);
		lapTopList.add(lenova);
		lapTopList.add(mac);
		
		//Collections.sort(lapTopList);
		System.out.println("Before sorting"+lapTopList);
		
		ComparatorDemo comparatorDemo=new ComparatorDemo();
		Collections.sort(lapTopList,comparatorDemo);
		System.out.println("After Sorting"+lapTopList);
		
		
		
		
		

	}

}
