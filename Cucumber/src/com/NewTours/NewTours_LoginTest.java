package com.NewTours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewTours_LoginTest {

	WebDriver driver =null; 
	//String userName="tutorial";
	//String password= "tutorial";
	String url = "http://www.newtours.demoaut.com";
	

		
	@Given("^Open GoogleChrome Browser and navigate to newtours application$")
	public void Open_GoogleChrome_Browser_and_navigate_to_newtours_application() 
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
	      
		   driver = new ChromeDriver();
	       driver.get(url);
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			}

	/*@When("^User enters valid Username and Password and click on SignIn button$")
	public void User_enters_valid_Username_and_Password_and_click_on_SignIn_button()
	{
		driver.findElement(By.name("userName")).sendKeys(userName);
	      driver.findElement(By.name("password")).sendKeys(password);
	       driver.findElement(By.name("login")).click();

		
	 }*/
	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\" and click on SignIn button$")
	public void User_enters_valid_and_and_click_on_SignIn_button(String UserName, String Password) 
	{
		driver.findElement(By.name("userName")).sendKeys(UserName);
	      driver.findElement(By.name("password")).sendKeys(Password);
	       driver.findElement(By.name("login")).click();

			
		}

	@Then("^User should be able to succesfully login to the Application$")
	public void User_should_be_able_to_succesfully_login_to_the_Application()    
	{
	       String   expectedTitle = "Find";
	       System.out.println("the expected result is:"+expectedTitle);
	  

	       String   actualTitle = driver.getTitle();
	           System.out.println("the actual result is:"+actualTitle);

	       if(actualTitle.contains(expectedTitle))
	 		  {
	 	         System.out.println("login successfull");
	 	         
	 		  }
	     else
	      {
	 	   System.out.println("title is not matched--failed");
	 	        }
	       driver.quit();
	    

		
	}


	
}

