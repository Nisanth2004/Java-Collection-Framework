package com.collection5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.collection4.LapTop;

public class CursorsDemo 
{

	public static void main(String[] args) 
	{
		//String[] s= {"Nisanth","Sujith","Kaaviyan"};
		ArrayList arrayList=new ArrayList();
		arrayList.add("Nisanth");
		arrayList.add("Vinoth");
		arrayList.add("Rinos");
		arrayList.add("Kesavan");
		arrayList.add(5);
		
		// for each loop
		// only forward condition
		// cannot modify the contents of the collections
		/*
		for(Object object:arrayList)
		{
			System.out.println(object);
		}
		*/
		Iterator iterator=arrayList.iterator();
		while(iterator.hasNext())
		{
			if(iterator.next().equals("Nisanth"))
			  iterator.remove();
			
			
		}
		System.out.println("After"+arrayList);
		
		System.out.println("-------------------------");
		
		// bidirectional cursor
		
		ListIterator listIterator=arrayList.listIterator();
		listIterator.add(90);
		
		while(listIterator.hasNext())
		{
			if(listIterator.next().equals("Kesavan"))
			{
				listIterator.set("89");
			}
		}
		System.out.println(arrayList);
		
		System.out.println("--------------");
		
		LapTop lapTop=new LapTop("Logitech",123,456,true);
		arrayList.add(lapTop);
		System.out.println("laptop Class"+arrayList);
		
		
	}

}
