package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.utilities.TestBase;

public class CreateAnAccountFormPage extends TestBase{
	
	@FindBy(id = "id_gender2")
	WebElement title;
	
	@FindBy(id = "customer_firstname")
	WebElement customer_firstname;
	
	@FindBy(id = "customer_lastname")
	WebElement customer_lastname; 
	
	@FindBy(id = "passwd")
	WebElement password;
	
	@FindBy(id = "company")
	WebElement address_company;
	
	@FindBy(id = "address1")
	WebElement address;
	
	@FindBy(id = "city")
	WebElement city;
	
	@FindBy(name = "id_state")
	WebElement state;
	
	@FindBy(name = "id_country")
	WebElement country;
	
	@FindBy(id = "postcode")
	WebElement postalcode;
	
	@FindBy(id = "phone_mobile")
	WebElement MobilePhone;
	
	@FindBy(id = "submitAccount")
	WebElement Register;
	
	@FindBy(linkText = "My account")
	WebElement myAccountText;

	
	//public void titleClick() {
		//title.click();
	//}
	
	public void registerClick() {
		Register.click();
	}
	
	public void fillPersonalInformation(String firstName, String lastName, String passwd, 
			String company, String addressLine1,	String cityName, String stateName, 
			String countryName, String zipcode, String mobileNumber) {
		
	
	customer_firstname.sendKeys(firstName);
	customer_lastname.sendKeys(lastName);
	password.sendKeys(passwd);
	address_company.sendKeys(company);
	address.sendKeys(addressLine1);
	city.sendKeys(cityName);
	Select drpState = new Select(state);
	drpState.selectByVisibleText(stateName);
	postalcode.sendKeys(zipcode);
	Select drpCountry = new Select(country);
	drpCountry.selectByVisibleText("countryName");
	MobilePhone.sendKeys(mobileNumber);
	}
	
	public void myAccountPage() {
		String confmessage = myAccountText.getText();
		Assert.assertEquals("My account", confmessage);
	}
}
