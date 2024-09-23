package stepDefinitions;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.PMSRedemption_InvestorLogin;
import utils.TestContextSetup;

public class PMSPartialRedemptionSingleHolder_InvestorLogin {
	private TestContextSetup testContextSetup;
	private LoginPage loginpage;
	private PMSRedemption_InvestorLogin pmsRedemption_InvestorLogin;

	public PMSPartialRedemptionSingleHolder_InvestorLogin(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.pmsRedemption_InvestorLogin = testContextSetup.pageObjectManager.getPMSRedemption_InvestorLogin();
		this.loginpage = testContextSetup.pageObjectManager.getLoginPage();

	}

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() throws InterruptedException {
		pmsRedemption_InvestorLogin.verifyLoginPage();
	}

	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String Username, String Password)
			throws InterruptedException, AWTException {

		pmsRedemption_InvestorLogin.userLogin(Username, Password);

	}

	@Then("dashboard page should be display")
	public void dashboard_page_should_be_display() throws InterruptedException {
		pmsRedemption_InvestorLogin.verifyDashboard();
	}

	@Given("the investor is on the dashboard page")
	public void the_investor_is_on_the_dashboard_page() throws InterruptedException {
		// Code to click on the Redemption Module
//		loginpage.verifyDashboard();
	}

	@When("the investor clicks on the redemption module from the side menu")
	public void the_investor_clicks_on_the_redemption_module_from_the_side_menu() throws InterruptedException {
		// Code to click on the Redemption Module
		pmsRedemption_InvestorLogin.clickOnexpandOption();

		pmsRedemption_InvestorLogin.clickOnRedemptionModule();
	}

	@Then("the investor should be on the redemption page")
	public void the_investor_should_be_on_the_redemption_page() throws InterruptedException {

		pmsRedemption_InvestorLogin.verifyInvestorIsOnRedemptionPage();

	}

	@Given("the investor is on redemption page")
	public void the_investor_is_on_the_redemption_page() throws InterruptedException {
//		// Code to navigate to the redemption page
//		pmsRedemption_InvestorLogin.verifyInvestorIsOnRedemptionPage();

	}

	@When("^the investor selects (.+) from the dropdown$")
	public void the_investor_selects_from_the_dropdown(String holderName) {
		// Code to select an option from the dropdown

		pmsRedemption_InvestorLogin.selectHolderNameFromeDropdown(holderName);
	}

	@When("the investor selects the Strategy checkbox")
	public void the_investor_selects_the_strategy_checkbox() throws InterruptedException {
		// Code to select the Strategy checkbox
		pmsRedemption_InvestorLogin.clickOnStrategyCheckBox();
	}

	@When("the investor clicks on the Partial radio button")
	public void the_investor_clicks_on_the_partial_radio_button() {
		// Code to click on the Partial radio button

		pmsRedemption_InvestorLogin.selectPartialRedemptionOption();
	}

	@When("^the investor enters an amount (.+) less than  Lakhs in the amount field$")
	public void the_investor_enters_an_amount_less_than_lakhs_in_the_amount_field(String amount) {
		// Code to enter an amount in the field

		pmsRedemption_InvestorLogin.enterAUMAmount(amount);
	}

	@Then("the investor should see a validation message for the minimum amount requirement")
	public void the_investor_should_see_a_validation_message_for_the_minimum_amount_requirement()
			throws InterruptedException {
		// Code to verify the validation message

		pmsRedemption_InvestorLogin.verifyErrorValidationForEnteringAUMAMountLessThan_2Lakh();

		pmsRedemption_InvestorLogin.clearAumAMountField();
	}

	@When("the investor enters an amount equal to the AUM amount")
	public void the_investor_enters_an_amount_equal_to_the_aum_amount(String AUMamount) {
		// Code to enter the AUM amount

		pmsRedemption_InvestorLogin.enterAUMAmount(pmsRedemption_InvestorLogin.AUMAmountvalue);
	}

	@Then("the investor should see a validation message for the maximum amount")
	public void the_investor_should_see_a_validation_message_for_the_maximum_amount() throws InterruptedException {
		// Code to verify the validation message for maximum amount

		pmsRedemption_InvestorLogin.verifyErrorValidationForEnteringAUMAmount_equalToTheTotalAUMAmount();

	}

	@When("the investor does not enter an amount and clicks on the redeem button")
	public void the_investor_does_not_enter_an_amount_and_clicks_on_the_redeem_button() throws InterruptedException {
		// Code to try clicking the redeem button without entering an amount
		pmsRedemption_InvestorLogin.clearAumAMountField();

	}

	@Then("the redeem button should be disabled")
	public void the_redeem_button_should_be_disabled() {
		// Code to verify the redeem button is disabled
		pmsRedemption_InvestorLogin.verifyRedeemButtomDisabled();

	}

	@When("the investor is on the PMS redemption page")
	public void the_investor_clicks_on_the_redemption_module_from_the_side_menu01() throws InterruptedException {

		// Code to click on the Redemption Module
		pmsRedemption_InvestorLogin.verifyInvestorIsOnRedemptionPage();
	}

	@When("the investor enters partial amount")

	public void the_investor_enters_partial_amount() {

		pmsRedemption_InvestorLogin.enterAUMAmount("200000");

	}

	@Then("the investor is click on Redeem button")
	public void the_investor_is_click_on_Redeem_button() throws InterruptedException {

		pmsRedemption_InvestorLogin.clickOnRedeemButton();
	}

	@When("the L2 screen is displayed")
	public void the_l2_screen_is_displayed() {
		// Code to verify the L2 screen is displayed
		pmsRedemption_InvestorLogin.verifyInvestorIsOnL2Screen();
	}

	@When("the investor clicks on the T&C checkbox and clicks on the redeem amount button")
	public void the_investor_clicks_on_the_t_c_checkbox_and_clicks_on_the_redeem_amount_button() {
		// Code to click on T&C checkbox and then redeem button

		pmsRedemption_InvestorLogin.clickOnTC_checkbox();
	}

	@Then("the investor clicks on redeem amount button")
	public void the_investor_clicks_on_redeem_amount_button() throws InterruptedException {

		pmsRedemption_InvestorLogin.clickOnRedeemAmountButton();
	}

	@When("the investor enters the OTP")
	public void the_investor_enters_the_otp() throws InterruptedException {
		// Code to enter the OTP

		pmsRedemption_InvestorLogin.enterOTP();
	}

	@When("the investor clicks on the recent transaction option from the side menu")
	public void the_investor_clicks_on_the_recent_transaction_option_from_the_side_menu() {
		// Code to click on the recent transaction option
	}

	@Then("the investor should see the entry in the transaction list")
	public void the_investor_should_see_the_entry_in_the_transaction_list() {
		// Code to verify the entry in the transaction list
	}

	@Then("the status of the transaction should be displayed correctly")
	public void the_status_of_the_transaction_should_be_displayed_correctly() {
		// Code to verify the status of the transaction
	}

}
