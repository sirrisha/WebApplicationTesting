package com.Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{
	@Test
	public void applicationlaunch()
	{
		System.out.println("Gmail Application launch successfully");
	}
	@BeforeTest
	public void inbox()
	{
	  System.out.println("Gmail inbox opened");	
		
	}
	
	@Test(priority=0)
	public void bing()
	{
		System.out.println("opened by priority");
	}
	
	@Test(enabled=false)//it wont print that is enabled
	public void compose()
	{
		System.out.println("compose mail opened");
	} 
	
	@AfterTest
	public void attach()
	{
		System.out.println("attachement");
	}
	
	@Test(priority=1)
	public void drafts()
	{
		System.out.println("drafts opened");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
