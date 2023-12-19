package com.collection2;

public class ArrayaBasics2 
{

	public static void main(String[] args) 
	{
		int[] a= {10,20,30};
		int[] b= {10,40,30};
		int i=0;
		boolean same=true;
		
		while(i<a.length)
		{
			if(a[i]!=b[i])
			{
				same=false;
				System.out.println("not same");
				break;
			}
			i++;
		}
		if(same==true)
		{
			System.out.println("both Arrays are same");
		}
		
	}

}
