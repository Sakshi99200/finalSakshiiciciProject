package stepDefinitions;

import java.awt.AWTException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class LoginFunctionality {
//	public WebDriver driver;
	private LoginPage loginpage;
	private TestContextSetup testContextSetup;

	public LoginFunctionality(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.loginpage = testContextSetup.pageObjectManager.getLoginPage();
	}

	@Given("The user is on the login page")
	public void The_user_is_on_the_login_page() throws InterruptedException {
		loginpage.verifyLoginPage();
	}

	@When("^User Login into application with (.+) and password (.+)$")
	public void User_Login_into_application_with_and_password(String Username, String Password)
			throws InterruptedException, AWTException {

		loginpage.userLogin(Username, Password);

	}

	@Then("Dashboard page should be display")
	public void dashboard_page_should_be_display() throws InterruptedException {
		loginpage.verifyDashboard();
	}
}
