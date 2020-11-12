package com.generic2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin2 {

	public static WebDriver driver;
	
	public static WebDriver setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alshakailin\\git\\repository\\Brismtech\\src\\Driver\\chromedriver.exe");

		 driver=new ChromeDriver();
		 Loginpage2 obj= new Loginpage2(driver);
		 driver.get(obj.getUrl());
		  return driver;
		 
	}	 
		 
		 
		 
	      

	
}
