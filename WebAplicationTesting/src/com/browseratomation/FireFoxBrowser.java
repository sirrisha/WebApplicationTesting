package com.browseratomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args)
	{
      System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
	   FirefoxDriver driver =  new FirefoxDriver();
     
	
	}

}
