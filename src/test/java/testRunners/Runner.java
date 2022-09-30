package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features = {"src/test/resources/Features/login.feature"}, glue = {"stepDefinitions"} , monochrome = true , plugin = {} , dryRun = false )

public class Runner extends AbstractTestNGCucumberTests {

}
