package com.Annotations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annotations5 
{
	WebDriver driver =null; 
	String url = "http://www.newtours.demoaut.com";
	
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
	      
		   driver = new ChromeDriver();
	       driver.get(url);
		   driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
	}
	
	@Test(priority=0)
	public  void Login()
	{
       System.out.println("enter into register");
       
       driver.findElement(By.linkText("REGISTER")).click(); 
        
	}
	@Test(priority=1)
	    public void validation() throws IOException
	    {

          FileInputStream file = new FileInputStream("./src/com/ApplicationTestDataFiles/Newtour_register.xlsx");
    	  XSSFWorkbook workbook = new XSSFWorkbook(file);
         XSSFSheet sheet = workbook.getSheet("Sheet1");
          
        Row r=sheet.getRow(1);
        System.out.println("entering data");
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
	  
	 
	 
	 // double f =r.getCell(9).getNumericCellValue();
	  // long z =(long)f;
	 //String email =Long.toString(z);
	  driver.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
	  
	 //driver.findElement(By.name("email")).sendKeys(email);
	    driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
	    driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());  
	    driver.findElement(By.name("register")).click();
               
	 
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
  	   
  	   FileOutputStream file1 = new FileOutputStream("./src/com/Application_test_results/NewTours_TestResultFiles2.xlsx");
	    workbook.write(file1);
  	   
  	    driver.navigate().back();
	    
        }
         
	

		@AfterTest
          public void tearDown()
           {
	        driver.close();
            }
	
	
}
