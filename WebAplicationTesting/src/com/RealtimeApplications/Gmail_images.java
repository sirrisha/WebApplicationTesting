package com.RealtimeApplications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_images {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 String   url = "http://www.google.com";
	       ChromeDriver driver = new ChromeDriver();
	       driver.get(url);
	        
	      // <a class="gb_P" data-pid="2" href="https://www.google.co.uk/imghp?hl=en">Images</a>
	       
	      // <a class="gb_P" data-pid="23" href="https://mail.google.com/mail/">Gmail</a>  
	/* <a is anchor tag and href is attribute and
	 * element type is link.
	 * locator is linktext
	 * selector is for gmail = Gmail and for images = Images.*/
	   //driver.findElement(By.linkText("Gmail")).click();
	   
	    WebElement images = driver.findElement(By.linkText("Images"));
	        String imagesText = images.getText();
	       
	        /* when ever element with any property then use "webelement". 
	        it is an interface of ur selenium also act as data type,
	         if the element  related text then the variable is "String" */
	       
	        
	        System.out.println(imagesText);
	       driver.findElement(By.linkText("Images")).click();
	   
	   driver.quit();
	
	
	
	}

}
