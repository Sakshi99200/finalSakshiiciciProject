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
//public class AdditionPurchase_ExistingStrategySingleHolder {
//	public WebDriver driver;
//	public static ChromeOptions option;
//	LoginPage loginPage;
//	TestContextSetup testContextSetup;
//
//	public AdditionPurchase_ExistingStrategySingleHolder(TestContextSetup testContextSetup) {
//		this.testContextSetup = testContextSetup;
//		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
//	}
//
//	@Given("the investor is logged in to the portal")
//	public void the_investor_is_logged_in_to_the_portal() {
//		driver.findElement(By.id("username")).sendKeys("investorUsername");
//		driver.findElement(By.id("password")).sendKeys("investorPassword");
//		driver.findElement(By.id("loginButton")).click();
//	}
//
//	@Given("the dashboard page is displayed on the screen")
//	public void the_dashboard_page_is_displayed() {
//		Assert.assertTrue(driver.findElement(By.id("dashboard")).isDisplayed());
//	}
//
//	@When("the investor clicks on the Additional Purchase option from the side menu")
//	public void the_investor_clicks_on_the_additional_purchase_option_from_the_side_menu() {
//		driver.findElement(By.id("additionalPurchaseMenuOption")).click();
//	}
//
//	@Then("the Additional Purchase page should be displayed")
//	public void the_additional_purchase_page_should_be_displayed() {
//		Assert.assertTrue(driver.findElement(By.id("additionalPurchasePage")).isDisplayed());
//	}
//
//	// Scenario: Investor selects single holder and enters amount for existing
//	// strategy
//	@Given("the investor is on the Additional Purchase page1")
//	public void the_investor_is_on_the_additional_purchase_page() {
//		Assert.assertTrue(driver.findElement(By.id("additionalPurchasePage")).isDisplayed());
//	}
//
//	@When("the investor selects {string} from the dropdown for existing strategy")
//	public void the_investor_selects_from_the_dropdown(String holderType) {
//		WebElement holderDropdown = driver.findElement(By.id("holderDropdown"));
//		holderDropdown.sendKeys(holderType);
//	}
//
//	@When("the investor clicks on the strategy checkbox")
//	public void the_investor_clicks_on_the_strategy_checkbox() {
//		driver.findElement(By.id("strategyCheckbox")).click();
//	}
//
//	@When("the investor enters an amount for the existing strategy")
//	public void the_investor_enters_an_amount_for_the_existing_strategy() {
//		driver.findElement(By.id("amountField")).sendKeys("50000"); // Example amount
//	}
//
//	@Then("the amount should be entered correctly")
//	public void the_amount_should_be_entered_correctly() {
//		WebElement amountField = driver.findElement(By.id("amountField"));
//		Assert.assertEquals(amountField.getAttribute("value"), "50000");
//	}
//
//	// Scenario: Investor completes the purchase process
//	@When("the investor clicks on the Purchase button")
//	public void the_investor_clicks_on_the_purchase_button() {
//		driver.findElement(By.id("purchaseButton")).click();
//	}
//
//	@Then("the L2 screen should be displayed on the screen")
//	public void the_l2_screen_should_be_displayed() {
//		Assert.assertTrue(driver.findElement(By.id("L2Screen")).isDisplayed());
//	}
//
//	// Scenario: Investor selects payment mode and proceeds to payment
//	@When("the investor selects {string} as the mode of payment")
//	public void the_investor_selects_as_the_mode_of_payment(String paymentMode) {
//		driver.findElement(By.id("paymentModeDropdown")).sendKeys(paymentMode);
//	}
//
//	@When("the investor clicks on {string}")
//	public void the_investor_clicks_on(String option) {
//		driver.findElement(By.id(option)).click();
//	}
//
//	@When("the investor clicks on the T&C checkbox")
//	public void the_investor_clicks_on_the_tc_checkbox() {
//		driver.findElement(By.id("tcCheckbox")).click();
//	}
//
//	@When("the investor clicks on the Proceed to Payment button")
//	public void the_investor_clicks_on_the_proceed_to_payment_button() {
//		driver.findElement(By.id("proceedToPaymentButton")).click();
//	}
//
//	@Then("the OTP entry screen should be displayed")
//	public void the_otp_entry_screen_should_be_displayed() {
//		Assert.assertTrue(driver.findElement(By.id("otpScreen")).isDisplayed());
//	}
//
//	// Scenario: Investor completes payment process
//	@When("the investor enters the OTP")
//	public void the_investor_enters_the_otp() {
//		driver.findElement(By.id("otpField")).sendKeys("123456"); // Example OTP
//		driver.findElement(By.id("confirmOtpButton")).click();
//	}
//
//	@Then("the payment link should be displayed on the screen")
//	public void the_payment_link_should_be_displayed_on_the_screen() {
//		Assert.assertTrue(driver.findElement(By.id("paymentLink")).isDisplayed());
//	}
//
//	// Scenario: Investor closes the payment link and verifies the recent
//	// transaction
//	@When("the investor clicks on the Close button")
//	public void the_investor_clicks_on_the_close_button() {
//		driver.findElement(By.id("closePaymentLinkButton")).click();
//	}
//
//	@When("the investor clicks on the Recent Transactions option from the side menu")
//	public void the_investor_clicks_on_the_recent_transactions_option_from_the_side_menu() {
//		driver.findElement(By.id("recentTransactionsMenuOption")).click();
//	}
//
//	@Then("the placed transaction entry should be displayed on the Recent Transactions page")
//	public void the_placed_transaction_entry_should_be_displayed_on_the_recent_transactions_page() {
//		WebElement transactionEntry = driver.findElement(By.id("transactionEntry"));
//		Assert.assertTrue(transactionEntry.isDisplayed(), "Placed transaction entry should be displayed");
//	}
//
//	@Then("the status of the transaction should be {string}")
//	public void the_status_of_the_transaction_should_be(String status) {
//		WebElement transactionStatus = driver.findElement(By.id("transactionStatus"));
//		Assert.assertEquals(transactionStatus.getText(), status);
//	}
//
//	// Scenario: Investor reviews transaction request and approves
//	@Given("the investor is logged in to approve the transaction")
//	public void the_investor_is_logged_in_to_approve_the_transaction() {
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
////		WebElement transactionStatus = driver.findElement(By.id("transactionStatus"));
////		Assert.assertEquals(transactionStatus.getText(), "Expected Status"); // Update with actual status
//	}
//}
