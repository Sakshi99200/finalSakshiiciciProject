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
//public class PMSFullRedemptionJointHolder_DistributorLogin {
//
//	public WebDriver driver;
//	public static ChromeOptions option;
//	LoginPage loginPage;
//	TestContextSetup testContextSetup;
//
//	public PMSFullRedemptionJointHolder_DistributorLogin(TestContextSetup testContextSetup) {
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
//	// Scenario: Distributor initiates full redemption
//	@Given("the distributor is on the redemption page")
//	public void the_distributor_is_on_the_redemption_page() {
//		Assert.assertTrue(driver.findElement(By.id("redemptionPage")).isDisplayed());
//	}
//
//	@When("the distributor selects the PAN number from the dropdown")
//	public void the_distributor_selects_the_pan_number_from_the_dropdown() {
//		WebElement panDropdown = driver.findElement(By.id("panDropdown"));
//		panDropdown.sendKeys("PAN12345");
//	}
//
//	@When("the distributor selects the joint holder name")
//	public void the_distributor_selects_joint_holder_name() {
//		WebElement holderDropdown = driver.findElement(By.id("holderDropdown"));
//		holderDropdown.sendKeys("Joint Holder Name");
//	}
//
//	@When("the distributor selects the strategy checkbox")
//	public void the_distributor_selects_the_strategy_checkbox() {
//		driver.findElement(By.id("strategyCheckbox")).click();
//	}
//
//	@When("the distributor clicks on the full radio button")
//	public void the_distributor_clicks_on_the_full_radio_button() {
//		driver.findElement(By.id("fullRadioButton")).click();
//	}
//
//	@When("the distributor clicks on the redeem button")
//	public void the_distributor_clicks_on_the_redeem_button() {
//		driver.findElement(By.id("redeemButton")).click();
//	}
//
//	@Then("the L2 screen should be displayed")
//	public void the_l2_screen_should_be_displayed() {
//		Assert.assertTrue(driver.findElement(By.id("L2Screen")).isDisplayed());
//	}
//
//	// Scenario: Distributor verifies L2 screen details
//	@Then("the entered amount should be displayed on the screen")
//	public void the_entered_amount_should_be_displayed_on_the_screen() {
//		WebElement enteredAmount = driver.findElement(By.id("enteredAmount"));
//		Assert.assertTrue(enteredAmount.isDisplayed(), "Entered amount should be displayed");
//	}
//
//	// Scenario: Distributor completes redemption with OTP
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
//	public void the_distributor_enters_the_otp() {
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
//		Assert.assertEquals(transactionStatus.getText(), "Expected Status"); // Update with actual status
//	}
//
//	// Scenario: Investor logs in and reviews distributor's transaction request
//	@Given("the investor is logged in to verify distributor trsanction request")
//	public void the_investor_is_logged_in() {
//		driver.findElement(By.id("username")).sendKeys("investorUsername");
//		driver.findElement(By.id("password")).sendKeys("investorPassword");
//		driver.findElement(By.id("loginButton")).click();
//	}
//
//	@When("the investor clicks on the dashboard from the side menu")
//	public void the_investor_clicks_on_the_dashboard_from_the_side_menu() {
//		driver.findElement(By.id("dashboardMenuOption")).click();
//	}
//
//	@When("the investor clicks on the Distributor transaction request option")
//	public void the_investor_clicks_on_the_distributor_transaction_request_option() {
//		driver.findElement(By.id("distributorTransactionRequestMenuOption")).click();
//	}
//
//	@Then("the request entry should be displayed")
//	public void the_request_entry_should_be_displayed() {
//		WebElement requestEntry = driver.findElement(By.id("requestEntry"));
//		Assert.assertTrue(requestEntry.isDisplayed(), "Request entry should be displayed");
//	}
//
//	// Scenario: Investor approves distributor's transaction request
//	@When("the investor clicks on the proceed button for the request")
//	public void the_investor_clicks_on_the_proceed_button_for_the_request() {
//		driver.findElement(By.id("proceedButton")).click();
//	}
//
//	@When("the investor clicks on the approve button")
//	public void the_investor_clicks_on_the_approve_button() {
//		driver.findElement(By.id("approveButton")).click();
//	}
//
//	@Then("the transaction entry status should be correctly displayed")
//	public void the_transaction_entry_status_should_be_correctly_displayed() {
//		WebElement transactionStatus = driver.findElement(By.id("transactionStatus"));
//		Assert.assertEquals(transactionStatus.getText(), "Expected Status"); // Update with actual status
//	}
//
//	// Scenario: Joint Holder Investor logs in and reviews transaction
//	@Given("the Joint Holder Investor is logged in")
//	public void the_joint_holder_investor_is_logged_in() {
//		driver.findElement(By.id("username")).sendKeys("jhInvestorUsername");
//		driver.findElement(By.id("password")).sendKeys("jhInvestorPassword");
//		driver.findElement(By.id("loginButton")).click();
//	}
//
//	@When("the Joint Holder Investor clicks on the JH request tab")
//	public void the_joint_holder_investor_clicks_on_the_jh_request_tab() {
//		driver.findElement(By.id("jhRequestTab")).click();
//	}
//
//	@Then("the placed transaction should be displayed")
//	public void the_placed_transaction_should_be_displayed() {
//		WebElement placedTransaction = driver.findElement(By.id("placedTransaction"));
//		Assert.assertTrue(placedTransaction.isDisplayed(), "Placed transaction should be displayed");
//	}
//
//	// Scenario: Joint Holder Investor approves the transaction
//	@When("the Joint Holder Investor clicks on the approve button for the transaction")
//	public void the_joint_holder_investor_clicks_on_the_approve_button_for_the_transaction() {
//		driver.findElement(By.id("approveButton")).click();
//	}
//
//	@Then("the status of the transaction should show as {string}")
//	public void the_status_of_the_transaction_should_show_as(String status) {
//		WebElement transactionStatus = driver.findElement(By.id("transactionStatus"));
//		Assert.assertEquals(transactionStatus.getText(), status);
//	}
//}
