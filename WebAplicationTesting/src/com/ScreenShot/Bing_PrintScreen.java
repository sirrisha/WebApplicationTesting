package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_PrintScreen {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		   
		   ChromeDriver driver = new ChromeDriver();
	

	   String url = "https://www.bing.com/";
      driver.get(url);
      /* for screen shot in system we have Prntscr and we save 
       *  the file in some location and name and format */
      
     //TakesScreenshot is an interface
      //type cating:binding interface with a class of object
  
      Thread.sleep(10000);
      
     File bing_SceenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
  FileUtils.copyFile(bing_SceenShot, new File("./Screenshot/bing.png"));

		driver.quit();
		
		
		
		
		
		
		
	}

}
