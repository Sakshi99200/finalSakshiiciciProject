//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.LoginPage;
//import utils.TestContextSetup;
//
//public class PMSPartialRedemptionJointHolder_DistributorLogin {
//
//	public WebDriver driver;
//	public static ChromeOptions option;
//	TestContextSetup testContextSetup;
//	LoginPage loginPage;
//
//	public PMSPartialRedemptionJointHolder_DistributorLogin(TestContextSetup testContextSetup) {
//		this.testContextSetup = testContextSetup;
//		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
//	}
//
//	@Given("the distributor is logged in")
//	public void the_distributor_is_logged_in() {
//		driver.findElement(By.id("username")).sendKeys("distributorUsername");
//		driver.findElement(By.id("password")).sendKeys("distributorPassword");
//		driver.findElement(By.id("loginButton")).click();
//	}
//
//	@Given("the dashboard page is displayed")
//	public void the_dashboard_page_is_displayed() {
//		Assert.assertTrue(driver.findElement(By.id("dashboard")).isDisplayed());
//	}
//
//	@When("the distributor clicks on the redemption option")
//	public void the_distributor_clicks_on_the_redemption_option() {
//		driver.findElement(By.id("redemptionMenuOption")).click();
//	}
//
//	@Then("the redemption page should be displayed")
//	public void the_redemption_page_should_be_displayed() {
//		Assert.assertTrue(driver.findElement(By.id("redemptionPage")).isDisplayed());
//	}
//
//	// Scenario: Distributor selects PAN and single holder for full redemption
//	@When("the distributor selects the {string} from the dropdown")
//	public void the_distributor_selects_from_the_dropdown(String option) {
//		driver.findElement(By.id("dropdown")).sendKeys(option);
//	}
//
//	@When("the distributor selects the joint holder name")
//	public void the_distributor_selects_joint_holder_name() {
//		driver.findElement(By.id("holderDropdown")).sendKeys("Joint Holder Name");
//	}
//
//	@When("the distributor selects the strategy checkbox")
//	public void the_distributor_selects_the_strategy_checkbox() {
//		driver.findElement(By.id("strategyCheckbox")).click();
//	}
//
//	@When("the distributor clicks on the partial radio button")
//	public void the_distributor_clicks_on_the_partial_radio_button() {
//		driver.findElement(By.id("partialRadioButton")).click();
//	}
//
//	@Then("the error validation should be checked")
//	public void the_error_validation_should_be_checked() {
//		WebElement errorMessage = driver.findElement(By.id("errorValidation"));
//		Assert.assertTrue(errorMessage.isDisplayed(), "Error validation should be displayed");
//	}
//
//	// Scenario: Distributor validates amount fields
//	@When("the distributor enters an amount less than 2L in the amount field")
//	public void the_distributor_enters_amount_less_than_2L() {
//		driver.findElement(By.id("amountField")).sendKeys("150000"); // Example amount
//	}
//
//	@Then("the validation message should be displayed")
//	public void the_validation_message_should_be_displayed() {
//		WebElement validationMessage = driver.findElement(By.id("validationMessage"));
//		Assert.assertTrue(validationMessage.isDisplayed(), "Validation message should be displayed");
//	}
//
//	@When("the distributor enters an amount equal to the AUM amount")
//	public void the_distributor_enters_amount_equal_to_AUM() {
//		driver.findElement(By.id("amountField")).sendKeys("2000000"); // Example AUM amount
//	}
//
//	@When("the distributor does not enter an amount and clicks on the redeem button")
//	public void the_distributor_does_not_enter_amount_and_clicks_on_redeem_button() {
//		driver.findElement(By.id("redeemButton")).click();
//	}
//
//	@Then("the redeem button should be disabled")
//	public void the_redeem_button_should_be_disabled() {
//		WebElement redeemButton = driver.findElement(By.id("redeemButton"));
//		Assert.assertFalse(redeemButton.isEnabled(), "Redeem button should be disabled");
//	}
//
//	@When("the distributor enters the AUM amount in the amount field")
//	public void the_distributor_enters_AUM_amount() {
//		driver.findElement(By.id("amountField")).sendKeys("2000000"); // Example AUM amount
//	}
//
//	@Then("the L2 screen should be displayed")
//	public void the_L2_screen_should_be_displayed() {
//		Assert.assertTrue(driver.findElement(By.id("L2Screen")).isDisplayed());
//	}
//
//	@Then("the entered amount should be displayed on the screen")
//	public void the_entered_amount_should_be_displayed_on_the_screen() {
//		WebElement enteredAmount = driver.findElement(By.id("enteredAmount"));
//		Assert.assertTrue(enteredAmount.isDisplayed(), "Entered amount should be displayed");
//	}
//
//	// Scenario: Distributor confirms redemption with OTP
//	@When("the distributor clicks on the confirmation checkbox")
//	public void the_distributor_clicks_on_the_confirmation_checkbox() {
//		driver.findElement(By.id("confirmationCheckbox")).click();
//	}
//
//	@When("the distributor clicks on the redeem amount button")
//	public void the_distributor_clicks_on_the_redeem_amount_button() {
//		driver.findElement(By.id("redeemAmountButton")).click();
//	}
//
//	@When("the distributor enters the OTP")
//	public void the_distributor_enters_the_OTP() {
//		driver.findElement(By.id("otpField")).sendKeys("123456"); // Example OTP
//		driver.findElement(By.id("submitOtpButton")).click();
//	}
//
//	@Then("a success validation message should be displayed")
//	public void a_success_validation_message_should_be_displayed() {
//		WebElement successMessage = driver.findElement(By.id("successMessage"));
//		Assert.assertTrue(successMessage.isDisplayed(), "Success validation message should be displayed");
//	}
//
//	// Scenario: Distributor verifies recent transaction
//	@When("the distributor clicks on the recent transaction option from the side menu")
//	public void the_distributor_clicks_on_the_recent_transaction_option_from_the_side_menu() {
//		driver.findElement(By.id("recentTransactionMenuOption")).click();
//	}
//
//	@Then("the transaction entry should be displayed in the list")
//	public void the_transaction_entry_should_be_displayed_in_the_list() {
//		WebElement transactionEntry = driver.findElement(By.id("transactionEntry"));
//		Assert.assertTrue(transactionEntry.isDisplayed(), "Transaction entry should be displayed");
//	}
//
//	@Then("the status of the transaction should be correctly displayed")
//	public void the_status_of_the_transaction_should_be_correctly_displayed() {
//		WebElement transactionStatus = driver.findElement(By.id("transactionStatus"));
//		Assert.assertEquals(transactionStatus.getText(), "Payment is in progress");
//	}
//
//	// Scenario: Investor logs in and approves distributor's request
//	@Given("the investor is logged in")
//	public void the_investor_is_logged_in() {
//		driver.findElement(By.id("username")).sendKeys("investorUsername");
//		driver.findElement(By.id("password")).sendKeys("investorPassword");
//		driver.findElement(By.id("loginButton")).click();
//	}
//
//	@When("the investor clicks on the Distributor transaction request option from the side menu")
//	public void the_investor_clicks_on_the_distributor_transaction_request_option_from_the_side_menu() {
//		driver.findElement(By.id("distributorTransactionRequestMenuOption")).click();
//	}
//
//	@Then("the request entry should be displayed")
//	public void the_request_entry_should_be_displayed() {
//		WebElement requestEntry = driver.findElement(By.id("requestEntry"));
//		Assert.assertTrue(requestEntry.isDisplayed(), "Request entry should be displayed");
//	}
//
//	@When("the investor clicks on the proceed button for the request")
//	public void the_investor_clicks_on_the_proceed_button_for_the_request() {
//		driver.findElement(By.id("proceedButton")).click();
//	}
//
//	@Then("the L2 screen should be displayed")
//	public void the_L2_screen_should_be_displayed1() {
//		Assert.assertTrue(driver.findElement(By.id("L2Screen")).isDisplayed());
//	}
//
//	@When("the investor clicks on the approve button")
//	public void the_investor_clicks_on_the_approve_button() {
//		driver.findElement(By.id("approveButton")).click();
//	}
//
//	@Then("the transaction status should be updated to {string}")
//	public void the_transaction_status_should_be_updated_to(String status) {
//		WebElement transactionStatus = driver.findElement(By.id("transactionStatus"));
//		Assert.assertEquals(transactionStatus.getText(), status);
//	}
//
//	// Scenario: Joint Holder logs in and approves the transaction
//	@Given("the Joint Holder is logged in")
//	public void the_joint_holder_is_logged_in() {
//		driver.findElement(By.id("username")).sendKeys("jointHolderUsername");
//		driver.findElement(By.id("password")).sendKeys("jointHolderPassword");
//		driver.findElement(By.id("loginButton")).click();
//	}
//
//	@When("the Joint Holder clicks on the JH request tab")
//	public void the_joint_holder_clicks_on_the_JH_request_tab() {
//		driver.findElement(By.id("jhRequestTab")).click();
//	}
//
//	@Then("the placed transaction should be displayed")
//	public void the_placed_transaction_should_be_displayed() {
//		WebElement placedTransaction = driver.findElement(By.id("placedTransaction"));
//		Assert.assertTrue(placedTransaction.isDisplayed(), "Placed transaction should be displayed");
//	}
//
//	@When("the Joint Holder clicks on the approve button for the transaction")
//	public void the_joint_holder_clicks_on_the_approve_button_for_the_transaction() {
//		driver.findElement(By.id("approveButton")).click();
//	}
//
//	@Then("the transaction status should show as {string}")
//	public void the_transaction_status_should_show_as(String status) {
//		WebElement transactionStatus = driver.findElement(By.id("transactionStatus"));
//		Assert.assertEquals(transactionStatus.getText(), status);
//	}
//}
