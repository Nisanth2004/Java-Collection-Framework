package com.collection8;

import java.util.TreeMap;

public class TreeMapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap treeMap=new TreeMap<>();
		treeMap.put(101, "Vishal");
		treeMap.put(102,"Nisanth");
		
		TreeMap treeMap2=new TreeMap<>();
		treeMap2.putAll(treeMap);
		System.out.println(treeMap2);
		
		System.out.println(treeMap2.firstKey());

	}

}
