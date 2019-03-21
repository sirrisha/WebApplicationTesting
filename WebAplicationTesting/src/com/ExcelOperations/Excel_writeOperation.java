package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_writeOperation {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/SingleData.xlsx");
		  XSSFWorkbook workbook = new XSSFWorkbook(file);
       XSSFSheet sheet = workbook.getSheet("Sheet1");
		  
	Row	r =sheet.createRow(2);
	   
	Cell c=r.createCell(3);
	 
	c.setCellValue("hello");
	 //to save the data
	FileOutputStream file1 = new FileOutputStream("./src/com/ExcelTestDataFiles/SingleData.xlsx");
	 workbook.write(file1);
	 
	
	}

}
