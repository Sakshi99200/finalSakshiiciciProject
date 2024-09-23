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
//public class PMSFullRedemptionJointHolder_InvestorLogin {
//	public WebDriver driver;
//	public static ChromeOptions option;
//	TestContextSetup testContextSetup;
//	LoginPage loginPage;
//
//	public PMSFullRedemptionJointHolder_InvestorLogin(TestContextSetup testContextSetup) {
//		this.testContextSetup = testContextSetup;
//		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
//	}
//
//	@Given("the investor is logged in")
//	public void investorIsLoggedIn() {
//		// Code to log in as an investor
//		driver.get("https://example.com/login"); // Replace with actual URL
//		driver.findElement(By.id("username")).sendKeys("investorUsername");
//		driver.findElement(By.id("password")).sendKeys("investorPassword");
//		driver.findElement(By.id("loginButton")).click();
//	}
//
//	@Given("the dashboard page is displayed")
//	public void dashboardPageIsDisplayed() {
//		// Verify the dashboard is displayed
//		WebElement dashboard = driver.findElement(By.id("dashboard"));
//		Assert.assertTrue(dashboard.isDisplayed(), "Dashboard is not displayed");
//	}
//
//	@When("the investor clicks on the redemption option")
//	public void investorClicksRedemptionOption() {
//		driver.findElement(By.id("redemptionOption")).click(); // Use actual locator
//	}
//
//	@Then("the redemption page should be displayed")
//	public void redemptionPageShouldBeDisplayed() {
//		WebElement redemptionPage = driver.findElement(By.id("redemptionPage")); // Use actual locator
//		Assert.assertTrue(redemptionPage.isDisplayed(), "Redemption page is not displayed");
//	}
//
//	@Given("the investor is on the redemption page")
//	public void investorIsOnRedemptionPage() {
//		redemptionPageShouldBeDisplayed(); // Reuse the previous step to verify
//	}
//
//	@When("the investor selects {string} from the dropdown")
//	public void investorSelectsHolderFromDropdown(String holderType) {
//		WebElement holderDropdown = driver.findElement(By.id("holderTypeDropdown"));
//		holderDropdown.click();
//		holderDropdown.findElement(By.xpath("//option[text()='" + holderType + "']")).click();
//	}
//
//	@When("the investor selects the strategy checkbox")
//	public void investorSelectsStrategyCheckbox() {
//		WebElement strategyCheckbox = driver.findElement(By.id("strategyCheckbox"));
//		if (!strategyCheckbox.isSelected()) {
//			strategyCheckbox.click();
//		}
//	}
//
//	@When("the investor clicks on the full redemption radio button")
//	public void investorClicksFullRedemptionRadioButton() {
//		WebElement fullRedemptionRadio = driver.findElement(By.id("fullRedemptionRadioButton"));
//		fullRedemptionRadio.click();
//	}
//
//	@When("the investor clicks on the redeem button")
//	public void investorClicksRedeemButton() {
//		driver.findElement(By.id("redeemButton")).click();
//	}
//
//	@Then("the L2 screen should be displayed")
//	public void l2ScreenShouldBeDisplayed() {
//		WebElement l2Screen = driver.findElement(By.id("l2Screen")); // Use actual locator
//		Assert.assertTrue(l2Screen.isDisplayed(), "L2 screen is not displayed");
//	}
//
//	@Then("the entered amount should be displayed on the L2 screen")
//	public void enteredAmountShouldBeDisplayedOnL2Screen() {
//		WebElement amountElement = driver.findElement(By.id("enteredAmount")); // Use actual locator
//		String amount = amountElement.getText();
//		Assert.assertNotNull(amount, "Entered amount is not displayed on L2 screen");
//	}
//
//	@When("the investor clicks on the confirmation checkbox")
//	public void investorClicksConfirmationCheckbox() {
//		WebElement confirmationCheckbox = driver.findElement(By.id("confirmationCheckbox"));
//		if (!confirmationCheckbox.isSelected()) {
//			confirmationCheckbox.click();
//		}
//	}
//
//	@When("the investor clicks on the redeem amount button")
//	public void investorClicksRedeemAmountButton() {
//		driver.findElement(By.id("redeemAmountButton")).click();
//	}
//
//	@When("the investor enters the OTP")
//	public void investorEntersOTP() {
//		WebElement otpField = driver.findElement(By.id("otpField"));
//		otpField.sendKeys("123456"); // Replace with actual OTP
//		driver.findElement(By.id("submitOtpButton")).click();
//	}
//
//	@Then("the investor should see a success validation message")
//	public void investorShouldSeeSuccessValidationMessage() {
//		WebElement successMessage = driver.findElement(By.id("successMessage"));
//		Assert.assertTrue(successMessage.isDisplayed(), "Success validation message is not displayed");
//	}
//
//	@When("the investor clicks on the recent transaction option from the side menu")
//	public void investorClicksRecentTransactionOption() {
//		driver.findElement(By.id("recentTransactionOption")).click();
//	}
//
//	@Then("the investor should see the entry in the transaction list")
//	public void investorShouldSeeEntryInTransactionList() {
//		WebElement transactionList = driver.findElement(By.id("transactionList"));
//		Assert.assertTrue(transactionList.isDisplayed(), "Transaction entry is not displayed in the list");
//	}
//
//	@Then("the status of the transaction should be displayed correctly")
//	public void statusOfTransactionShouldBeDisplayedCorrectly() {
//		WebElement statusElement = driver.findElement(By.id("transactionStatus"));
//		String status = statusElement.getText();
//		Assert.assertEquals(status, "Pending Joint Holder Approval", "Transaction status is incorrect");
//	}
//
//	@Given("the joint holder is logged in")
//	public void jointHolderIsLoggedIn() {
//		// Code to log in as a joint holder
//		driver.get("https://example.com/login"); // Replace with actual URL
//		driver.findElement(By.id("username")).sendKeys("jointHolderUsername");
//		driver.findElement(By.id("password")).sendKeys("jointHolderPassword");
//		driver.findElement(By.id("loginButton")).click();
//	}
//
//	@When("the joint holder clicks on the JH request tab")
//	public void jointHolderClicksOnJHRequestTab() {
//		driver.findElement(By.id("jhRequestTab")).click(); // Use actual locator
//	}
//
//	@Then("the placed transaction should be displayed")
//	public void placedTransactionShouldBeDisplayed() {
//		WebElement transaction = driver.findElement(By.id("transactionItem"));
//		Assert.assertTrue(transaction.isDisplayed(), "Placed transaction is not displayed");
//	}
//
//	@When("the joint holder clicks on the approve button for the transaction")
//	public void jointHolderClicksApproveButton() {
//		driver.findElement(By.id("approveButton")).click(); // Use actual locator
//	}
//
//	@Then("the transaction status should be updated to {string}")
//	public void transactionStatusShouldBeUpdatedTo(String expectedStatus) {
//		WebElement statusElement = driver.findElement(By.id("transactionStatus"));
//		String status = statusElement.getText();
//		Assert.assertEquals(status, expectedStatus, "Transaction status is not updated correctly");
//	}
//
//	@Then("the status of the transaction should be displayed as {string}")
//	public void statusOfTransactionShouldBeDisplayedAs(String expectedStatus) {
//		transactionStatusShouldBeUpdatedTo(expectedStatus); // Reuse previous step
//	}
//}