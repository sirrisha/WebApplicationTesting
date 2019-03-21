package com.Basic;

public class Subchildclass extends Childclass
{
	public void test5()
	{
	  System.out.println("test 5 executed");
	}
	public void test6()
	{
	  System.out.println("test 6 executed");
	}


	public static void main(String[] args)
	{
		Subchildclass s = new Subchildclass();
		 s.test1();
		 s.test2();
		 s.test3();
		 s.test4();
		 s.test5();
		 s.test6();
		 

	}

}
