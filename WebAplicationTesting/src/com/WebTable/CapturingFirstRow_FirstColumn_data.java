package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingFirstRow_FirstColumn_data 
{
	public static void main(String[] args) 
   
   {
		WebDriver driver = null;
		String url = "https://www.timeanddate.com/worldclock/";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		   
		   driver = new ChromeDriver();
		   driver.get(url);
	       driver.manage().window().maximize();
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		String cityName = driver.findElement(By.xpath("html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]")).getText();
		System.out.println("the city name is: " +cityName);
         driver.quit();
}
}
	
