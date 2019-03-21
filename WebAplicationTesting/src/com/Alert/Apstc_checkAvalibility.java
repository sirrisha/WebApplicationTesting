package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apstc_checkAvalibility {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = null;
		String url = "https://apsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		   
		   driver = new ChromeDriver();
	

	   //String url = "https://apsrtconline.in/oprs-web/";
       driver.get(url);
       driver.manage().window().maximize();
      // <input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch"
      //+ "(this.form, '/oprs-web/avail/services.do');">
        driver.findElement(By.id("searchBtn")).click();
        
   // Alert is an interface
        
        Alert alt = driver.switchTo().alert();
        
         String alertText = alt.getText();
         System.out.println("the alert of window is:  "+alertText);
           Thread.sleep(10000);
        
           // to ok the alert
         alt.accept();
           
           //alt.dismiss();
           
           //sending text into alert
           //alt.sendKeys("hello");
         
         driver.quit();
           
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
