package com.collection8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
		HashMap hashMap=new HashMap<>();
		hashMap.put("Suriyan", 100);
		hashMap.put("Nisanth", 101);
		hashMap.put("Sujith", 103);
		System.out.println(hashMap);
		System.out.println("----------------");
		
		// get the keys only
		Set set=hashMap.keySet();
		System.out.println("Keys are  "+set);
		System.out.println("-------------------");
		
	    Collection collection=	hashMap.values();
	    System.out.println("Values are "+collection);
	    System.out.println("-------------------");
	    
	    Set set2= hashMap.entrySet();
	    System.out.println("Entry are "+set2);
	    
	    System.out.println("-----------------");
	    System.out.println("Using Iterator");
	    Iterator iterator=set2.iterator();
	    System.out.println("Using Map Entry Interface");
    
	    while(iterator.hasNext())
	    {
	    	Map.Entry mapEntry= (Map.Entry) iterator.next();
	    	
	    	//System.out.println(iterator.next());
	    	System.out.println(mapEntry.getKey()+":"+mapEntry.getValue());
	    	
	    	System.out.println("-----------------------");
	    	if(mapEntry.getKey().equals("Nisanth"))
	    	
	    		System.out.println(mapEntry.getValue());
	    	mapEntry.setValue(200);
	    	
	    	System.out.println("After set a new value");
	    	
	
	    System.out.println(mapEntry.getKey()+":"+mapEntry.getValue());
    }
	    
	    System.out.println("------------------------------");
	    System.out.println(hashMap.containsKey("Nisanth"));
	    System.out.println(hashMap.containsValue(300));
	}

}
