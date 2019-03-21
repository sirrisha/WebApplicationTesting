package com.KeyWord;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;



public class LogInTest extends BaseTest
{
   @Test
   public void logIn() throws IOException
   {
	   FileInputStream file = new FileInputStream("./NewTours.properties");
   
   Properties pr = new Properties();
   pr.load(file);
      // driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
      // driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
       driver.findElement(By.name(pr.getProperty("SignIn"))).click();

      try
      {
    	  String expected_title ="Find";
    	  System.out.println("the expected title is:"+expected_title);
    	
    	  String actual_title= driver.getTitle();
    	 System.out.println("the actual title is:"+actual_title);
    	 
    	 if(actual_title.contains(expected_title))
    	 {
    		 System.out.println("login successfull-pass");
    	 }
    	 else
    	 {
    		String  expected_text="Welcome";
    		  String actual_text=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/b")).getText();
    		 
    		  if(actual_text.contains(expected_text))
    		  {
    			  System.out.println("login failed");
    			  File logInFail_Error=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	    	    
    	    	  FileUtils.copyFile(logInFail_Error, new File("./Screenshot/login.png"));
    		  
    	    	
    		  }
    	 }
    	 Thread.sleep(5000);
      }
      
      catch(Exception e)
      {
    	  System.out.println("The exception is:"+e);
    	  
      }
    	driver.navigate().back();  
      }
     
   
   }
	
	

