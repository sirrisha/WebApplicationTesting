package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class NewTour_Hybrid extends BaseTest
{
	@Test(priority=0)
	public  void Register() throws IOException
	{
		 FileInputStream file = new FileInputStream("./NewTours.properties");
		   
		   Properties pr = new Properties();
		   pr.load(file);
		  
       
       driver.findElement(By.linkText(pr.getProperty("Register"))).click(); 
      

          FileInputStream file1 = new FileInputStream("./src/com/ApplicationTestDataFiles/Newtour_register.xlsx");
    	  XSSFWorkbook workbook = new XSSFWorkbook(file1);
         XSSFSheet sheet = workbook.getSheet("Sheet1");
          
        Row r=sheet.getRow(1);
    
        driver.findElement(By.name(pr.getProperty("FirstName"))).sendKeys(r.getCell(0).getStringCellValue());
        driver.findElement(By.name(pr.getProperty("LastName"))).sendKeys(r.getCell(1).getStringCellValue());
	 
	  double d = r.getCell(2).getNumericCellValue();
	   long x =(long)d;
	 String phone =Long.toString(x);
	  
	 driver.findElement(By.name(pr.getProperty("Phone"))).sendKeys(phone);
	 driver.findElement(By.id(pr.getProperty("UserName_reg"))).sendKeys(r.getCell(3).getStringCellValue());
	 driver.findElement(By.name(pr.getProperty("Address"))).sendKeys(r.getCell(4).getStringCellValue());
	 driver.findElement(By.name(pr.getProperty("City"))).sendKeys(r.getCell(5).getStringCellValue());
	 driver.findElement(By.name(pr.getProperty("State"))).sendKeys(r.getCell(6).getStringCellValue());
	 driver.findElement(By.name(pr.getProperty("PostalCode"))).sendKeys(r.getCell(7).getStringCellValue());
	 driver.findElement(By.name(pr.getProperty("Country"))).sendKeys(r.getCell(8).getStringCellValue());
	  
	 
	 
	 
	// driver.findElement(By.name(pr.getProperty("Email"))).sendKeys(r.getCell(9).getStringCellValue());
	  
	 driver.findElement(By.name(pr.getProperty("Password"))).sendKeys(r.getCell(10).getStringCellValue());
	 driver.findElement(By.name(pr.getProperty("ConfirmPassword"))).sendKeys(r.getCell(11).getStringCellValue());  
	 driver.findElement(By.name(pr.getProperty("Register_click"))).click();
           try
           {
	 
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

	    	String  expected_text="Note";
		  String actual_text=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		 
		  if(actual_text.contains(expected_text))
		  {
		    System.out.println("Not registered--sorry");
  		    r.createCell(12).setCellValue("Not register");
  		  
  		    File RegisterFail_Error=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  	    
    	  FileUtils.copyFile(RegisterFail_Error, new File("./Screenshot/register.png"));
		  }
  	     }
	  	Thread.sleep(5000);
           }
	    catch(Exception e)
	      {
	    	  System.out.println("The exception is:"+e);
	    	  r.createCell(12).setCellValue("Failed to perform operation");  
	      }
	    
  	     
  	   
  	   FileOutputStream file2 = new FileOutputStream("./src/com/Application_test_results/NewTours_hybrid.xlsx");
	    workbook.write(file2);
  	   
  	    driver.navigate().back();
	    
          }
         
}
