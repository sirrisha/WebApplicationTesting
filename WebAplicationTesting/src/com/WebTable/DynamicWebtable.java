package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DynamicWebtable {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		String url = "https://www.timeanddate.com/worldclock/";
		//System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		   
		driver = new ChromeDriver();
		   driver.get(url);
		 
		
		   //   /html/body/div[1]/div[6]/section[1]/div/section/div[1]
	
		   WebElement table =driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]"));
		
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		System.out.println("the total number of rows:"+rows.size());
		for(int i=0;i<rows.size();i++)
		{
			List <WebElement> cols=rows.get(i).findElements(By.tagName("td"));
		   for (int j=0;j<cols.size();j++)
		   {
		
		            String data=cols.get(j).getText();
		            System.out.print(data + " ");
		   }
		   
		   System.out.println("");
		}  
		
		
		driver.quit();
		
		
		
		
	}

}
