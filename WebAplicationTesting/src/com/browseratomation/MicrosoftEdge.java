package com.browseratomation;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class MicrosoftEdge {

	public static void main(String[] args) {
    // System.setProperty("webdriver.edge.driver","./driverFiles/MicrosoftWebDriver.exe" );		
    // EdgeDriver driver = new EdgeDriver();
	 //System.setProperty("webdriver.ie.driver", "./driverFiles/IEDriverServer.exe");
		//InternetExplorerDriver d = new InternetExplorerDriver();
		System.setProperty("webdriver.opera.driver", "./driverFiles/OperaSetup.exe");
		OperaDriver d = new OperaDriver();

	
	}

}
