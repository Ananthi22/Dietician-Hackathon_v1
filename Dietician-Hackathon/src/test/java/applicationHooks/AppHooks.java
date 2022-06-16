package applicationHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.util.ConfigReader;

import baseClass.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {
	
	public TestBase testBase;
	public WebDriver driver;
	public ConfigReader configReader;
	Properties prop;
	
	@Before(order=0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}
	
	@Before(order=1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		testBase = new TestBase();
		driver = testBase.init_driver(browserName);
	}
	
	//order 1 is 1st excuted
	@After(order = 0)
	public void quitbrowser() {
		driver.quit();
	}
	
	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			 //take screenshot
			
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte [] sourcepath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcepath, "image/png", screenshotName);
		}
	}
	

}
