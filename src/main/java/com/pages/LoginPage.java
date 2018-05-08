package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.TestBase;
import com.utilities.randomNumber;



public class LoginPage extends TestBase {
	
	@FindBy(id= "email_create")
	WebElement email;
	
	@FindBy(id ="SubmitCreate")
	WebElement Submit;
	
	@FindBy(xpath = "//div[@id=\"create_account_error\"]")
	WebElement errorMessage;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void invalidEmailAddress(String enterEmail) {
		email.sendKeys(enterEmail);
	}
	
	public void clickCreateAnAccount() {
		Submit.submit();
	}
	
	public String incorrectErrorMessage() {
	 String message= errorMessage.getText();
	 return message;
		
	}
	
	public void validEmailAddress() {
		randomNumber r = new randomNumber();
		String emailString = "Example" + r.gen();
		String emailAddress = emailString + "@gmail.com";
		email.sendKeys(emailAddress);
	}
	
	
	
}
