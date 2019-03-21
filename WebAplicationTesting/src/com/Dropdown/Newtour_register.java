package com.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtour_register {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		   String url = "http://www.newtours.demoaut.com";
		   
	       ChromeDriver driver = new ChromeDriver();
	          driver.get(url);
	       
	          //<a href="mercuryregister.php">REGISTER</a>
	    driver.findElementByLinkText("REGISTER").click();  
	    
	    //<select name="country" size="1">
	WebElement  country  =driver.findElement(By.name("country"));
	List  < WebElement> countries = country.findElements(By.tagName("option"));
	
         System.out.println("the total number of countries:"+countries.size());
	
	 //displaying countries
         for(int i=0;i<countries.size();i++)
         {
        	String country_name = countries.get(i).getText();
        	System.out.println(i+" "+country_name);
        	 countries.get(i).click();
        	 
        	 // to check whether the element is active or not
        	  
        	     //after checking it is active then perform some operations
        	     if(countries.get(i).isSelected())
        	     {
        	    	 System.out.println("active element");
        	    	  }
        	     else
        	     {
        	    	 System.out.println("inactive element");
        	     }
       
         }
         
     
	
	
	
	}

}
