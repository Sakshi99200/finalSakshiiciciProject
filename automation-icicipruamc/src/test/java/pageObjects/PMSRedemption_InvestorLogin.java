package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PMSRedemption_InvestorLogin {

	private WebDriver driver;
	public static String AUMAmountvalue;

	public PMSRedemption_InvestorLogin(WebDriver driver) {
		this.driver = driver;
	}

	// login

	private By employee = By.xpath("//p[contains(text(),'Employee')]");
	private By id = By.xpath("//input[@name='username']");
	private By Password = By.xpath("//input[@name='password']");
	private By login = By.xpath("//input[@type='submit']");
	private By profile = By.xpath("//div[text()='IPAMC7003']");
	// investor login
	private By enterPanNumber = By.xpath("//input[@placeholder=\"Enter your PAN number\"]");
	private By clickOnNextButton = By.xpath("//input[@value=\"Next\"]");
	private By clickOnGenerateOTP = By.xpath("//input[@value=\"Generate OTP\"]");
//	private By enterOTP = By.xpath("//input[@class=\"OTP_inputOtp__6GZQN\"][1]");
	private By verifyOTP = By.xpath("//input[@value=\"Verify OTP\"]");
	private By enterPassword = By.xpath("//input[@type=\"password\"]");
	private By clickOnSubmitButton = By.xpath("//input[@type=\"submit\"]");
	private By clickOnAdvanceButton = By.xpath("//button[@id=\"details-button\"]");
	private By clickOnGenerateOtpButton = By.xpath("//input[@value=\"Generate OTP\"]");
	//
	private By clickOnexpandButton = By.xpath("//*[@id=\"root\"]/div[3]/header/div/button/img");
	private By clickOnRedemptionModule = By.xpath("(//span[contains(.,'Redemption')])[1]");
	private By clickOnSelectHolderDropdown = By.xpath("//*[@id=\"root\"]/main/div/div/div/div/div[1]/div/div/div/div");
	private By clickOnStrategyCheckBox = By.xpath("(//input[@type=\"checkbox\"])[1]");
	private By clickOnPartialRedemptionCheckBox = By.xpath("(//input[@value=\"Partial Redemption\"])[1]");
	private By enterAUMAmount = By.xpath("(//input[@placeholder=\"Enter Amount\"])[1]");
	private By clickOnredeemButton = By.xpath("//button[@type=\"button\" and contains(.,'Redeem')]");
	private By disabledRedeemButton = By
			.cssSelector("button[class*=\"MuiButton-textSizeMedium MuiButtonBase-root Mui-disabled\"]");

	private By L2Screen = By.xpath("//div[@class=\"PurchaseDrawer_header__zF-Yk\"]");
	private By clickOnTC_checkbox = By.xpath("/html/body/div[2]/div[3]/div//div[4]/div[2]/span/input");
	private By clickOnRedeemAmountButton = By.xpath("//button[contains(.,'Redeem Amount')]");
	private By enterOTP = By.xpath("(//input[@class=\"OTP_inputOtp__6GZQN\"])[1]");

	// login //

	// verify user is on login page

	public void verifyLoginPage() throws InterruptedException {
		Thread.sleep(1000);

		try {

			String currentUrl = driver.getCurrentUrl();
			String expectedUrl = "https://apps.uat.icicipruai.com/portal/";
			Assert.assertEquals(currentUrl, expectedUrl,
					"Didn't navigate to the correct page , login page is not displayed on the screen");
			System.out.println("navigate to correct webpage");

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);

		}
	}

	// Investor login

	public void userLogin(String panNumber, String password) throws InterruptedException, AWTException {

		Thread.sleep(2000);

		try {

			List<WebElement> advanceButton = driver.findElements(By.xpath("//button[@id=\"details-button\"]"));
			List<WebElement> generateOtpButton = driver.findElements(By.xpath("//input[@value=\"Generate OTP\"]"));
			// click on generate OTP
//		List<WebElement> generateOTP = driver.findElements(By.xpath("//input[@value=\"Generate OTP\"]"));

			if (!advanceButton.isEmpty() && advanceButton.get(0).isDisplayed()) {
				Thread.sleep(3000);

				driver.findElement(clickOnAdvanceButton).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath("//a[@id=\"proceed-link\"]")).click();
				Thread.sleep(1000);
				Robot robot = new Robot();

				robot.keyPress(KeyEvent.VK_CONTROL);

				robot.keyPress(KeyEvent.VK_MINUS);

				robot.keyRelease(KeyEvent.VK_CONTROL);

				robot.keyRelease(KeyEvent.VK_MINUS);

				driver.findElement(enterPanNumber).sendKeys(panNumber);

				System.out.println("entered pan number");

				Thread.sleep(1000);
				driver.findElement(clickOnNextButton).click();

				// click on generate otp button
				Thread.sleep(7000);

				if (!generateOtpButton.isEmpty() && generateOtpButton.get(0).isDisplayed()) {

					driver.findElement(clickOnGenerateOtpButton).click();

					System.out.println("clicked on generate otp button");

					Thread.sleep(10000);

					// enter OTP
					driver.findElement(enterOTP).sendKeys("756750");

					// click on verify otp button

					driver.findElement(verifyOTP).click();

					// enter Password

					Thread.sleep(2000);

					driver.findElement(enterPassword).sendKeys(password);
					Thread.sleep(2000);

					// click on submit button

					driver.findElement(clickOnSubmitButton).click();

					Thread.sleep(2000);

					System.out.println("user Login Successfully..");
					String originalTab = driver.getWindowHandle();

				} else {

					((JavascriptExecutor) driver).executeScript("window.open();");

					Set<String> allTabs = driver.getWindowHandles();
					ArrayList<String> tabs = new ArrayList<>(allTabs);

					driver.switchTo().window(tabs.get(1));
//				switchTab(1);

					driver.get("https://api.uat.icicipruai.com/userapi/investor/getCsrf");

					Thread.sleep(3000);

					driver.findElement(clickOnAdvanceButton).click();
					Thread.sleep(4000);

					driver.findElement(By.xpath("//a[@id=\"proceed-link\"]")).click();

					closeDriver();

//				switchTab(0);
					driver.switchTo().window(tabs.get(0));

					Thread.sleep(1000);

					driver.findElement(clickOnNextButton).click();

					driver.findElement(clickOnGenerateOtpButton).click();

					Thread.sleep(10000);

					// enter OTP
					driver.findElement(enterOTP).sendKeys("756750");

					// click on verify otp button

					driver.findElement(verifyOTP).click();

					// enter Password

					Thread.sleep(2000);

					driver.findElement(enterPassword).sendKeys(password);

					Thread.sleep(2000);

					// click on submit button

					driver.findElement(clickOnSubmitButton).click();

					Thread.sleep(2000);

					System.out.println("user Login Successfully..");
//
//				driver.findElement(clickOnGenerateOtpButton).click();
//
//				System.out.println("clicked on generate otp button");
//
//				Thread.sleep(10000);
//
//				// enter OTP
//				driver.findElement(enterOTP).sendKeys("756750");
//
//				// click on verify otp button
//
//				driver.findElement(verifyOTP).click();
//
//				// enter Password
//
//				Thread.sleep(2000);
//
//				driver.findElement(enterPassword).sendKeys(password);
//
//				// click on submit button
//
//				driver.findElement(clickOnSubmitButton).click();
//
//				Thread.sleep(2000);
//
//				System.out.println("user Login SUccessfully..");

				}

			} else {

				driver.findElement(enterPanNumber).sendKeys(panNumber);
				System.out.println("entered pan number");
				Thread.sleep(1000);
				driver.findElement(clickOnNextButton).click();
				Thread.sleep(1000);

				driver.findElement(clickOnGenerateOtpButton).click();

				Thread.sleep(10000);

				// enter OTP
				driver.findElement(enterOTP).sendKeys("756750");

				// click on verify otp button

				driver.findElement(verifyOTP).click();

				// enter Password

				Thread.sleep(2000);

				driver.findElement(enterPassword).sendKeys(password);

				// click on submit button

				driver.findElement(clickOnSubmitButton).click();

				Thread.sleep(2000);

				System.out.println("user Login Sucessfully..");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);

		}
	}

	public void verifyDashboard() throws InterruptedException {

		try {

			// verify after login dash board page is displaying or not
			Thread.sleep(10000);

			String expectedPage = "https://apps.uat.icicipruai.com/portal/home";

			String actualPage = driver.getCurrentUrl();

			Assert.assertEquals(expectedPage, actualPage,
					"Didn't navigate to the correct page , dashboard page is not displayed on the screen");

			System.out.println("Dashboard page is displayed on screen");

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);

		}
	}

	public void switchTab(int index) {
		Set<String> windowhandle = driver.getWindowHandles();
		driver.switchTo().window(windowhandle.toArray()[index].toString());
	}

	public void closeDriver() {
		driver.close();
	}

	// ** pms redemption single holder partial ** //

	// click on expand option

	public void clickOnexpandOption() throws InterruptedException {

		try {

			Thread.sleep(10000);

			driver.findElement(clickOnexpandButton).click();

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);

		}

	}

	public void verifyInvestorIsOnRedemptionPage() throws InterruptedException {
		try {
			Thread.sleep(1000);

			String currentUrl = driver.getCurrentUrl();
			String expectedUrl = "https://apps.uat.icicipruai.com/portal/redemption";
			Assert.assertEquals(currentUrl, expectedUrl,
					"Didn't navigate to the correct page , redemption page is not displayed on the screen");
			System.out.println("Redmption page is displayed on the screen");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);

		}

	}
	// click on redemption from side menu

	public void clickOnRedemptionModule() throws InterruptedException {
		Thread.sleep(1000);
		try {

			driver.findElement(clickOnRedemptionModule).click();

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);

		}

	}

	// click on PMS option select holder dropdown

	public void clickOnSelectHolderDropdown() {

		try {

			driver.findElement(clickOnSelectHolderDropdown).click();

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);

		}
	}

	public void selectHolderNameFromeDropdown(String holderName) {

		try {

			List<WebElement> HolderList = driver
					.findElements(By.xpath("//p[@class=\"MuiTypography-root MuiTypography-body1 css-1sjmn7i\"]"));
			for (int i = 0; i < HolderList.size(); i++) {
				WebElement holderListString = HolderList.get(i);
				String holderList_name = holderListString.getText();
				if (holderList_name.contains(holderName)) {
					System.out.println("Holder name is present on the screen");
					driver.findElement(By.xpath(
							"(//p[@class=\"MuiTypography-root MuiTypography-body1 css-1sjmn7i\"])" + (i + 1) + ""))
							.click();
					break;
				} else {

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);

		}
	}

	// select stretegy checkbox

	public void clickOnStrategyCheckBox() throws InterruptedException {

		Thread.sleep(1000);

		try {

			driver.findElement(clickOnStrategyCheckBox).click();

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);

		}
	}

	// click on partial option on strategy card

	public void selectPartialRedemptionOption() {

		try {

			driver.findElement(clickOnPartialRedemptionCheckBox).click();

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);

		}

	}

	// enter amount less that 2 lakh and check error validation message

	public void enterAUMAmount(String amount) {

		try {
			driver.findElement(enterAUMAmount).sendKeys(amount);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);

		}
	}

	public void verifyErrorValidationForEnteringAUMAMountLessThan_2Lakh() {

		try {

			String ExpectedErrorValidation = "Minimum Redemption amount is 2 Lakhs.";

			WebElement errorValidation = driver
					.findElement(By.xpath("(//p[contains(.,'Minimum Redemption amount is 2 Lakhs.')])[1]"));

			String ActualErrorValidation = errorValidation.getText();

			System.out.println(ActualErrorValidation);

			Assert.assertEquals(ExpectedErrorValidation, ActualErrorValidation,
					"For entering AUM amount less than 2 Lakh ,Error validation is not displayed on screen");

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);

		}

	}

	public String selectedStrategyTotal_AUMAMount() {

		// strore strategy aum amount

		WebElement aumAmount = driver.findElement(By.xpath("(//p[@class=\"StrategyList_aumAmountValue__VYNQP\"])[1]"));

		String AumAmountString = aumAmount.getText();

		System.out.println(AumAmountString);

		AUMAmountvalue = AumAmountString.replace("[^0-9]", "").trim();

		System.out.println(AUMAmountvalue);

		return AUMAmountvalue;

	}

	public void verifyErrorValidationForEnteringAUMAmount_equalToTheTotalAUMAmount() {

		String ExpectedErrorValidation = "Select full redemption if you want redeem the entire AUM Amount.";

		WebElement errorValidation = driver.findElement(
				By.xpath("(//p[contains(.,'Select full redemption if you want redeem the entire AUM Amount.')])[1]"));

		String ActualErrorValidation = errorValidation.getText();

		System.out.println(ActualErrorValidation);

		Assert.assertEquals(ExpectedErrorValidation, ActualErrorValidation,
				"For entering AUM amount equal to the AUM amount ,Error validation is not displayed on screen");

	}

	public void clearAumAMountField() throws InterruptedException {

		Thread.sleep(400);

		driver.findElement(enterAUMAmount).click();

		driver.findElement(enterAUMAmount).clear();

	}

	public void verifyRedeemButtomDisabled() {

		List<WebElement> redeemButton = driver.findElements(clickOnPartialRedemptionCheckBox);

		if (!redeemButton.isEmpty() && redeemButton.get(0).isDisplayed()) {

			Assert.assertTrue(true, "Redeem button is not disabled for empty AUM amount Field");

		} else {

			Assert.fail("Redeem button is not disabled for empty AUM amount Field");
		}
	}

	public void clickOnRedeemButton() throws InterruptedException {

		driver.findElement(clickOnredeemButton).click();

		Thread.sleep(10000);
	}

	public void verifyInvestorIsOnL2Screen() {

		Assert.assertTrue(driver.findElement(L2Screen).isDisplayed(),
				"After clicked on redeem button L2 screen is not displayed on the screen");

	}

	public void clickOnTC_checkbox() {

		driver.findElement(clickOnTC_checkbox).click();

	}

	public void clickOnRedeemAmountButton() throws InterruptedException {

		driver.findElement(clickOnredeemButton).click();

		Thread.sleep(5000);

	}

	public void enterOTP() throws InterruptedException {

		driver.findElement(enterOTP).sendKeys("756750");

		Thread.sleep(25000);

	}

}