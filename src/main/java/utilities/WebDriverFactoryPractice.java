package utilities;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactoryPractice {

	private static Logger logger = LogManager.getLogger(WebDriverFactoryPractice.class);
	
	public static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

	public static WebDriver getDriver() throws Exception {

		WebDriver driver = null;

		if (Constants.browserName.equalsIgnoreCase("Chrome")) {
			driver = drivers.get("Chrome");

			if (driver == null) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				drivers.put("Chrome", driver);
			}
		}

		else if (Constants.browserName.equalsIgnoreCase("IE")) {
			driver = drivers.get("IE");
			if (driver == null) {
				// Initialization

				drivers.put("IE", driver);
			}

		}

		else if (Constants.browserName.equalsIgnoreCase("Firefox")) {
			driver = drivers.get("Firefox");
			if (driver == null) {
				// Initialization

				drivers.put("Firefox", driver);
			}

		}
		
		else {
			logger.error("bruh, check your browser name before you enter ==> " + Constants.browserName);
			throw new Exception("Invalid browser name");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
 		driver.manage().window().maximize();
		return driver;
	}
	
	public static void closeDrivers() {
		for (String driver: drivers.keySet()) {
			drivers.get(driver).close();
			drivers.get(driver).quit();
		}
		
		drivers.clear();
	}

}
