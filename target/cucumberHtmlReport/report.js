$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("incorrectEmailRegister.feature");
formatter.feature({
  "line": 1,
  "name": "Register functionality with incorrect Email address",
  "description": "I want to verify the error messgae displayed when incorrect e mail address is enetered while registering",
  "id": "register-functionality-with-incorrect-email-address",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17054541349,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#Background : I am on the home page"
    }
  ],
  "line": 6,
  "name": "Error messgae should be displayed when incorrect e mail address is enetered while registering",
  "description": "",
  "id": "register-functionality-with-incorrect-email-address;error-messgae-should-be-displayed-when-incorrect-e-mail-address-is-enetered-while-registering",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on the Sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter incorrect email address and clicks on create an account",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see an error message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.I_am_on_the_Sign_in_page()"
});
formatter.result({
  "duration": 2441201978,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.I_enter_incorrect_email_address_and_clicks_on_create_an_account()"
});
formatter.result({
  "duration": 132196502,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.I_should_see_an_error_message()"
});
formatter.result({
  "duration": 25286517,
  "status": "passed"
});
formatter.after({
  "duration": 230808543,
  "status": "passed"
});
formatter.uri("megaMenu.feature");
formatter.feature({
  "line": 1,
  "name": "Verify working of MegaMenu",
  "description": "I want to verify the working of MegaMenu (Dresses -\u003e Summer dresses)",
  "id": "verify-working-of-megamenu",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16153306555,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#Background : I am on the home page"
    }
  ],
  "line": 6,
  "name": "Working of MegaMenu",
  "description": "",
  "id": "verify-working-of-megamenu;working-of-megamenu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on the Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I hover on Dresses on MegaMenu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Summer Dresses on sub menu",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see Summer Dresses page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.I_am_on_the_Home_page()"
});
formatter.result({
  "duration": 2352185,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.I_hover_on_Dresses_on_MegaMenu()"
});
formatter.result({
  "duration": 3172461193,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.I_click_on_Summer_Dresses_on_sub_menu()"
});
formatter.result({
  "duration": 4208532888,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.I_should_see_Summer_Dresses_page()"
});
formatter.result({
  "duration": 65480781,
  "status": "passed"
});
formatter.after({
  "duration": 227187691,
  "status": "passed"
});
formatter.uri("productGrid.feature");
formatter.feature({
  "line": 3,
  "name": "Validation of product grid arrangement based on Sort By price.",
  "description": "I want to verify the arrangement of product grid after clicking on Sort By: Price on the Summer Dresses page",
  "id": "validation-of-product-grid-arrangement-based-on-sort-by-price.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 21423127229,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Arrangement of product grid on Summer Dresses page",
  "description": "",
  "id": "validation-of-product-grid-arrangement-based-on-sort-by-price.;arrangement-of-product-grid-on-summer-dresses-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on Summer Dresses page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Sort By Price",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the product grid is arranged properly",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.I_am_on_Summer_Dresses_page()"
});
formatter.result({
  "duration": 9600693842,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.I_click_on_Sort_By_Price()"
});
formatter.result({
  "duration": 3396855378,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.I_should_see_the_product_grid_is_arranged_properly()"
});
formatter.result({
  "duration": 108923076,
  "status": "passed"
});
formatter.after({
  "duration": 284623049,
  "status": "passed"
});
formatter.uri("validEmailRegister.feature");
formatter.feature({
  "line": 1,
  "name": "Register functionality with a valid email address",
  "description": "As a user, I want to register with a valid email address",
  "id": "register-functionality-with-a-valid-email-address",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14070307325,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#Background : I am on the home page and navigate to the sign in page"
    }
  ],
  "line": 6,
  "name": "I should be able to register with a valid email address",
  "description": "",
  "id": "register-functionality-with-a-valid-email-address;i-should-be-able-to-register-with-a-valid-email-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on the Sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I fill in valid Email address and click on create an account",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I fill in personal information on create Account page and click on Register",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see My Account page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.I_am_on_the_Sign_in_page()"
});
formatter.result({
  "duration": 2155953890,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.I_fill_in_valid_Email_address_and_click_on_create_an_account()"
});
formatter.result({
  "duration": 146951946,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.I_fill_in_personal_information_on_create_Account_page_and_click_on_Register()"
});
formatter.result({
  "duration": 467902,
  "error_message": "java.lang.NullPointerException\n\tat com.pages.CreateAnAccountFormPage.fillPersonalInformation(CreateAnAccountFormPage.java:65)\n\tat stepDefinitions.StepDefinitions.I_fill_in_personal_information_on_create_Account_page_and_click_on_Register(StepDefinitions.java:99)\n\tat ✽.And I fill in personal information on create Account page and click on Register(validEmailRegister.feature:9)\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.user_should_see_My_Account_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 217327035,
  "status": "passed"
});
});