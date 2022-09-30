package pom;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class BoraTech_SignUp {
	
//	private static final Logger logger = LogManager.getLogger(BoraTech_SignUp.class);
	WebDriver driver;
	WebDriverWait wait;
	
	@Parameters("HomePageurl")
	@BeforeTest
	public void initilizeDriver(String url) {
		System.out.println("we are initializing driver");
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath + "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
//		logger.info("Initializing the driver");
	}
	
	
	@Parameters("HomePageurl")
	@Test
	public void VerifyHomePageUrl(String url) {
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = url;
		
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	
	@Test(priority = 0)
	public void click_SignIn_Button() {
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	}
	
	@Parameters("SignUpPageurl")
	@Test(priority = 1)
	public void VerifySigUpPagaUrl(String url) {
//		wait.until(ExpectedConditions.urlContains(url));
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = url;
		Assert.assertEquals(currentUrl, expectedUrl);
		System.out.println("currentUrl ==> " + currentUrl + " , expectedUrl ==> " + expectedUrl);
	}
	
	@Test(dependsOnMethods = "VerifySigUpPagaUrl",dataProvider = "dataProvider" , dataProviderClass = DataProviders.class)
	public void Sing_Up(String name,String emailAdd, String password, String confirmPass) {
		driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys(emailAdd);
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name = 'password2']")).sendKeys(confirmPass);
		driver.findElement(By.xpath("//input[@value= 'Register']")).click();
		
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//	}
	

}
