package com.RealtimeApplications;

import java.util.List;

import org.openqa.selenium.By;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apsrtc_header {

	public static void main(String[] args) throws InterruptedException 
	{
       //WebDriver driver = null;
       //String url = "https://apsrtconline.in/oprs-web/";
       //driver = new ChromeDriver();
       //driver.get(url);
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		  
	       ChromeDriver driver = new ChromeDriver();
	       
	         driver.navigate().to("https://apsrtconline.in/oprs-web/");
 		
       List<WebElement> links = driver.findElements(By.tagName("a"));
       int linkcount = links.size();
       System.out.println("total number of links in webpage are:"+linkcount);
       
       // identifying the property of header block
       // class="menu-wrap"
         WebElement headerblock=driver.findElement(By.className("menu-wrap"));
        
         List<WebElement>headerblocklinks = headerblock.findElements(By.tagName("a"));
          
   int  headerblocklinkscount = headerblocklinks.size();
	 
 System.out.println("total number of links in header block are:" +headerblocklinkscount);
         
         for (int i=0;i<headerblocklinkscount;i++)
         {
        	  String linkname = headerblocklinks.get(i).getText();
        	  System.out.println(i+"  "+linkname);
        	   headerblocklinks.get(i).click();
        	  
        	  System.out.println(driver.getTitle());
        	  System.out.println(driver.getCurrentUrl());
        	  System.out.println();
        	  
        	  driver.navigate().back();
        	  /* here we synchronizaer means the selenium is running faster
        	   * so the browser not identify the elements so we give sleep time
        	   *  to our program */
        	  Thread.sleep(10000);
        	  
        	
        	   /* Re_creating the arraylist beacuse after going back 
        	   * the cache memory will empty in array list so 
        	   * again recreate the list */
        	 
        	  
      headerblock=driver.findElement(By.className("menu-wrap"));
              
   headerblocklinks = headerblock.findElements(By.tagName("a"));
        	  
       }
	
	   driver.quit();
	}

}
