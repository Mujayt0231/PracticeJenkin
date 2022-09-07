package cucumber.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertiesPractice {
	static WebDriver driver;
	
//	public static void main(String[] args) throws IOException {
//		String getProperty = System.getProperty("user.dir");
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream(getProperty + "/src/test/resources/ConstantData.Properties");
//		prop.load(fis);
//		String browser = prop.getProperty("browser");
//		
//		if(browser.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver",getProperty + "/Drivers/chromedriver.exe");
//			try {
//				driver = new ChromeDriver();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		String url = prop.getProperty("url");
//		driver.get(url);
//		
//	}
	
	
	@Test
	public void initialization() throws IOException {
		String projectPath = System.getProperty("user.dir");
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(projectPath + "/src/test/resources/ConstantData.properties");
		prop.load(fis);
		
		String browserValue = prop.getProperty("browser");
		if(browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "/Drivers/chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		driver.get(prop.getProperty("url"));
	}

}
