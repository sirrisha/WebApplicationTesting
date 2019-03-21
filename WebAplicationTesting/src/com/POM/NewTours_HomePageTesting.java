package com.POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTours_HomePageTesting extends BaseTest {

	@Test
	public void HomePage() throws IOException, InterruptedException
	{
		WelcomeMercuryTours wmt = PageFactory.initElements(driver, WelcomeMercuryTours.class);
	
	     wmt.signOn();
	    
	     System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    System.out.println();
	    driver.navigate().back();
	    
	    wmt.register();
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    System.out.println();
	    driver.navigate().back();
	    
	     wmt.support();
	     System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 System.out.println();
		 driver.navigate().back();
		    
		 wmt.contact();
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 System.out.println();
		 driver.navigate().back();
		 
		// wmt.logIn("tutorila", "tutorial");
		 
	 FileInputStream file = new FileInputStream("./src/com/ApplicationTestDataFiles/login_newTour_POM.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
	       XSSFSheet sheet = workbook.getSheet("Sheet1");
	    
	     int rowCount = sheet.getLastRowNum();
	     for(int k=1;k<=rowCount;k++)
	    	 
	     {
	    	Row r=sheet.getRow(k);
		 
		 wmt.logIn(r.getCell(0).getStringCellValue(),r.getCell(1).getStringCellValue());
		 
	     System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 System.out.println();
		 
		 String expected_text="Welcome";
		 System.out.println("the expected text is:"+expected_text);
		 
		 String actual_text=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/b")).getText();
		 System.out.println("the actual text is:"+actual_text); 
	   
		 if(actual_text.contains(expected_text))
		 {
			 System.out.println("login success");
			 r.createCell(2).setCellValue("pass");
		 }
		 else
		 {
			 System.out.println("failed");
			 r.createCell(2).setCellValue("fail");
		 }
		 
		 
		  FileOutputStream file1 = new FileOutputStream("./src/com/Application_test_results/login_newTour_POM.xlsx");
	       workbook.write(file1);
	   	
       }    
	   
	     driver.navigate().back();
	     
	     FileInputStream file2 = new FileInputStream("./src/com/ApplicationTestDataFiles/Newtour_register.xlsx");
   	  XSSFWorkbook workbook1 = new XSSFWorkbook(file2);
        XSSFSheet sheet1 = workbook.getSheet("Sheet1");
         
       Row r=sheet.getRow(1);
      
    
       wmt.Register1(r.getCell(0).getStringCellValue(),r.getCell(1).getStringCellValue(),r.getCell(2).getNumericCellValue(),r.getCell(3).getStringCellValue(),r.getCell(4).getStringCellValue(),r.getCell(5).getStringCellValue(),r.getCell(6).getStringCellValue(),r.getCell(7).getStringCellValue(),r.getCell(8).getStringCellValue(),r.getCell(9).getStringCellValue(),r.getCell(10).getStringCellValue(),r.getCell(11).getStringCellValue());       
      /* System.out.println("entering data");
     driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
	  driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
	 
	  double d = r.getCell(2).getNumericCellValue();
	   long x =(long)d;
	 String phone =Long.toString(x);
	  
	  driver.findElement(By.name("phone")).sendKeys(phone);
	  driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
	  driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
	  driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
	  driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
	  driver.findElement(By.name("postalCode")).sendKeys(r.getCell(7).getStringCellValue());
	  driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
	  
	  driver.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
	
	    driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
	    driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());  
	    driver.findElement(By.name("register")).click();*/
              
	 
	    String   expected = r.getCell(9).getStringCellValue();

	  	 System.out.println("the expected result is:"+expected);
	  	 
	  	
	  	 String   actual = driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
	  	System.out.println("the actual result is:"+actual);
 	  
	  	if(actual.contains(expected))
 			  {
 		         System.out.println("Registered successfully");
 		         r.createCell(12).setCellValue("Register successfull");
 			  }
 	    else
 	     {
 		   System.out.println("Not registered--sorry");
 		    r.createCell(12).setCellValue("Not register");
 	      }
 	   
 	   FileOutputStream file3 = new FileOutputStream("./src/com/Application_test_results/NewTours_TestResultFiles2.xlsx");
	    workbook.write(file3);
 	   
 	    driver.navigate().back();
	    
       }

	     
	 }
