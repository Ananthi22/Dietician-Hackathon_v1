package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddNewPatientPage;
import pageObjects.BlogsPage;
import pageObjects.ClientTestimonialPage;
import pageObjects.ContactUsPage;
import pageObjects.CreateNewReportPage;
import pageObjects.DietPlansPage;
import pageObjects.DieticianHomePage;
import pageObjects.FeaturedPage;
import pageObjects.HomePage;
import pageObjects.MyPatientPage;
import pageObjects.NewPatientPage;
import pageObjects.ProductPage;
import pageObjects.RegistrationPage;
import pageObjects.SignInPage;
import pageObjects.TeamPage;
import pageObjects.ViewRecentDietPlansPage;
import pageObjects.ViewRecentTestReportPage;

public class ListofScreensSteps {
	HomePage HP;
	ClientTestimonialPage CP;
	RegistrationPage RP;
	BlogsPage BP;
	ProductPage PP;
	TeamPage TP;
	SignInPage SP;
	ContactUsPage CUP;
	FeaturedPage FP;
	ViewRecentTestReportPage VRTS;
	ViewRecentDietPlansPage VRDP;
	NewPatientPage AP;
	MyPatientPage MP;
	DieticianHomePage DH;
	DietPlansPage DP;
	CreateNewReportPage CNR;
	AddNewPatientPage ANPP;
	String menu;
	 
	@Given("User is on browser")
	public void user_is_on_browser() {
	    
	}

	@When("User opens dietician website")
	public void user_opens_dietician_website() {
	    
	}

	@Then("User should see a {int} horizontal line")
	public void user_should_see_a_horizontal_line(Integer ListofScreens) {
		HP.LSDropdowncount();
		HP.li.size();
		
	}

	@When("User selects the link of {int} horizontal lines")
	public void user_selects_the_link_of_horizontal_lines(Integer int1) {
			HP.getLSDropdownList();
	}

	@Then("User should see the list of links is displayed")
	public void user_should_see_the_list_of_links_is_displayed() {
		Assert.assertTrue(HP.Clientdisplay());
		Assert.assertTrue(HP.Blogsdisplay());
		Assert.assertTrue(HP.Contactusdisplay());
		Assert.assertTrue(HP.Featureddisplay());
		Assert.assertTrue(HP.Productdisplay());
		Assert.assertTrue(HP.Regdisplay());
		Assert.assertTrue(HP.Signindisplay());
		Assert.assertTrue(HP.Teamdisplay());
	
	    
	}

	@Then("User should see the links to {string} pages under Public")
	public void user_should_see_the_links_to_pages_under_public(String string) {
		HP.publicDisplay();   
	}

	@Given("User is on the menu list in homepage")
	public void user_is_on_the_menu_list_in_homepage() {
	    HP.getListofScreensTitle();
	}

	@When("User selects the link menu as {string}")
	public void user_selects_the_link_menu_as(String sectionsTable) {
		menu=sectionsTable;
	
	}

	@Then("User should  re-directed to Url as {string}")
	public void user_should_re_directed_to_url_as(String string, io.cucumber.datatable.DataTable dataTable) {
		if(menu.contains("UserSignIn"))
			HP.Clicksignin();
		if(menu.contains("Register"))
			HP.Clickreg();
		if(menu.contains("Testimonial"))
			HP.Clickclient();
		if(menu.contains("ForgotPassword"))
			HP.Clicksignin();
		if(menu.contains("Product"))
			HP.ClickProduct();
		if(menu.contains("Contact"))
			HP.Clickcontact();
		if(menu.contains("Blogs"))
			HP.Clickblogs();
		if(menu.contains("Featured"))
			HP.Clickfeature();
		if(menu.contains("Home"))
			HP.HP_title();	
	    
	}

	@When("User selects the link of menu as {string} before signing in")
	public void user_selects_the_link_of_menu_as_before_signing_in(String sectionsTable1) {
		menu=sectionsTable1;		
		HP.ClickWithoutLogin();
		Assert.assertEquals(menu,"You are not logged in");
	}

	@Then("User should direct to Url as {string}  page")
	public void user_should_direct_to_url_as_page1(String string, io.cucumber.datatable.DataTable dataTable) {
		if(menu.contains("ViewRecentDiets"))
			HP.Clicksignin();
		if(menu.contains("ViewRecentTestReports"))
			HP.Clicksignin();
		if(menu.contains("AddNewPatients"))
			HP.Clicksignin();
		if(menu.contains("DieticianHome"))
			HP.Clicksignin();
		if(menu.contains("ConfirmConditionsandCreatePlan"))
			HP.Clicksignin();
	   
	}

	@When("User selects the link of menu as {string} after signing in")
	public void user_selects_the_link_of_menu_as_after_signing_in(String sectionsTable2) {
		menu=sectionsTable2;
		
	}

	@Then("User should direct to Url as {string} page")
	public void user_should_direct_to_url_as_page(String string, io.cucumber.datatable.DataTable dataTable) {
	if(menu.contains("ViewRecentDiets"))
		HP.ClickviewRecentDiets();
	if(menu.contains("ViewRecentTestReports"))
		HP.ClickViewRecentTestReports();
	if(menu.contains("AddNewPatients"))
		HP.ClickAddNewPatients();
	if(menu.contains("DieticianHome"))
		HP.ClickDieticianHome();
	if(menu.contains("ConfirmConditionsandCreatePlan"))
		HP.ClickConfirmConditionsandCreatePlan();
	}
}
