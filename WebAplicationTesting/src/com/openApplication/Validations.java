package com.openApplication;
import java.lang.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

	public static void main(String[] args)
	{
     System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.navigate().to("http://bing.com");

	 // Client Requirement
	 String   expectedTitle = "bing";
	 System.out.println("the expected result is"+expectedTitle);
	 
	 //Application which is  developed by developer
	 String   actualTitle = driver.getTitle();
	 System.out.println("the actual result is"+actualTitle);
	 
	 // validations done by test engineer
	  
	 
	 //if(actualTitle.equals(expectedTitle))
	 //if(actualTitle.contains(expectedTitle))
	 // if(actualTitle.equalsIgnoreCase(expectedTitle))

	   if(actualTitle.equalsIgnoreCase(expectedTitle))
			  {
		         System.out.println("title is matched--pass");
			  }
	    else
	     {
		   System.out.println("title is not matched--failed");
	      }
	  driver.quit();
			  }
	 
}
