package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	
	static private Logger logger = LogManager.getLogger(HomePage.class);
	
	
	@FindBy(xpath = "//a[@class='btn btn-light']")
	WebElement login_Button;
	
	
	
	public HomePage(WebDriver driver) throws Exception {
		
		super(driver);
		
		PageFactory.initElements(driver, this);
		logger.info("Page factory initialize");
	}
	
	
	public void click_LoginButton() {
		login_Button.click();
		
	}

}
