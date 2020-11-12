package com.pageobjectmodel2;

import org.openqa.selenium.WebDriver;

import com.generic2.Loginpage2;

public class Dresses {
	public void Dreses(WebDriver driver) {
		Loginpage2 drs=new Loginpage2(driver);
		drs.getSignin().click();
		drs.getDresses().click();
	}

}
