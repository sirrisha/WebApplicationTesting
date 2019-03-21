package com.NewTours.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInKeywords {
  
	
	WebDriver driver=null;
	public void launchBrowser()
	{  
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver =new ChromeDriver();
	}
	 public void navigate()
	 {
		 driver.get("http://newtours.demoaut.com");
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	 }
	 public void enterUsername()
	 {
		 driver.findElement(By.name("userName")).sendKeys("tutorial");
	 }
	  public void enterPassword()
	  {
		 
		 driver.findElement(By.name("password")).sendKeys("tutorial");
	  }
	   public void clickLogin()
	   {
		 driver.findElement(By.name("login")).click();

		 
	 }
	 
	 
	
}
