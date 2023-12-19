package com.collection2;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayBasics 
{
	String name;

	public ArrayBasics(String string) 
	{
		this.name=name;
	}
	

	public static void main(String[] args) 
	{
		int[] a1= {10,20,30};
		int[] a2= {10,20,30,40};
		boolean var=Arrays.equals(a1, a2);
		System.out.println(var);
		System.out.println("----------------------");
		
		System.out.println("Sorted Array");
		Arrays.sort(a2);
		for(int i:a2)
			System.out.println(i);
		
		System.out.println("--------------------");
		
		
		
        
		ArrayBasics a=new ArrayBasics("nisanth");
		ArrayBasics b=new ArrayBasics("Kaviyan");
		ArrayBasics c=new ArrayBasics("Kesavan");
		
		ArrayBasics[] arrayBasics = {a,b,c};
		////Arrays.sort(arrayBasics);
		//for(int i=0;i<arrayBasics.length;i++)
		//{
		//	System.out.println(arrayBasics[i]);
		//}
		
		String[] names= {"Nisanth","Kaaviyan","Kesavan","Raja","Meena"};
		Arrays.sort(names);
		System.out.println("Using Sort Method");
		for(String s:names)
			System.out.println(s);
		
		System.out.println("after using compare method");
		
        IComparator comparator=new IComparator();
		Arrays.sort(names,comparator);
		
		System.out.println();
		
		for(String s:names)
			System.out.println(s);
			
		
				
		
		
		

	}

}
