package com.getPageSource;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google_findelement_Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		   
		   ChromeDriver driver = new ChromeDriver();
	

	   String url = "https://www.google.com";
    driver.get(url);
    driver.manage().window().maximize();
  String google_home  = driver.getPageSource();
   String  Expected_element = "hello";
   if(google_home.contains(Expected_element))
   {
	   System.out.println("element found");
	   
   }else
   {
	   System.out.println("element not found");
	   
   }  
	 driver.quit();   
   
   }
     	

}


