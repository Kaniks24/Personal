package stepDefinitions;

import org.junit.Assert;
import com.pages.CreateAnAccountFormPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.SummerDressesPage;
import com.utilities.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions extends TestBase {

	public StepDefinitions() {
	}

	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	SummerDressesPage summerDressesPage = new SummerDressesPage();
	CreateAnAccountFormPage formPage = new CreateAnAccountFormPage();

	// Incorrect Email register Feature

	@Given("^I am on the Sign in page$")
	public void I_am_on_the_Sign_in_page() throws Throwable {
		homePage.signInClick();
	}

	@When("^I enter incorrect email address and clicks on create an account")
	public void I_enter_incorrect_email_address_and_clicks_on_create_an_account() throws Throwable {
		String enterEmail = "Test123gmail.com";
		loginPage.invalidEmailAddress(enterEmail);
		loginPage.clickCreateAnAccount();
	}

	@Then("^I should see an error message$")
	public void I_should_see_an_error_message() throws Throwable {
		String returnMessage = loginPage.incorrectErrorMessage();
		Assert.assertEquals("", returnMessage);
	}

	// MegaMenu Feature

	@Given("^I am on the Home page$")
	public void I_am_on_the_Home_page() throws Throwable {
	}

	@When("^I hover on Dresses on MegaMenu$")
	public void I_hover_on_Dresses_on_MegaMenu() throws InterruptedException {
		homePage.megaMenuFeature();
	}

	@And("^I click on Summer Dresses on sub menu$")
	public void I_click_on_Summer_Dresses_on_sub_menu() throws Throwable {
		homePage.subMenuFeature();

	}

	@Then("^I should see Summer Dresses page$")
	public void I_should_see_Summer_Dresses_page() throws Throwable {
		String confmessage = homePage.SummerDressesPageDisplayed();
		Assert.assertEquals("SUMMER DRESSES ", confmessage);
	}

	// Product Grid feature

	@Given("^I am on Summer Dresses page$")
	public void I_am_on_Summer_Dresses_page() throws Throwable {
		homePage.megaMenuFeature();
		homePage.subMenuFeature();
	}

	@When("^I click on Sort By Price$")
	public void I_click_on_Sort_By_Price() throws InterruptedException {
		summerDressesPage.SummerDressesSortByPrices();
	}

	@Then("^I should see the product grid is arranged properly$")
	public void I_should_see_the_product_grid_is_arranged_properly() throws Throwable {
		summerDressesPage.sortCheckPrices();
		summerDressesPage.verifyProductGrid();
	}

	// Valid Email Register feature

	@When("^I fill in valid Email address and click on create an account$")
	public void I_fill_in_valid_Email_address_and_click_on_create_an_account() throws Throwable {
		loginPage.validEmailAddress();
		loginPage.clickCreateAnAccount();
	}

	@And("^I fill in personal information on create Account page and click on Register$")
	public void I_fill_in_personal_information_on_create_Account_page_and_click_on_Register() throws Throwable {
		
		//formPage.titleClick();

		formPage.fillPersonalInformation(prop.getProperty("firstName"), prop.getProperty("lastName"),
				prop.getProperty("passwd"), prop.getProperty("company"), prop.getProperty("addressLine1"),
				prop.getProperty("cityname"), prop.getProperty("statename"), prop.getProperty("countryname"),
				prop.getProperty("zipcode"), prop.getProperty("mobileNumber"));
	
		formPage.registerClick();
	}

	@Then("^I should see My Account page$")
	public void user_should_see_My_Account_page() throws Throwable {
		formPage.myAccountPage();
	}

}
