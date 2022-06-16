package pageObjects;

import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class FeaturedPage extends TestBase {
	
	public FeaturedPage  () {
		PageFactory.initElements(driver,this);
	}

}
