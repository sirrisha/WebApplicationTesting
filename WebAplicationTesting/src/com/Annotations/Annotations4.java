package com.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations4
{
	@Test(priority=0)
	public void signin()
	{
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		  
		   ChromeDriver driver = new ChromeDriver();
	
     String url = "http://amazon.in";
      driver.get(url);
  
    WebElement Hellosign=driver.findElement(By.id("nav-link-yourAccount"));
     
     Actions act = new Actions(driver);
      act.moveToElement(Hellosign).perform();
      driver.quit();
     }
	
	
	@Test(priority=1)
	public void hiddenelement() throws InterruptedException
	{

		 System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		  
		   ChromeDriver driver = new ChromeDriver();
	
     String url = "http://amazon.in";
      driver.get(url);
  
       
    driver.manage().window().maximize();
   
    //id="nav-link-yourAccount" property of sign in element
    
   WebElement Hellosign=driver.findElement(By.id("nav-link-yourAccount"));
    
    Actions act = new Actions(driver);
     
    act.moveToElement(Hellosign).perform();
    
    Thread.sleep(10000);
		
     
     driver.findElement(By.linkText("Your Orders")).click();
		
		driver.quit();
		
	}
	
}
