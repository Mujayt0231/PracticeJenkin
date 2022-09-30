package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import pages.PageObjects;
import utilities.WebDriverFactory;

public class LoginSteps {
	
	
	@Given("user is on home page")
	public void user_is_on_home_page() throws Exception {
		WebDriverFactory.getDriver().get("https://boratech.herokuapp.com/");
	}

	@Then("user click Login button")
	public void user_click_login_button() throws Exception {
		PageObjects.getHomePage().click_LoginButton();

	}

	@Then("verify if user have navigated to Login page")
	public void verify_if_user_have_navigated_to_login_page() throws Exception {
		System.out.println(WebDriverFactory.getDriver().getCurrentUrl());
	}

	@Then("user enter valid {string} and {string} and click login button")
	public void user_enter_valid_and_and_click_login_button(String email, String password) throws Exception {
		PageObjects.getLoginPage().signIn(email, password);
		
	}

	@Then("user is on Dashboard page")
	public void user_is_on_dashboard_page() throws Exception {
		System.out.println(WebDriverFactory.getDriver().getCurrentUrl());
	}

}
