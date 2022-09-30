package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.WebDriverFactory;

public class BasePage {
	
	
	private static Logger logger = LogManager.getLogger(BasePage.class);

	WebDriver driver;
	
	public BasePage(WebDriver driver) throws Exception {
		try {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			logger.info("Base Page constructor is called, and page factory is initialized");
		} catch (Exception e) {
			logger.error("Error: " + e.getMessage(),e);
			throw e;
		}

	}

}
