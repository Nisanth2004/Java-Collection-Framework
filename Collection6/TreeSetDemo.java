package com.collection6;

import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetDemo 
{

	public static void main(String[] args) 
	{
		// it is sorted order
		// No HeteroGeneous Order Allowed becauese it cannot be sorted
		// it have no duplicates
		TreeSet treeSet=new TreeSet<>();
		treeSet.add(90);
		treeSet.add(80);
		treeSet.add(40);
		treeSet.add(9);
		treeSet.add(90);
		System.out.println(treeSet);
		
		System.out.println("------------------");
		
		// To remve duplicates and sorted
		LinkedList linkedList=new LinkedList<>();
		linkedList.add(1);
		linkedList.add(5);
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(3);
		
		linkedList.add(2);
		linkedList.add(10);
		linkedList.add(6);
		System.out.println("Before duplicates remove and sort:"+linkedList);
		
		
		TreeSet treeSet1=new TreeSet<>(linkedList);
		System.out.println("After duplicates remove and sort:"+treeSet1);
		
		
		
	}

}
