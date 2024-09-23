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
//public class PMSPartialRedemptionSingleHolder_DistributorLogin {
//	public WebDriver driver;
//	public static ChromeOptions option;
//	TestContextSetup testContextSetup;
//	LoginPage loginPage;
//
//	public PMSPartialRedemptionSingleHolder_DistributorLogin(TestContextSetup testContextSetup) {
//		this.testContextSetup = testContextSetup;
//		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
//	}
//
//	@Given("the distributor is logged in")
//	public void the_distributor_is_logged_in() {
//		// Code to log in as a distributor
//		driver.findElement(By.id("username")).sendKeys("distributorUsername");
//		driver.findElement(By.id("password")).sendKeys("distributorPassword");
//		driver.findElement(By.id("loginButton")).click();
//	}
//
//	@Given("the dashboard page is displayed")
//	public void the_dashboard_page_is_displayed() {
//		// Verify that the dashboard page is displayed
//		WebElement dashboard = driver.findElement(By.id("dashboardPage"));
//		Assert.assertTrue(dashboard.isDisplayed());
//	}
//
//	@When("the distributor clicks on the redemption option")
//	public void the_distributor_clicks_on_the_redemption_option() {
//		// Click on the redemption option
//		driver.findElement(By.id("redemptionOption")).click();
//	}
//
//	@Then("the redemption page should be displayed")
//	public void the_redemption_page_should_be_displayed() {
//		// Verify that the redemption page is displayed
//		WebElement redemptionPage = driver.findElement(By.id("redemptionPage"));
//		Assert.assertTrue(redemptionPage.isDisplayed());
//	}
//
//	@When("the distributor selects {string} from the dropdown")
//	public void the_distributor_selects_from_the_dropdown(String option) {
//		// Select the specified option from the dropdown
//		WebElement dropdown = driver.findElement(By.id("panNumberDropdown"));
//		dropdown.click();
//		dropdown.findElement(By.xpath("//option[text()='" + option + "']")).click();
//	}
//
//	@When("the distributor selects the {string} name")
//	public void the_distributor_selects_the_name(String holderName) {
//		// Select the specified holder name
//		WebElement holderDropdown = driver.findElement(By.id("holderDropdown"));
//		holderDropdown.click();
//		holderDropdown.findElement(By.xpath("//option[text()='" + holderName + "']")).click();
//	}
//
//	@When("the distributor selects the strategy checkbox")
//	public void the_distributor_selects_the_strategy_checkbox() {
//		// Select the strategy checkbox
//		driver.findElement(By.id("strategyCheckbox")).click();
//	}
//
//	@When("the distributor clicks on the partial redemption radio button")
//	public void the_distributor_clicks_on_the_partial_redemption_radio_button() {
//		// Click on the partial redemption radio button
//		driver.findElement(By.id("partialRedemptionRadioButton")).click();
//	}
//
//	@Then("no error validation should be displayed")
//	public void no_error_validation_should_be_displayed() {
//		// Verify that no error validation message is displayed
//		WebElement errorMessage = driver.findElement(By.id("errorValidation"));
//		Assert.assertFalse(errorMessage.isDisplayed());
//	}
//
//	@When("the distributor enters an amount less than {int}L in the amount field")
//	public void the_distributor_enters_an_amount_less_than_L_in_the_amount_field(Integer amount) {
//		// Enter an amount less than 2L
//		driver.findElement(By.id("amountField")).sendKeys(String.valueOf(amount - 1));
//	}
//
//	@Then("a validation message should be displayed")
//	public void a_validation_message_should_be_displayed() {
//		// Verify that a validation message is displayed
//		WebElement errorMessage = driver.findElement(By.id("errorValidation"));
//		Assert.assertTrue(errorMessage.isDisplayed());
//	}
//
//	@When("the distributor enters the amount equal to the AUM amount")
//	public void the_distributor_enters_the_amount_equal_to_the_AUM_amount() {
//		// Enter the AUM amount in the amount field
//		WebElement aumAmount = driver.findElement(By.id("aumAmount"));
//		driver.findElement(By.id("amountField")).sendKeys(aumAmount.getText());
//	}
//
//	@Then("no validation message should be displayed")
//	public void no_validation_message_should_be_displayed() {
//		// Verify that no validation message is displayed
//		WebElement errorMessage = driver.findElement(By.id("errorValidation"));
//		Assert.assertFalse(errorMessage.isDisplayed());
//	}
//
//	@When("the distributor does not enter any amount and clicks on the redeem button")
//	public void the_distributor_does_not_enter_any_amount_and_clicks_on_the_redeem_button() {
//		// Ensure the amount field is empty and try to click the redeem button
//		driver.findElement(By.id("amountField")).clear();
//		driver.findElement(By.id("redeemButton")).click();
//	}
//
//	@Then("the redeem button should remain disabled")
//	public void the_redeem_button_should_remain_disabled() {
//		// Verify that the redeem button is disabled
//		WebElement redeemButton = driver.findElement(By.id("redeemButton"));
//		Assert.assertFalse(redeemButton.isEnabled());
//	}
//
//	@When("the distributor enters the AUM amount and clicks on the redeem button")
//	public void the_distributor_enters_the_AUM_amount_and_clicks_on_the_redeem_button() {
//		// Enter the AUM amount and click on the redeem button
//		WebElement aumAmount = driver.findElement(By.id("aumAmount"));
//		driver.findElement(By.id("amountField")).sendKeys(aumAmount.getText());
//		driver.findElement(By.id("redeemButton")).click();
//	}
//
//	@Then("the L2 screen should be displayed")
//	public void the_L2_screen_should_be_displayed() {
//		// Verify that the L2 screen is displayed
//		WebElement l2Screen = driver.findElement(By.id("l2Screen"));
//		Assert.assertTrue(l2Screen.isDisplayed());
//	}
//
//	@Then("the entered amount should be displayed on the L2 screen")
//	public void the_entered_amount_should_be_displayed_on_the_L2_screen() {
//		// Verify that the entered amount is displayed on the L2 screen
//		WebElement enteredAmount = driver.findElement(By.id("enteredAmount"));
//		WebElement aumAmount = driver.findElement(By.id("aumAmount"));
//		Assert.assertEquals(enteredAmount.getText(), aumAmount.getText());
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
//		driver.findElement(By.id("otpField")).sendKeys("123456");
//	}
//
//	@Then("a success validation message should be displayed")
//	public void a_success_validation_message_should_be_displayed() {
//		// Verify that the success validation message is displayed
//		WebElement successMessage = driver.findElement(By.id("successMessage"));
//		Assert.assertTrue(successMessage.isDisplayed());
//	}
//
//	@When("the distributor clicks on the recent transaction option from the side menu")
//	public void the_distributor_clicks_on_the_recent_transaction_option_from_the_side_menu() {
//		// Click on the recent transaction option from the side menu
//		driver.findElement(By.id("recentTransactionMenuOption")).click();
//	}
//
//	@Then("the transaction entry should be displayed")
//	public void the_transaction_entry_should_be_displayed() {
//		// Verify that the transaction entry is displayed
//		WebElement transactionEntry = driver.findElement(By.id("transactionEntry"));
//		Assert.assertTrue(transactionEntry.isDisplayed());
//	}
//
//	@Then("the status of the transaction should be displayed correctly")
//	public void the_status_of_the_transaction_should_be_displayed_correctly() {
//		// Verify that the transaction status is displayed correctly
//		WebElement transactionStatus = driver.findElement(By.id("transactionStatus"));
//		Assert.assertEquals(transactionStatus.getText(), "Expected Status Text");
//	}
//
//	@Given("the investor is logged in")
//	public void the_investor_is_logged_in() {
//		// Code to log in as an investor
//		driver.findElement(By.id("username")).sendKeys("investorUsername");
//		driver.findElement(By.id("password")).sendKeys("investorPassword");
//		driver.findElement(By.id("loginButton")).click();
//	}
//
//	@When("the investor clicks on the Distributor transaction request option from the side menu")
//	public void the_investor_clicks_on_the_Distributor_transaction_request_option_from_the_side_menu() {
//		// Click on the Distributor transaction request option from the side menu
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
//	@When("the investor clicks on the proceed button for the request")
//	public void the_investor_clicks_on_the_proceed_button_for_the_request() {
//		// Click on the proceed button for the request
//		driver.findElement(By.id("proceedButton")).click();
//	}
//
//	@When("the investor clicks on the approve button")
//	public void the_investor_clicks_on_the_approve_button() {
//		// Click on the approve button
//		driver.findElement(By.id("approveButton")).click();
//	}
//
//	@When("the investor clicks on the recent transaction page from the side menu")
//	public void the_investor_clicks_on_the_recent_transaction_page_from_the_side_menu() {
//		// Click on the recent transaction page from the side menu
//		driver.findElement(By.id("recentTransactionMenuOption")).click();
//	}
//
//	@Then("the status of the entry should be updated and displayed correctly")
//	public void the_status_of_the_entry_should_be_updated_and_displayed_correctly() {
//		// Verify that the status of the entry is updated and displayed correctly
//		WebElement transactionStatus = driver.findElement(By.id("transactionStatus"));
//		Assert.assertEquals(transactionStatus.getText(), "Payment is in progress");
//	}
//
//}
