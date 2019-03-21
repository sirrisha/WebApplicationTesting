package com.Basic;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args)
	{
		/* Array list dynamic data structure which is capble of saving
		 * different data types values and the size is dynamic
		 * 
		 * syntax: List<data type>ArrayName = new ArrayList<>();
		 * 
		 * for the "ArrayList" we have to import util.ArrayList
		 * and for "List" we have to import util.List
		 */
		
		 /* List<String>a = new ArrayList<>();
		     a.add("sirrisha");
		     a.add("how r u"); */

		
		   List<Object>a = new ArrayList<>();//Object array for diff data type
 		   a.add("sirrisha");
		   a.add(10);
 		   a.add(15.2);

		   for(int i=0;i<a.size();i++)
		   {
			   System.out.println(a.get(i));
			   
		   }
		
		
		

	}

}