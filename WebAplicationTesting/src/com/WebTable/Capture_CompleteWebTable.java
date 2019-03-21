package com.WebTable;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_CompleteWebTable {

	public static void main(String[] args)
	
	{
		WebDriver driver = null;
		String url = "https://www.timeanddate.com/worldclock/";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		   
		   driver = new ChromeDriver();
		   driver.get(url);
	       driver.manage().window().maximize();
	       
	       //html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	    
	       //html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[7]
	
	       String part1 ="html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	       String part2 ="]/td[";
	       String part3 ="]";
	       
	       for(int a=1;a<=36;a++)//will goto every row
	    	   
	       {
	    	   for(int b=1;b<=7;b++)//will go to row of every column
	    	   {
	    		   
	    		   String data=driver.findElement(By.xpath(part1+a+part2+b+part3)).getText();
	    		   System.out.print(data+" ");
	    	
	    	   }
	    	   System.out.println("");
	       }
	       
	       driver.quit();   
	
	}

}
