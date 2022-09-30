package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.WebDriverFactory;

public class Hooks {
	
	@Before("@ui")
	public void uiSetup() throws Exception {
		WebDriverFactory.getDriver();
	}
	
	@After("@ui")
	public void tearDown() {
		
	}
	

}
