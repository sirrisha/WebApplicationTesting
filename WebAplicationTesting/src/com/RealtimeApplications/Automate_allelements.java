package com.RealtimeApplications;

//import java.util.List;
//import java.util.ArrayList;
import java.util.*;
//import java.lang.*;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_allelements {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		  
	       ChromeDriver driver = new ChromeDriver();
	       
	         driver.navigate().to("http://www.newtours.demoaut.com");
     List<WebElement> links = driver.findElements(By.tagName("a"));
	             int linkcount = links.size();
	             System.out.println(linkcount);
	             
	      

	}

}