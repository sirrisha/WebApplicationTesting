package com.NewTours.TestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.NewTours.lib.LogInKeywords;

public class LoginTest {

	@Test
	public void login() throws IOException
	{
		LogInKeywords keys= new LogInKeywords();
		  FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/ActionsKeywords.xlsx");
		  XSSFWorkbook workbook = new XSSFWorkbook(file);
	       XSSFSheet sheet = workbook.getSheet("Sheet1");
	      int rowCount=sheet.getLastRowNum();
	      Row r = null;
	      for(int i=1;i<=rowCount;i++)
	      {
	    	  r=sheet.getRow(i);
	      
	      String runMode= r.getCell(4).getStringCellValue();
	      if(runMode.equalsIgnoreCase("y"))
	      {
	    	  String keyword= r.getCell(3).getStringCellValue();
	           if(keyword.equals("launchBrowser"))
	        		   {
	        	         keys.launchBrowser();
	        	         
	        		   }
	           else
	        	   if(keyword.equals("navigate"))
	        	   {
	        		   keys.navigate();
	        	   }
	        	   else
	        		   if(keyword.equals("enterUsername"))
	        		   {
	        			   keys.enterUsername();
	        		   }
	        		   else
	        			   if(keyword.equals("enterPassword"))
	        			   {
	        				   keys.enterPassword();
	        			   }
	        			   else
	        				   if(keyword.equals("clickLogin"))
	        				   {
	        					   keys.clickLogin();
	        				   }   
	        	   }
	      
	      
	      }
	      
	      
	      
	      }
	      
		
		
}	

