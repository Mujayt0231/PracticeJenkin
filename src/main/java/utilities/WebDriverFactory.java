package utilities;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
	
	private static Logger logger = LogManager.getLogger(WebDriverFactory.class);

	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

	
//	public static WebDriver driver;
	
public static WebDriver getDriver() throws Exception {
		
			WebDriver driver = null;
			
			driver = drivers.get("Chrome");
			if(driver==null) {
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				drivers.put("Chrome", driver);
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			return driver;

}

}
