package com.Annotations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Annotation6 {
	
	
	
  WebDriver driver = null;
    
	  
	  @Test
      public void Excel() throws IOException
      {
		  System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
	  	   String url = "http://www.newtours.demoaut.com";
	  	   
	           driver = new ChromeDriver();
	            driver.get(url);
	  
          driver.findElement(By.linkText("REGISTER")).click(); 
         

          FileInputStream file = new FileInputStream("./src/com/ApplicationTestDataFiles/multiple_newtour.xlsx");
    	  XSSFWorkbook workbook = new XSSFWorkbook(file);
       XSSFSheet sheet = workbook.getSheet("Sheet1");
      
       int rowCount = sheet.getLastRowNum();
      for(int i=1;i<=rowCount;i++)
      {
         Row r=sheet.getRow(i);
      
      
      driver.findElement(By.name("email")).sendKeys(r.getCell(0).getStringCellValue());
	    driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
	    driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(2).getStringCellValue());  
	    driver.findElement(By.name("register")).click();
     
       
       String   expected = r.getCell(2).getStringCellValue();
  	 System.out.println("the expected result is:"+expected);
  	 
  	
  	 String   actual = r.getCell(1).getStringCellValue();
  	System.out.println("the actual result is:"+actual);
  
  	  if(actual.contains(expected))
  			  {
  		         System.out.println("Registered successfully");
  		         r.createCell(3).setCellValue("Register successfull");
  			  }
  	    else
  	     {
  		   System.out.println("Not registered--sorry");
  		    r.createCell(3).setCellValue("Not register");
  	      }
  	   
  	   FileOutputStream file1 = new FileOutputStream("./src/com/Application_test_results/NewTours_TestResultFiles1.xlsx");
	    workbook.write(file1);
  	   
  	    driver.navigate().back();
	   
        }
      }

}
