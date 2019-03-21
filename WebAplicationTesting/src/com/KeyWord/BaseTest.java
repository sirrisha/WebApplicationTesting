package com.KeyWord;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	WebDriver driver =null; 
	String url = "http://www.newtours.demoaut.com";
	
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
	      
		   driver = new ChromeDriver();
	       driver.get(url);
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	 @AfterTest
	  public void tearDown()
	  {
		  driver.close();
	  }
     
}
