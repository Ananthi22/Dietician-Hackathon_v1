package pageObjects;

import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class ProductPage extends TestBase {

	public ProductPage() {
		PageFactory.initElements(driver,this);
		
	}
}
