package com.pages;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.TestBase;

public class HomePage extends TestBase{

	@FindBy(linkText = "Sign in")
	WebElement SignInLink;
	
	@FindBy(xpath ="/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
	WebElement megaMenu;
	
	@FindBy(xpath ="/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/a")
	WebElement subMenu;
	
	@FindBy(xpath = "//span[@class='cat-name']")
	WebElement summerDressesText;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage signInClick() {
		SignInLink.click();
		return new LoginPage();
	}

	public void megaMenuFeature() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(megaMenu).build().perform();
		Thread.sleep(3000);
}
	
	public SummerDressesPage subMenuFeature() {
	subMenu.click();
	return new SummerDressesPage();
	}
	
	public String SummerDressesPageDisplayed() {
		String SummerMessage = summerDressesText.getText(); 
		return SummerMessage;
		 
	}
}
