package com.collection1;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysLearningDemo 
{

	public static void main(String[] args) 
	{
	   int[] arr= {3,5,6,90,34,89};
	   for(int i: arr)
		   System.out.println(i);
	   
	   System.out.println("After sorting");
	   Arrays.sort(arr);
	   
	   for(int i: arr)
		   System.out.println(i);
	   
	   System.out.println("------------------------------------------------");
	   
	   String[] names= {"Raja","Kanisha","Gayathri","kavin"};
	   
	   // Inheritance-An object behaving another class object
	   System.out.println("Before starting");
	 
	   for(String s:names)
		   System.out.println(s);
	   
	   System.out.println("after sorting names");
	   
	   Arrays.sort(names);
	   for(String s:names)
		   System.out.println(s);
	   
	   //Dynamic Binding
	   // Sort  Length wise
	   Comparator comparator=new ComparatorDemo();
	   Arrays.sort(names,comparator);
	   System.out.println();
	   System.out.println("After using compare methods");
	   for(String s:names)
		   System.out.println(s);
	   
	   
	}

}
