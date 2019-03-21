package com.mouseAndKeyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		   
		   ChromeDriver driver = new ChromeDriver();
	
 
	   String url = "http://www.facebook.com";
    driver.get(url);
       driver.findElementById("email").sendKeys("sirisha");
       Actions act = new Actions(driver);
       // all the keyboard operations can be done by keys. operation to perform
         act.sendKeys(Keys.TAB).perform();
         act.sendKeys("hello").perform();
         act.sendKeys(Keys.ENTER).perform();
         
    driver.quit();
		
		
	}

}
