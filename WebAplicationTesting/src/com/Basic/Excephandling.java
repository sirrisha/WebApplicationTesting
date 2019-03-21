package com.Basic;
import java.lang.*;

public class Excephandling {

	public static void main(String[] args) {
		try
		{
	        	 int a = 10;
	        	 int b = 5;
	        	 int c;
	        	 c = a/b;
	        	 System.out.println("the value of c is :"+c);
	         }
		  catch(Exception e)
		{
			  System.out.println("error in program");

		}

	}

}
