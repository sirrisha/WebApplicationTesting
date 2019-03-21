package com.select;

//import org.apache.bcel.generic.Select;//
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionOfElements {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		   String url = "http://www.newtours.demoaut.com";
		   
	       ChromeDriver driver = new ChromeDriver();
	          driver.get(url);
	          driver.findElementByLinkText("REGISTER").click();
		
	          WebElement  country  =driver.findElement(By.name("country"));
	           Select selection = new Select(country);
	           
	           selection.selectByIndex(12);
	         //<option value="243">ARMENIA </option>
	           selection.selectByValue("243");
	           
	           selection.selectByVisibleText("INDIA");
	           
	           
	           
		
		
	}

}
