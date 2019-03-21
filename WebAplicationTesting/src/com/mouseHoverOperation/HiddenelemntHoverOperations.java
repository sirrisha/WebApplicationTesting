package com.mouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenelemntHoverOperations {

	public static void main(String[] args) throws InterruptedException
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
		
       //<span class="nav-text">Your Orders</span> of type link
       
       driver.findElement(By.linkText("Your Orders")).click();
	 driver.quit();	
	}

}
