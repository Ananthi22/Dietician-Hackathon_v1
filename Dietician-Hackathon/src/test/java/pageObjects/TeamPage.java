package pageObjects;

import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class TeamPage extends TestBase {

	public TeamPage() {
		PageFactory.initElements(driver,this);
	}
}
