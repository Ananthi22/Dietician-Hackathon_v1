package stepDefinitions;

import org.testng.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BlogsPage;
import pageObjects.ClientTestimonialPage;
import pageObjects.ContactUsPage;
import pageObjects.FeaturedPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import pageObjects.RegistrationPage;
import pageObjects.SignInPage;
import pageObjects.TeamPage;

public class HomePageclick {
	
	HomePage HP;
	ClientTestimonialPage CP;
	RegistrationPage RP;
	BlogsPage BP;
	ProductPage PP;
	TeamPage TP;
	SignInPage SP;
	ContactUsPage CUP;
	FeaturedPage FP;

	@Given("User launch the browser")
	public void user_launch_the_browser() {
	   
	}

	@When("User opens dietician Website")
	public void user_opens_dietician_website() {
	    
	}

	@Then("User should see the Homepage")
	public void user_should_see_the_homepage() {
		HP = new HomePage(TestBase.getDriver());
	}

	
	@When("User validate the title of the page")
	public void user_validate_the_title_of_the_page() {
	    
	}

	@Then("User should see the title of the page as {string}")
	public void user_should_see_the_title_of_the_page_as(String string) {
		
	}

	@When("User validate the logo of the page")
	public void user_validate_the_logo_of_the_page(Object logo) {
		boolean actualLogo = HP.validatelogo();
		Assert.assertEquals(actualLogo, logo);
       
	}

	@Then("User should see the logo image")
	public void user_should_see_the_logo_image() {
		
	}

	@Then("User should see the tab {string}")
	public void user_should_see_the_tab(String tab) {
	Assert.assertTrue(HP.Clientdisplay());
	Assert.assertTrue(HP.Blogsdisplay());
	Assert.assertTrue(HP.Contactusdisplay());
	Assert.assertTrue(HP.Featureddisplay());
	Assert.assertTrue(HP.Productdisplay());
	Assert.assertTrue(HP.Regdisplay());
	Assert.assertTrue(HP.Signindisplay());
	Assert.assertTrue(HP.Teamdisplay());
	}
	
	@Given("user in a HomePage")
	public void user_in_a_home_page() {
	    HP.HP_title(); 
	}

	@When("user click on product link on homepage")
	public void user_click_on_product_link_on_homepage() {
		HP.ClickProduct();
	}

	@Then("user should direct to Product page")
	public void user_should_direct_to_product_page() {
	  PP = new ProductPage();
	}

	@When("user click on clients link on homepage")
	public void user_click_on_clients_link_on_homepage() {
	    HP.Clickclient();
	}

	@Then("user should direct to Testimonial page")
	public void user_should_direct_to_testimonial_page() {
	    CP = new ClientTestimonialPage();
	}

	@When("user click on Team link on homepage")
	public void user_click_on_team_link_on_homepage() {
	   HP.ClickTeam();
	}

	@Then("user should direct to Team page")
	public void user_should_direct_to_team_page() {
	   TP = new TeamPage();
	}

	@Then("user should see Doctor's name on Team page")
	public void user_should_see_doctor_s_name_on_team_page() {
	   
	}

	@When("user click on Register link on homepage")
	public void user_click_on_register_link_on_homepage() {
	    HP.Clickreg();
	}

	@Then("user should direct to Sign Up page")
	public void user_should_direct_to_sign_up_page() {
	    RP = new RegistrationPage();
	}


	@When("user click on signin link on homepage")
	public void user_click_on_signin_link_on_homepage() {
	    HP.Clicksignin();
	}

	@Then("user should direct to SignIn page")
	public void user_should_direct_to_sign_in_page() {
	    SP = new SignInPage();
	}

	@When("user click on featured on homepage")
	public void user_click_on_featured_on_homepage() {
	    HP.Clickfeature();
	}

	@Then("user should direct to Featured Content page")
	public void user_should_direct_to_featured_content_page() {
	   FP = new FeaturedPage();
	   
	}

	@When("user click on blogs  on homepage")
	public void user_click_on_blogs_on_homepage() {
	    HP.Clickblogs();
	}

	@Then("user should directed to blogs page")
	public void user_should_directed_to_blogs_page() {
	    BP = new BlogsPage();
	}
	}