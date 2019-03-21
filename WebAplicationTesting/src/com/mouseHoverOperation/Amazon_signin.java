package com.mouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_signin {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		   //WebDriver driver = new ChromeDriver();
		   ChromeDriver driver = new ChromeDriver();
	
       
	   String url = "http://amazon.in";
      driver.get(url);
       
       // to open the  amazon browser maximize automatically
       
       //driver.manage().window().maximize();
       
       // mouse or keyboard operations using class "Actions"
       
       //id="nav-link-yourAccount" property of sign in element
       
      WebElement Hellosign=driver.findElement(By.id("nav-link-yourAccount"));
       
       Actions act = new Actions(driver);
        act.moveToElement(Hellosign).perform();
        
        /* on the perticular element we have to just move to i.e hover opration 
         *  we have a method "move to element" */
        
        /* and for actions class we have to give "perform"
         then the perform operates some actions on that perticular element */
    
        

	}

}
