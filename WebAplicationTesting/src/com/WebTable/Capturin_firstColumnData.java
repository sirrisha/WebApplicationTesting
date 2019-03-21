package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturin_firstColumnData {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		String url = "https://www.timeanddate.com/worldclock/";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		   
		   driver = new ChromeDriver();
		   driver.get(url);
	       driver.manage().window().maximize();
	       
	      String part1= "/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	      
	      String part2 = "]/td[1]";
		//first row first column
		
	       //html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	
	       //Second row of first column
	       
	      // /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
	      //  /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
	     for(int i=1;i<=36;i++)
	     {
	    	//String cityname=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]")).getText();
	            String cityname = driver.findElement(By.xpath(part1 +i+ part2)).getText();
	    	 
	    	 System.out.println("the city name: "+cityname);
	     
	     }
	     driver.quit();
	       
	}

}
