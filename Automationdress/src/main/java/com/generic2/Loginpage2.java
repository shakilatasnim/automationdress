package com.generic2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {

	public Loginpage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	private String url="http://automationpractice.com/index.php";

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	@FindBy(xpath="(//a[@class='login']") 
	private WebElement signIn;
	
	@FindBy(xpath="(//input[@class='is_required validate account_input form-control'][2]")	
	private WebElement emailid;
	
	@FindBy(xpath="(//input[@class='is_required validate account_input form-control'][3]")
	private WebElement password;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement submit;
	
	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public void setEmailid(WebElement emailid) {
		this.emailid = emailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getSignin() {
		return signIn;
	}

	public void setSignin(WebElement signin) {
		this.signIn = signin;
	}

	@FindBy(xpath="(//a[@class='sf-with-ul'])[4]")
	private  WebElement Dresses;

	public WebElement getDresses() {
		return Dresses;
	}

	public void setDresses(WebElement dresses) {
		Dresses = dresses;
	}
}
