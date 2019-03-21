package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class SensongsImage {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		   
		   ChromeDriver driver = new ChromeDriver();
	

	   String url = "http://www.sensongs.com/";
   driver.get(url);
   Thread.sleep(10000);
           File sensong =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

   FileUtils.copyFile(sensong, new File ("./Screenshot/sensong.png"));
   
   
   
  driver.quit();
		
   
   
   
   
	}

}
