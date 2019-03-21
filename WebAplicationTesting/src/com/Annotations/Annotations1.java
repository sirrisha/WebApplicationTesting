package com.Annotations;

import javax.swing.plaf.synth.SynthScrollPaneUI;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Annotations1
{
	@Test
	public void applicationlaunch()
	{
		System.out.println("Gmail Application launch successfully");
	}
	@Test
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
	
	
}
