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

public class Register extends BaseTest
{

	 @Test(priority=1)
	    public void Validation() throws IOException
	    
	    {
		   FileInputStream file = new FileInputStream("./NewTours.properties");
		   
		   Properties pr = new Properties();
		   pr.load(file);
		   
	      driver.findElement(By.linkText(pr.getProperty("Register"))).click();
		 
		  driver.findElement(By.name(pr.getProperty("FirstName"))).sendKeys("sirisha");
		  driver.findElement(By.name(pr.getProperty("LastName"))).sendKeys("kotte");
		  driver.findElement(By.name(pr.getProperty("Phone"))).sendKeys("8884595145");
		  driver.findElement(By.id(pr.getProperty("UserName_reg"))).sendKeys("siri");
		  driver.findElement(By.name(pr.getProperty("Address"))).sendKeys("TableyStreet");
		  driver.findElement(By.name(pr.getProperty("City"))).sendKeys("liverpool");
		  driver.findElement(By.name(pr.getProperty("State"))).sendKeys("mersyside");
		  driver.findElement(By.name(pr.getProperty("PostalCode"))).sendKeys("L18DW");
		  driver.findElement(By.name(pr.getProperty("Country"))).sendKeys("UK");
		  driver.findElement(By.name(pr.getProperty("Email"))).sendKeys("siri91@gmail.com");
	    driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("sirisiri");
	    driver.findElement(By.name(pr.getProperty("ConfirmPassword"))).sendKeys("sirisiri");  
	    driver.findElement(By.name(pr.getProperty("Register_click"))).click();
		    try
		    {
		    String   expected_user = "siri9@gmail.com";
			 System.out.println("the expected result is:"+expected_user);
			 
			 String   actual_user = driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			 System.out.println("the actual result is:"+actual_user);
			 
			   if(actual_user.contains(expected_user))
					  {
				         System.out.println("Register successfully--pass");
					  }
			    else
			    {
			    	String  expected_text="Note";
	    		  String actual_text=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
	    		 
	    		  if(actual_text.contains(expected_text))
	    		  {
	    			  System.out.println("Register failed");
	    			  File RegisterFail_Error=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	    	    
	    	    	  FileUtils.copyFile(RegisterFail_Error, new File("./Screenshot/register.png"));
	    		  
	    	    	
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
