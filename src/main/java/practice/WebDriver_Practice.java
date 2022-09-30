package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Practice {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
		
		driver.findElement(By.id("login-button")).click();
		String email_error_msg = driver.findElement(By.xpath("//div[text()='Email is required']")).getText();
		String password_error_msg = driver.findElement(By.xpath("//div[text()='Password is required']")).getText();
		
		System.out.println(email_error_msg);
		System.out.println(password_error_msg);
		
		
		
	}

}
