package cucumber.POM;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase1 {
	
	private WebDriver driver;
	
	
	
	@BeforeTest
	public void initializingDriver() {
		
		System.out.println("we are initializing driver");
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath + "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.howardcc.edu/");
		System.out.println("chrome driver initialized");
	}
	
	@Test(priority = 0)
	public void verifyLink() {
		System.out.println("we are verifying link");
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.howardcc.edu/";
		Assert.assertEquals(currentUrl,expectedUrl);
		System.out.println("this is current Url ==> " + currentUrl + ", and this is expected Url==> " + expectedUrl);
	}

	
	@AfterTest
	public void quitting() {
		driver.close();
		driver.quit();
	}
}
