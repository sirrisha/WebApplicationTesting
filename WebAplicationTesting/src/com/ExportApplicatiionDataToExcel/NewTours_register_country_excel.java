package com.ExportApplicatiionDataToExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_register_country_excel {

	public static void main(String[] args) throws IOException  {
		
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		   String url = "http://www.newtours.demoaut.com";
		   
	       ChromeDriver driver = new ChromeDriver();
	          driver.get(url);
	       
	          
	    driver.findElementByLinkText("REGISTER").click();  
	   
	WebElement  country  =driver.findElement(By.name("country"));
	List  < WebElement> countries = country.findElements(By.tagName("option"));
	
      System.out.println("the total number of countries:"+countries.size());
	
      FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/SingleData.xlsx");
	  XSSFWorkbook workbook = new XSSFWorkbook(file);
   XSSFSheet sheet = workbook.getSheet("Sheet1");
      
   
      for(int i=0;i<countries.size();i++)
      {
    	  Row r=sheet.createRow(i);
    	    Cell c = r.createCell(0);
  
     	String country_name = countries.get(i).getText();
     	System.out.println(country_name);
         c.setCellValue(country_name);
         FileOutputStream file1 = new FileOutputStream("./src/com/ExcelTestDataFiles/SingleData.xlsx");
    	 workbook.write(file1);
         
         
      }
		
		
		
      
		
		
		
		
		
		
		
	}

}
