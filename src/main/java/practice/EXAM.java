package practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EXAM {
	
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.findElement(By.xpath("" )).getText().equals("Welcome to Codility");
		
		
		List<WebElement> webElems = driver.findElements(null);
		
	}

}
