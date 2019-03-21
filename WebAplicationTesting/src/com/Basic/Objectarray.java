package com.Basic;

public class Objectarray {

	public static void main(String[] args) 
	{
        //Object array is capable of different data type values//
		//Object arrayName[] = new Object[size];//
		
		
		Object a[] = new Object[3];
		a[0] = 10;
		a[1] = "sirisha";
		a[2] = 12.56;
		
		/* for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }	*/
		
		for(Object var: a)  /* This is for each loop in this
		                      object is datatype of array and 
			                  var is index and a is array name*/
		{
			System.out.println(var);
		}
			
      }

}
