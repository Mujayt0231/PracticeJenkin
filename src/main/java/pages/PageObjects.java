package pages;

import utilities.WebDriverFactory;

public class PageObjects {

	public static HomePage getHomePage() throws Exception {
		return new HomePage(WebDriverFactory.getDriver());
	}
	
	public static LoginPage getLoginPage() throws Exception {
		return new LoginPage(WebDriverFactory.getDriver());
	}
	
	
}
