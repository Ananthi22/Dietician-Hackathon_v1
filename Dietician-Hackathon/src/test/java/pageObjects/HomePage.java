package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import baseClass.TestBase;

public class HomePage extends TestBase {
	public WebDriver driver;
	
	@FindBy(xpath ="//img[contains(@id,'Test Image']")
	WebElement logo;
	
	@FindBy(xpath="//div/p[@id='PRODUCT']")
	WebElement product;
	
	@FindBy(xpath="//div[@id='TEAM']")
	WebElement team;
	
	@FindBy(xpath="//div/p[@id='CLIENTS']")
	WebElement client;
	
	@FindBy(xpath="//div/p[@id='Register']")
	WebElement register;
	
	@FindBy(xpath="//div/p[@id='SignIn']")
	WebElement signin ;
	
	@FindBy(xpath="//div/p[@id='AboutUs']")
	WebElement aboutpage;

	@FindBy(xpath="//div/p[@id='Featured Content']")
	WebElement featured;

	@FindBy(xpath="//div/p[@id='BLOGS']")
	WebElement blogs;

	@FindBy(xpath="//div/p[@id='Contact Us']")
	WebElement contactus;
	
	@FindBy(xpath="//div/p[@id='Drop-Down']")
	WebElement LSDropdown;
	
	@FindBys(@FindBy(className="dropdown-item"))
	public List<WebElement>li;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String HP_title() {
		return driver.getTitle();
		
	}
	
	public boolean validatelogo() {
		return logo.isDisplayed();
		
	}
	
	public boolean Productdisplay() {
		return product.isDisplayed();
	}
		
	public boolean Teamdisplay() {
		return team.isDisplayed();
	}
	
	public boolean Clientdisplay() {
	 	return client.isDisplayed();
	}
	
	public boolean Regdisplay() {
		return register.isDisplayed();
	}
	
	public boolean Signindisplay() {
		return signin.isDisplayed();
		
	}
	
	public boolean Featureddisplay() {
		return featured.isDisplayed();
	}
	
	public boolean Blogsdisplay() {
		return blogs.isDisplayed();
	
	}
	public boolean Contactusdisplay() {
		return contactus.isDisplayed();
		
	}
	public ProductPage ClickProduct() {
		product.click();
		return new ProductPage();
		}
	
	public TeamPage ClickTeam() {
		team.click();
		return new TeamPage();
		}

	public ClientTestimonialPage Clickclient() {
		client.click();
		return new ClientTestimonialPage();
		}
	
	public RegistrationPage Clickreg() {
		register.click();
		return new RegistrationPage();
		}
	
	public SignInPage Clicksignin() {
		signin.click();
		return new SignInPage();
		}
	

	public FeaturedPage Clickfeature() {
		featured.click();
		return new FeaturedPage();
		}

	public BlogsPage Clickblogs() {
		blogs.click();
		return new BlogsPage();
		}

	public ContactUsPage Clickcontact() {
		contactus.click();
		return new ContactUsPage();
		
		}
	public void ClickWithoutLogin(){
		System.out.println("You are not Logged In");
		
	}
	
	public void publicDisplay() {
		System.out.println("Public");
	}
	public String getListofScreensTitle() {
		return driver.getTitle();
	}
	public int LSDropdowncount() {
		LSDropdown.click();
		return li.size();
		
	}
	
	public List<String> getLSDropdownList() {
		List<String>DropdownList = new ArrayList<>();
		List<WebElement> DropdownHeaderList = li;
		
		for(WebElement e : DropdownHeaderList) {
			String text = e.getText();
			System.out.println(text);
			DropdownList.add(text);
		}
		return DropdownList;
	}

	public void ClickviewRecentDiets() {
		System.out.println("ViewRecentDiets");
	}

	public void ClickViewRecentTestReports() {
		System.out.println("ViewRecentTestReports");
	
	}
	public void ClickAddNewPatients() {
		System.out.println("NewPatients");
	}

	public void ClickDieticianHome() {
		System.out.println("DieticianHome");
	}

	public void ClickConfirmConditionsandCreatePlan() {
		System.out.println("ConfirmConditionsandCreatePlan");
	}
}


