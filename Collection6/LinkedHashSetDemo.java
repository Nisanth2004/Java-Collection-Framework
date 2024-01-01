package com.collection6;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetDemo 
{

	public static void main(String[] args) 
	{
	 LinkedHashSet linkedHashSet=new LinkedHashSet();
	 linkedHashSet.add(78);
	 linkedHashSet.add(23);
	 linkedHashSet.add(80);
	 linkedHashSet.add(45);
	 System.out.println(linkedHashSet);
	 
	 System.out.println("-------------------");
	 LinkedList linkedList=new LinkedList();
	 linkedList.add(89);
	 linkedList.add(89);
	 linkedList.add(78);
	 linkedList.add(89);
	 linkedList.add(78);
	 linkedList.add(8);
	 linkedList.add(76);
	 linkedList.add(9);
	 linkedList.add(78);
	 System.out.println("Before Removing"+linkedList);
	 
	 // To remve duplicates in linkedlist using LinkedHashSet
	 LinkedHashSet linkedHashSet1=new LinkedHashSet(linkedList);
	 System.out.println("After Removing"+linkedHashSet1);
	 
	 System.out.println("----------------");
	 
	// How did you convert to list,set,to array; Map cannot be changed
	 // Object class is only one array in heterogenous 
	Object[] object= linkedList.toArray();	 
	for(Object o:object)
	{
		System.out.println(o);
	}
	 
	}

}
