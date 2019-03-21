package com.Grid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTours_LogInTest {
    
	@Parameters("Browser")
	@Test
	public void login(String browser) throws IOException
	{
		
		//connection to Node System
		System.out.println("The name of the browser is:"+browser);
		
		//DesiredCapabilities is used to specify which browser & platform should be considered during test run
		
		DesiredCapabilities cap = null;
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else 
			if(browser.equalsIgnoreCase("chrome"))
			{
				cap = DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
		
		//connecting to hub
		RemoteWebDriver driver= new RemoteWebDriver(new URL("http://192.168.1.180:4444/wd/hub"),cap);
		
		
		String url="http://newtours.demoaut.com";
		driver.get(url);
	  FileInputStream	file = new FileInputStream("./src/com/ApplicationTestDataFiles/NewTours_loginTestData.xlsx");
		  XSSFWorkbook workbook = new XSSFWorkbook(file);
	       XSSFSheet sheet = workbook.getSheet("Sheet1");
	    
	       int rowCount =sheet.getLastRowNum();
	          System.out.println(rowCount);
	          for(int i=1;i<=rowCount;i++)
	          {   	  
	        	 Row r= sheet.getRow(i);
	        	 driver.findElement(By.name("userName")).clear();
	      driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
	       
	      driver.findElement(By.name("password")).clear(); 
	      driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
	       driver.findElement(By.name("login")).click();

		  
	        String   expectedTitle = "Find";
	      System.out.println("the expected result is:"+expectedTitle);
	 

	      String   actualTitle = driver.getTitle();
	          System.out.println("the actual result is:"+actualTitle);

	      if(actualTitle.contains(expectedTitle))
			  {
		         System.out.println("login successfull");
		         r.createCell(2).setCellValue("login successfull");
			  }
	    else
	     {
		   System.out.println("title is not matched--failed");
		  r.createCell(2).setCellValue("login not successfull");
	      }
	   
	    FileOutputStream file1 = new FileOutputStream("./src/com/Application_test_results/NewTours_grid.xlsx");
	    workbook.write(file1);
	    driver.navigate().back();
	    
	          }
	          
	          driver.quit();
					
}
		
		
	}
	
	
	

