package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Newtour_login_annotation extends BaseTest
{
     @Test(priority=0)
	  public void login() throws IOException
	  {
   
      FileInputStream file = new FileInputStream("./src/com/ApplicationTestDataFiles/NewTours_loginTestData.xlsx");
	  XSSFWorkbook workbook = new XSSFWorkbook(file);
       XSSFSheet sheet = workbook.getSheet("Sheet1");
    
          Row r=sheet.getRow(1);

      driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
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
   
    FileOutputStream file1 = new FileOutputStream("./src/com/ApplicationTestDataFiles/NewTours_loginTestData.xlsx");
    workbook.write(file1);
	  
   
      
  
    }

}

	
	
	
	

