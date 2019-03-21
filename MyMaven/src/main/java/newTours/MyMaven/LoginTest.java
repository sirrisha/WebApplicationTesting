package newTours.MyMaven;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	Logger logger = Logger.getLogger("LoginTest");
	
	  WebDriver driver =null;
	  String url = "http://newtours.demoaut.com";
	  String userName = "tutorial";
	  String password = "tutorial";
	  
	@BeforeTest
   public void setUp()
  {
	 PropertyConfigurator.configure("log4j_properties.txt");
	 
	 System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		  driver = new ChromeDriver();
	logger.info("chrome browser opened successfully");
	 
	driver.get(url);
    logger.info("successfully naviagted to newtours");
	
    driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
	@Test
	 public void logIn()
	 {
		driver.findElement(By.name("userName")).sendKeys(userName);
	     logger.info("enter username");
		
		driver.findElement(By.name("password")).sendKeys(password);
	    logger.info("enter password");
		
		driver.findElement(By.name("login")).click();
		logger.info("perform click operaion");
	       
		String   expectedTitle = "Find";
	      // System.out.println("the expected result is:"+expectedTitle);
	  logger.info("the expected result is:"+expectedTitle);

	       String   actualTitle = driver.getTitle();
	           //System.out.println("the actual result is:"+actualTitle);
      logger.info("the actual result is:"+actualTitle);
	       
	       if(actualTitle.contains(expectedTitle))
	 		  {
	 	         //System.out.println("login successfull");
	 	         logger.info("login successfull");
	 		  }
	     else
	      {
	 	   //System.out.println("title is not matched--failed");
	 	  logger.info("title is not matched--failed");
	       }


	    }
	  @AfterTest
	     public void tearDown()
	     {
		  driver.quit();
	     }
		
		
      }
	
	

