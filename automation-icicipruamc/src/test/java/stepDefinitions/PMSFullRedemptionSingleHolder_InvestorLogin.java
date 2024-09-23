//package stepDefinitions;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.LoginPage;
//import utils.TestContextSetup;
//
//public class PMSFullRedemptionSingleHolder_InvestorLogin {
//	public WebDriver driver;
//	public static ChromeOptions option;
//	TestContextSetup testContextSetup;
//	LoginPage loginPage;
//
//	public PMSFullRedemptionSingleHolder_InvestorLogin(TestContextSetup testContextSetup) {
//		this.testContextSetup = testContextSetup;
//		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
//	}
//
//	@Given("The investor is logged in")
//	public void investor_is_logged_in() {
//		// Code to log in the investor
//	}
//
//	@Given("the dashboard page is displayed")
//	public void dashboard_page_is_displayed() {
//		// Code to verify the dashboard page is displayed
//	}
//
//	@When("the investor clicks on the Redemption Module from the side menu")
//	public void investor_clicks_on_redemption_module() {
//		// Code to click on the Redemption Module from the side menu
//	}
//
//	@Then("the PMS Redemption page should be displayed on screen")
//	public void pms_redemption_page_displayed() {
//		// Code to verify the PMS Redemption page is displayed on screen
//	}
//
//	@Given("the investor is on the redemption page")
//	public void investor_on_redemption_page() {
//		// Code to verify that the investor is on the redemption page
//	}
//
//	@When("the investor selects {string} from the dropdown")
//	public void investor_selects_from_dropdown(String holderType) {
//		// Code to select the Single Holder from the dropdown
//	}
//
//	@When("the investor selects the Strategy checkbox")
//	public void investor_selects_strategy_checkbox() {
//		// Code to select the Strategy checkbox
//	}
//
//	@When("the investor verifies that the selected strategy card AUM amount is greater than {int}L")
//	public void investor_verifies_strategy_card_aum(int amount) {
//		// Code to verify that the selected strategy card AUM amount is greater than 15L
//	}
//
//	@When("the investor clicks on the redeem button")
//	public void investor_clicks_redeem_button() {
//		// Code to click on the redeem button
//	}
//
//	@Then("the L2 screen should be displayed")
//	public void l2_screen_displayed() {
//		// Code to verify that the L2 screen is displayed
//	}
//
//	@Given("the investor is on the L2 Screen")
//	public void investor_on_l2_screen() {
//		// Code to verify that the investor is on the L2 Screen
//	}
//
//	@When("the investor clicks on the T&C checkbox")
//	public void investor_clicks_tc_checkbox() {
//		// Code to click on the T&C checkbox
//	}
//
//	@When("the investor clicks on the redeem amount button")
//	public void investor_clicks_redeem_amount_button() {
//		// Code to click on the redeem amount button
//	}
//
//	@When("the investor enters the OTP")
//	public void investor_enters_otp() {
//		// Code to enter the OTP
//	}
//
//	@Then("the investor should see a success validation message")
//	public void success_validation_message() {
//		// Code to verify that a success validation message is displayed
//	}
//
//	@Given("the investor is on the dashboard page")
//	public void investor_on_dashboard_page() {
//		// Code to verify that the investor is on the dashboard page
//	}
//
//	@When("the investor clicks on the recent transaction option from the side menu")
//	public void investor_clicks_recent_transaction_option() {
//		// Code to click on the recent transaction option from the side menu
//	}
//
//	@Then("the investor should see the entry in the transaction list")
//	public void transaction_entry_in_list() {
//		// Code to verify that the transaction entry is in the list
//	}
//
//	@Then("the status of the transaction should be displayed correctly")
//	public void transaction_status_displayed_correctly() {
//		// Code to verify that the transaction status is displayed correctly
//	}
//}
