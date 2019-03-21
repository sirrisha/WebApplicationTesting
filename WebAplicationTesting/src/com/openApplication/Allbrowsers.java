package com.openApplication;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Allbrowsers {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		  
       ChromeDriver driver = new ChromeDriver();
          //driver.get("http://www.google.com");
             driver.navigate().to("http://google.com");
   String title = driver.getTitle();
    System.out.println(title);
    String   Currenturl= driver.getCurrentUrl();
         System.out.println(Currenturl);
      driver.quit();
          
		//FirefoxDriver driver = new FirefoxDriver();
		  // driver.get("http://www.google.com");
         
         
	}
}