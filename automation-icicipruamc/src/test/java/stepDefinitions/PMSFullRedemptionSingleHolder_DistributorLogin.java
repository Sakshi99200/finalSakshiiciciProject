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
//public class PMSFullRedemptionSingleHolder_DistributorLogin {
//	public WebDriver driver;
//	public static ChromeOptions option;
//	TestContextSetup testContextSetup;
//	LoginPage loginPage;
//
//	public PMSFullRedemptionSingleHolder_DistributorLogin(TestContextSetup testContextSetup) {
//		this.testContextSetup = testContextSetup;
//		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
//	}
//
//	@Given("the distributor is logged in")
//	public void the_distributor_is_logged_in() {
//		// Implement login functionality for distributor
//		driver.findElement(By.id("username")).sendKeys("distributorUsername");
//		driver.findElement(By.id("password")).sendKeys("distributorPassword");
//		driver.findElement(By.id("loginButton")).click();
//	}
//
//	@Given("the dashboard page is displayed")
//	public void the_dashboard_page_is_displayed() {
//		// Verify that the dashboard is displayed
//		Assert.assertTrue(driver.findElement(By.id("dashboard")).isDisplayed());
//	}
//
//	@When("the distributor clicks on the redemption option")
//	public void the_distributor_clicks_on_the_redemption_option() {
//		// Click on the redemption option
//		driver.findElement(By.id("redemptionMenuOption")).click();
//	}
//
//	@Then("the redemption page should be displayed")
//	public void the_redemption_page_should_be_displayed() {
//		// Verify that the redemption page is displayed
//		Assert.assertTrue(driver.findElement(By.id("redemptionPage")).isDisplayed());
//	}
//
//	// Scenario: Distributor selects PAN and single holder for full redemption
//	@When("the distributor selects {string} from the dropdown")
//	public void the_distributor_selects_from_the_dropdown(String option) {
//		// Select PAN number or Single Holder name from the dropdown
//		driver.findElement(By.id("dropdown")).sendKeys(option);
//	}
//
//	@When("the distributor selects the strategy checkbox")
//	public void the_distributor_selects_the_strategy_checkbox() {
//		// Click on the strategy checkbox
//		driver.findElement(By.id("strategyCheckbox")).click();
//	}
//
//	@When("the distributor clicks on the full redemption radio button")
//	public void the_distributor_clicks_on_the_full_redemption_radio_button() {
//		// Click on the full redemption radio button
//		driver.findElement(By.id("fullRedemptionRadioButton")).click();
//	}
//
//	@When("the distributor clicks on the redeem button")
//	public void the_distributor_clicks_on_the_redeem_button() {
//		// Click on the redeem button
//		driver.findElement(By.id("redeemButton")).click();
//	}
//
//	@Then("the L2 screen should be displayed")
//	public void the_L2_screen_should_be_displayed() {
//		// Verify that the L2 screen is displayed
//		Assert.assertTrue(driver.findElement(By.id("L2Screen")).isDisplayed());
//	}
//
//	// Scenario: Distributor confirms the redemption on L2 screen
//	@Then("the entered amount should be displayed on the L2 screen")
//	public void the_entered_amount_should_be_displayed_on_the_L2_screen() {
//		// Verify that the entered amount is displayed
//		WebElement amount = driver.findElement(By.id("enteredAmount"));
//		Assert.assertTrue(amount.isDisplayed());
//	}
//
//	@When("the distributor clicks on the confirmation checkbox")
//	public void the_distributor_clicks_on_the_confirmation_checkbox() {
//		// Click on the confirmation checkbox
//		driver.findElement(By.id("confirmationCheckbox")).click();
//	}
//
//	@When("the distributor clicks on the redeem amount button")
//	public void the_distributor_clicks_on_the_redeem_amount_button() {
//		// Click on the redeem amount button
//		driver.findElement(By.id("redeemAmountButton")).click();
//	}
//
//	@When("the distributor enters the OTP")
//	public void the_distributor_enters_the_OTP() {
//		// Enter the OTP
//		driver.findElement(By.id("otpField")).sendKeys("123456"); // Example OTP
//		driver.findElement(By.id("submitOtpButton")).click();
//	}
//
//	@Then("the distributor should see a success validation message")
//	public void the_distributor_should_see_a_success_validation_message() {
//		// Verify the success message
//		WebElement successMessage = driver.findElement(By.id("successMessage"));
//		Assert.assertTrue(successMessage.isDisplayed());
//	}
//
//	// Scenario: Distributor verifies recent transaction
//	@When("the distributor clicks on the recent transaction option from the side menu")
//	public void the_distributor_clicks_on_the_recent_transaction_option_from_the_side_menu() {
//		// Click on the recent transaction option from the side menu
//		driver.findElement(By.id("recentTransactionMenuOption")).click();
//	}
//
//	@Then("the distributor should see the entry in the transaction list")
//	public void the_distributor_should_see_the_entry_in_the_transaction_list() {
//		// Verify the entry in the transaction list
//		WebElement transactionEntry = driver.findElement(By.id("transactionEntry"));
//		Assert.assertTrue(transactionEntry.isDisplayed());
//	}
//
//	@Then("the status of the transaction should be displayed correctly")
//	public void the_status_of_the_transaction_should_be_displayed_correctly() {
//		// Verify that the status is displayed correctly
//		WebElement transactionStatus = driver.findElement(By.id("transactionStatus"));
//		Assert.assertEquals(transactionStatus.getText(), "Payment is in progress");
//	}
//
//	// Scenario: Investor logs in and checks distributor's transaction request
//	@Given("the investor is logged in")
//	public void the_investor_is_logged_in() {
//		// Implement login functionality for investor
//		driver.findElement(By.id("username")).sendKeys("investorUsername");
//		driver.findElement(By.id("password")).sendKeys("investorPassword");
//		driver.findElement(By.id("loginButton")).click();
//	}
//
//	@When("the investor clicks on the Distributor transaction request option from the side menu")
//	public void the_investor_clicks_on_the_distributor_transaction_request_option_from_the_side_menu() {
//		// Click on Distributor transaction request option
//		driver.findElement(By.id("distributorTransactionRequestMenuOption")).click();
//	}
//
//	@Then("the request entry should be displayed")
//	public void the_request_entry_should_be_displayed() {
//		// Verify that the request entry is displayed
//		WebElement requestEntry = driver.findElement(By.id("requestEntry"));
//		Assert.assertTrue(requestEntry.isDisplayed());
//	}
//
//	// Scenario: Investor proceeds and approves the distributor’s request
//	@When("the investor clicks on the proceed button for the request")
//	public void the_investor_clicks_on_the_proceed_button_for_the_request() {
//		// Click on the proceed button
//		driver.findElement(By.id("proceedButton")).click();
//	}
//
//	@Then("the L2 screen should be displayed")
//	public void the_l2_screen_should_be_displayed() {
//		// Verify that the L2 screen is displayed
//		Assert.assertTrue(driver.findElement(By.id("L2Screen")).isDisplayed());
//	}
//
//	@When("the investor clicks on the approve button")
//	public void the_investor_clicks_on_the_approve_button() {
//		// Click on the approve button
//		driver.findElement(By.id("approveButton")).click();
//	}
//
//	@Then("the transaction status should be updated to {string}")
//	public void the_transaction_status_should_be_updated_to(String status) {
//		// Verify that the transaction status is updated
//		WebElement transactionStatus = driver.findElement(By.id("transactionStatus"));
//		Assert.assertEquals(transactionStatus.getText(), status);
//	}
//
//	// Scenario: Investor verifies transaction status after approval
//	@When("the investor clicks on the recent transaction page from the side menu")
//	public void the_investor_clicks_on_the_recent_transaction_page_from_the_side_menu() {
//		// Click on the recent transaction page from the side menu
//		driver.findElement(By.id("recentTransactionMenuOption")).click();
//	}
//
//	@Then("the status of the transaction should be displayed as {string}")
//	public void the_status_of_the_transaction_should_be_displayed_as(String status) {
//		// Verify that the status is displayed as expected
//		WebElement transactionStatus = driver.findElement(By.id("transactionStatus"));
//		Assert.assertEquals(transactionStatus.getText(), status);
//	}
//}
