package com.pageobjectmodel2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.generic2.Loginpage2;

public class SignIn {

public void signinbutton(WebDriver driver)

{	
	Loginpage2 signbtn = new Loginpage2(driver);
	signbtn.getSignin().click();
	signbtn.getEmailid().sendKeys("shakila.tasnim.82@gmail.com");
	signbtn.getPassword().sendKeys("aiman2018");
	signbtn.getSubmit().click();
	
	
}
}
