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
//public class PMSPartialRedemptionJointHolder_InvestorLogin {
//	public WebDriver driver;
//	public static ChromeOptions option;
//	TestContextSetup testContextSetup;
//	LoginPage loginPage;
//
//	public PMSPartialRedemptionJointHolder_InvestorLogin(TestContextSetup testContextSetup) {
//		this.testContextSetup = testContextSetup;
//		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
//	}
//	
//	 @Given("the investor is logged in")
//	    public void investor_is_logged_in() {
//	        // Code to log in the investor
//	    }
//
//	    @Given("the dashboard page is displayed")
//	    public void dashboard_page_is_displayed() {
//	        // Code to verify the dashboard page is displayed
//	    }
//
//	    @When("the investor clicks on the redemption option")
//	    public void investor_clicks_on_redemption_option() {
//	        // Code to click on the redemption option
//	    }
//
//	    @Then("the redemption page should be displayed")
//	    public void redemption_page_should_be_displayed() {
//	        // Code to verify that the redemption page is displayed
//	    }
//
//	    @Given("the investor selects {string} from the dropdown")
//	    public void investor_selects_from_dropdown(String jointHolder) {
//	        // Code to select the Joint Holder from the dropdown
//	    }
//
//	    @Given("the investor selects the strategy checkbox")
//	    public void investor_selects_strategy_checkbox() {
//	        // Code to select the strategy checkbox
//	    }
//
//	    @Given("the investor clicks on the partial radio button")
//	    public void investor_clicks_on_partial_radio_button() {
//	        // Code to click on the partial radio button
//	    }
//
//	    @When("the investor verifies that selected strategy cards' total AUM amount is greater than {int}L")
//	    public void investor_verifies_strategy_cards_aum(int amount) {
//	        // Code to verify that the AUM amount is greater than the specified amount
//	    }
//
//	    @Then("no error validation should be displayed for the selected card")
//	    public void no_error_validation_for_selected_card() {
//	        // Code to verify that no error validation is displayed
//	    }
//
//	    @When("the investor enters an amount less than {int}L in the amount field")
//	    public void investor_enters_less_amount(int amount) {
//	        // Code to enter an amount less than the specified amount
//	    }
//
//	    @Then("the investor should see an error validation message for the minimum amount requirement")
//	    public void investor_sees_error_validation_minimum_amount() {
//	        // Code to verify the error validation message is displayed
//	    }
//
//	    @When("the investor enters an AUM amount equal to the selected strategy cards' total AUM amount")
//	    public void investor_enters_equal_aum_amount() {
//	        // Code to enter an AUM amount equal to the selected strategy cards' total AUM amount
//	    }
//
//	    @When("the investor does not enter an AUM amount and clicks on the redeem button")
//	    public void investor_does_not_enter_aum_amount() {
//	        // Code to click on the redeem button without entering an AUM amount
//	    }
//
//	    @Then("the investor should see the redeem button is disabled")
//	    public void redeem_button_should_be_disabled() {
//	        // Code to verify the redeem button is disabled
//	    }
//
//	    @When("the investor enters an AUM amount greater than or equal to {int}L")
//	    public void investor_enters_valid_aum_amount(int amount) {
//	        // Code to enter an AUM amount greater than or equal to the specified amount
//	    }
//
//	    @When("clicks on the Redeem button")
//	    public void clicks_on_redeem_button() {
//	        // Code to click on the redeem button
//	    }
//
//	    @Then("the investor should see the L2 screen")
//	    public void investor_should_see_L2_screen() {
//	        // Code to verify the L2 screen is displayed
//	    }
//
//	    @When("the investor clicks on the T&C checkbox button")
//	    public void investor_clicks_tc_checkbox() {
//	        // Code to click on the T&C checkbox button
//	    }
//
//	    @When("clicks on the Redeem Amount button")
//	    public void clicks_on_redeem_amount_button() {
//	        // Code to click on the Redeem Amount button
//	    }
//
//	    @When("enters OTP and clicks on the proceed button")
//	    public void enters_otp_and_clicks_proceed() {
//	        // Code to enter OTP and click on the proceed button
//	    }
//
//	    @Then("the redemption process should be completed")
//	    public void redemption_process_completed() {
//	        // Code to verify the redemption process is completed
//	    }
//
//	    @When("the investor clicks on Recent transaction page from side menu")
//	    public void investor_clicks_recent_transaction_page() {
//	        // Code to navigate to the Recent Transaction page from the side menu
//	    }
//
//	    @Then("the investor should see the placed transaction entry on the recent transaction page")
//	    public void placed_transaction_entry_should_be_visible() {
//	        // Code to verify the placed transaction entry is visible
//	    }
//
//	    @Then("the status of the transaction should be displayed correctly")
//	    public void status_of_transaction_should_be_displayed_correctly() {
//	        // Code to verify the status of the transaction is displayed correctly
//	    }
//
//		@Given("the Joint holder is logged in")
//	    public void joint_holder_logged_in() {
//	        // Code to log in the Joint holder
//	    }
//
//	    @When("the Joint holder clicks on JH approval request tab")
//	    public void joint_holder_clicks_jh_approval_request_tab() {
//	        // Code to click on the JH approval request tab
//	    }
//
//	    @Then("the JH request page should be displayed")
//	    public void jh_request_page_should_be_displayed() {
//	        // Code to verify that the JH request page is displayed
//	    }
//
//	    @When("the investor is on the recent transactions page")
//	    public void investor_on_recent_transactions_page() {
//	        // Code to navigate to the recent transactions page
//	    }
//
//	    @When("the investor finds the relevant transaction")
//	    public void investor_finds_relevant_transaction() {
//	        // Code to find the relevant transaction
//	    }
//
//	    @Then("the status of the transaction should be displayed as {string}")
//	    public void status_of_transaction_should_be_displayed_as(String status) {
//	        // Code to verify the status of the transaction matches the expected status
//	    }
//}
