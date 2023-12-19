package com.collection3;

import java.util.LinkedList;


public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		LinkedList linkedList=new LinkedList();
		linkedList.add(56);
		linkedList.add("Nisanth");
		linkedList.add(76);
	
		linkedList.add("Kaaviyan");
		System.out.println(linkedList);
		linkedList.addFirst(100);
		System.out.println("Before Poll "+linkedList);
		linkedList.poll();
		
		System.out.println("After Poll(remove first)"+linkedList);
		
		linkedList.offer(9000);
		System.out.println("After Offer(in last)"+linkedList);
		
		LinkedList linkedList2=(LinkedList) linkedList.clone();
		System.out.println("After Cloned"+linkedList2);
		
		linkedList.clear();
		System.out.println("After clear"+linkedList);
		
	
		
	}

}
