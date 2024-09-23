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

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private By employee = By.xpath("//p[contains(text(),'Employee')]");
	private By id = By.xpath("//input[@name='username']");
	private By Password = By.xpath("//input[@name='password']");
	private By login = By.xpath("//input[@type='submit']");
	private By profile = By.xpath("//div[text()='IPAMC7003']");
	// investor login
	private By enterPanNumber = By.xpath("//input[@placeholder=\"Enter your PAN number\"]");
	private By clickOnNextButton = By.xpath("//input[@value=\"Next\"]");
	private By clickOnGenerateOTP = By.xpath("//input[@value=\"Generate OTP\"]");
	private By enterOTP = By.xpath("//input[@class=\"OTP_inputOtp__6GZQN\"][1]");
	private By verifyOTP = By.xpath("//input[@value=\"Verify OTP\"]");
	private By enterPassword = By.xpath("//input[@type=\"password\"]");
	private By clickOnSubmitButton = By.xpath("//input[@type=\"submit\"]");
	private By clickOnAdvanceButton = By.xpath("//button[@id=\"details-button\"]");
	private By clickOnGenerateOtpButton = By.xpath("//input[@value=\"Generate OTP\"]");

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
}
