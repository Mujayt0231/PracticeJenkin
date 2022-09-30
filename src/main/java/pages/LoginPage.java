package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement email_input;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password_input;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement login_button;
	
	
	
	public LoginPage(WebDriver driver) throws Exception {
		super(driver);
		PageFactory.initElements(driver, this);
	}



	public void signIn(String email, String password) {
		
		email_input.sendKeys("Jose@gmail.com");
		password_input.sendKeys("123456");
		login_button.click();
		
	}

}
