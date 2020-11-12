package com.rundresspage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.generic2.BaseLogin2;
import com.pageobjectmodel2.Dresses;
import com.pageobjectmodel2.SignIn;

public class RunTest2 {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		driver=BaseLogin2.setup();
		SignIn sn=new SignIn();
		sn.signinbutton(driver);
		Dresses dr= new Dresses();
		dr.Dreses(driver);
	}

	
}
