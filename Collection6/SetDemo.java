package com.collection6;

import java.util.HashSet;

public class SetDemo 
{
	/*
	 * int a=10;
	 * 
	 * AutoBoxing:->Converting primitive DataType variable 
	 * into corresponding wrapper class object
	 * 
	 * Example:  Integer i=a;
	 * 
	 * 
	 * AutoUnBoxing:->Converting wrapper class object 
	 * into corresponding  primitive DataType variable
	 * 
	 * Example: int b=i;
	 */
	

	public static void main(String[] args) 
	{
		
		// set-no duplicates allowed,no order maintained
		
		HashSet hashSet=new HashSet<>();
		hashSet.add(90);
		hashSet.add(60);
		hashSet.add(78);
		hashSet.add(89);
		hashSet.add(56);
		System.out.println(hashSet);
		
	}

}
