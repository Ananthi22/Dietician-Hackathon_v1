package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	 public WebDriver driver;
	 //ThreadLocal-Parallel execution
	 public static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<>();
	 
	 //initialize the browser
	 public WebDriver init_driver(String browser) {
		 
		 System.out.println("browser value:"+ browser);
		 
		 if (browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		 }
		 
		 else if(browser.equals("firefox")){
				WebDriverManager.firefoxdriver().setup();
				tlDriver.set(new FirefoxDriver());
	 }
	 
		 else {
			 System.out.println("Please pass the correct browser:" +browser );
		 }
		 getDriver().manage().deleteAllCookies();
		 getDriver().manage().window().maximize();
		 return getDriver();
	 }
	 
		// use to get driver with ThreadLocal
	 //sync- all treads in sync
	public static synchronized  WebDriver getDriver() {
		return tlDriver.get();
	
		
	}
		 

	


	
	
	
	
}
