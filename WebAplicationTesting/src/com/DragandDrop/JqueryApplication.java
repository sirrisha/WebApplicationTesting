package com.DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryApplication {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		   
		   ChromeDriver driver = new ChromeDriver();
	
    
	   String url = "http://jqueryui.com/droppable/";
       driver.get(url);
       Thread.sleep(10000);
       
      /* <div id="draggable" class="ui-widget-content ui-draggable ui-draggable-handle"
       *  style="position: relative; left: -2px; top: -19px;">
   	<p>Drag me to my target</p>
   </div>*/
       
 //WebElement drag_element=driver.findElement(By.id("draggable"));
      
   /* unable to locate 3 reasons
    * 1. the properties not given by me as a test engineer so
    *     cross check
    * 2. selenium webdriver scripts executin very fast so 
    *    browser not get it so synchroniztion via explict
    *    thread.sleep();
    * 3. inspect the element just move to the tags and check 
    *    whether any tag with name called "Frame" or "iframe"
    *    the piece of code represented as ablock.
    *    selenium can not directley automate the element created
    *     on frame of a page
    */
      
 //<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>//
       driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
     // drage element  
       
       WebElement drag_element=driver.findElement(By.id("draggable"));

       /*drop element <div id="droppable" class="ui-widget-header ui-droppable ui-state-highlight">
   	<p>Dropped!</p>
   	</di*/
       
    WebElement drop_element=driver.findElement(By.id("droppable"));
    
    Actions act = new Actions(driver);
     act.dragAndDrop(drag_element, drop_element).perform();
     
      driver.switchTo().defaultContent();
      /* this will do focus of object from frame to actual web
        page  or access to webpage in order to do any actions 
         with other elements*/
	}

}
