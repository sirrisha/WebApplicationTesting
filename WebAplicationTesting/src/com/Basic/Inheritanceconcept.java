package com.Basic;

public class Inheritanceconcept //creating our own methods.
{
	public void test1()
	{
		int a =40;
		int b= 20;
		if (a>b)
		{
	  System.out.println("a is big");
		}
	}
	public void test2()
	{
	  System.out.println("test 2 executed");
	}


	public static void main(String[] args) 
	{
      
		Inheritanceconcept c = new Inheritanceconcept();
		 c.test1();
		 c.test2();
	}

}
