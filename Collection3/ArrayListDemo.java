package com.collection3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		/*
		 * 1.ArrayList is Resizable but array is not 
		 * 2.Heterogenous(diff types) Object are avialable
		 * 3.Datastructure:Growbale Array
		 * 4.Primitive datatypes are not allowed
		 * 5.Data Reterival is faster
		 * 
		 * 
		 * Interview:get() and remove()
		 *           List() and set()
		 *           ArrayList() and LinkedList()
		 */
		
		ArrayList arrayList=new ArrayList();
	
		System.out.println();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add("Nisanth");
		arrayList.add(true);
		arrayList.add('b');
		arrayList.add(4, "Sujith");
		
		
		// Integer Objects are stored in list
		System.out.println("After Adding Element");
		System.out.println(arrayList.size());
		
		System.out.println(arrayList.add(45));
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.contains("Sujith"));
		
		System.out.println(arrayList.get(0));
		
		System.out.println(arrayList.remove(6));
		
		System.out.println(arrayList);
		
		
		/*
		 * get() and remove()
		 * Both will return us the element present in particularindex.
		 * get() will not remove the element from the particular index
		 * remove() will remove the element from the particular index
		 */
		
		arrayList.set(6, "Kaaviyan");
		System.out.println("ArrayList 1 is :"+arrayList);
		
		System.out.println("Index of Nisanth "+arrayList.indexOf("Nisanth"));
		
		System.out.println("----------------------------------");
		ArrayList arrayList2=new ArrayList();
		arrayList2.addAll(arrayList);
		System.out.println("Arraylist 2 is:"+arrayList2);
		
		System.out.println("----------------------------------");
		ArrayList arrayList3=new ArrayList();
		arrayList3.add("Chennai");
		arrayList3.add("Perambalur");
		arrayList3.add("Kolkata");
		arrayList3.add("Mumbai");
		System.out.println("ArrayList 3 is :"+arrayList3);
		
		arrayList3.addAll(2,arrayList2);
		System.out.println("ArrayList 3 after adding new list:"+arrayList3);
		System.out.println("----------------------------------");
		List list=arrayList3.subList(0,4);
		System.out.println(list);
		
	}

}
