package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.DataDriven.BaseTest;

public class Newtour_register extends BaseTest
{

	/*WebDriver driver =null; 
	String url = "http://www.newtours.demoaut.com";
	
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
	      
		   driver = new ChromeDriver();
	       driver.get(url);
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}*/
	 
	  
	  @Test(priority=0)
		public  void Login()
		{
	       System.out.println("enter into register");
	       
	       driver.findElement(By.linkText("REGISTER")).click(); 
	        
		}
	  @Test(priority=1)
	    public void Validation()
	    
	    {
		  driver.findElement(By.name("firstName")).sendKeys("sirisha");
		  driver.findElement(By.name("lastName")).sendKeys("kotte");
		  driver.findElement(By.name("phone")).sendKeys("8884595145");
		  driver.findElement(By.id("userName")).sendKeys("siri");
		  driver.findElement(By.name("address1")).sendKeys("TableyStreet");
		  driver.findElement(By.name("city")).sendKeys("liverpool");
		  driver.findElement(By.name("state")).sendKeys("mersyside");
		  driver.findElement(By.name("postalCode")).sendKeys("L18DW");
		  driver.findElement(By.name("country")).sendKeys("UK");
		  driver.findElement(By.name("email")).sendKeys("siri91@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("sirisiri");
	    driver.findElement(By.name("confirmPassword")).sendKeys("sirisiri");  
	    driver.findElement(By.name("register")).click();
		    
		    String   expected_user = "siri91@gmail.com";
			 System.out.println("the expected result is:"+expected_user);
			 
			 String   actual_user = driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			 System.out.println("the actual result is:"+actual_user);
			 
			   if(actual_user.contains(expected_user))
					  {
				         System.out.println("Register successfully--pass");
					  }
			    else
			     {
				    System.out.println("Registration not done--failed");
			      } 
		  }
     
		/* @AfterTest
		  public void tearDown()
		  {
			  driver.close();
		  }*/
	      
	     
		
	
}
