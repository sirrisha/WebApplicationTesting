package com.browseratomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args)
	{
      System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
	   //WebDriver driver = new ChromeDriver();
	   ChromeDriver driver = new ChromeDriver();
	}

}
