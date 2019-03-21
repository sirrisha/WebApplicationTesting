package com.RealtimeApplications;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		  
	       ChromeDriver driver = new ChromeDriver();
	       
	       
	       //driver.get("http://www.newtours.demoaut.com");
	         driver.navigate().to("http://www.newtours.demoaut.com");
	      /* <input type="text" name="userName" size="10">

	       locator = name
	       selector = username

         <input type="password" name="password" size="10">

	        locator = name
	        selector = password


	       <input type="image" name="login" value="Login" src="/images/btn_signin.gif" 
	                     width="58" height="17" alt="Sign-In" border="0">


	       locator = name
	       selector = login*/
	       
	       driver.findElement(By.name("userName")).sendKeys("siri");
	       driver.findElement(By.name("password")).sendKeys("sirisha");
	       driver.findElement(By.name("login")).click();
	       
	 

	}

}


