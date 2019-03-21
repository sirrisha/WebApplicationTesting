package com.RealtimeApplications;
import org.openqa.selenium.By;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Flipkart_head {
		
        public static void main(String[] args) throws InterruptedException 
			{
		      
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
				  
			       ChromeDriver driver = new ChromeDriver();
			       //FirefoxDriver  driver = new FirefoxDriver();
			         driver.navigate().to("https://www.redbus.in");
		 		
			         WebElement headerblock=driver.findElementById("page_main_header");
			         
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
			       
			        	  Thread.sleep(10000);
			        	  
			        	
			
			   headerblock=driver.findElementById("page_main_header");
			              
			   headerblocklinks = headerblock.findElements(By.tagName("a"));
			        	  
			       }
				
				   driver.quit();
				}

			}
