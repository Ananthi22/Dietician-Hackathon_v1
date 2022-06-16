package pageObjects;

import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class BlogsPage extends TestBase {

	public BlogsPage() {
		PageFactory.initElements(driver,this);
		
	}
}
