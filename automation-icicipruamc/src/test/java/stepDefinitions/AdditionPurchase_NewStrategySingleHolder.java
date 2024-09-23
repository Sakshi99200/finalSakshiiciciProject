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
//import utils.TestContexSetup;
//
//public class AdditionPurchase_NewStrategySingleHolder {
//
//	public WebDriver driver;
//	public static ChromeOptions option;
//	TestContexSetup testContexSetup;
//	LoginPage loginPage;
//
//	public AdditionPurchase_NewStrategySingleHolder(TestContexSetup testContexSetup) {
//		this.testContexSetup = testContexSetup;
//		this.loginPage = testContexSetup.pageObjectManager.getLoginpage();
//	}
//	@Given("the investor is logged in")
//    public void the_investor_is_logged_in() {
//        driver.findElement(By.id("username")).sendKeys("investorUsername");
//        driver.findElement(By.id("password")).sendKeys("investorPassword");
//        driver.findElement(By.id("loginButton")).click();
//    }
//
//    @Given("the dashboard page is displayed")
//    public void the_dashboard_page_is_displayed() {
//        Assert.assertTrue(driver.findElement(By.id("dashboard")).isDisplayed(), "Dashboard page is not displayed");
//    }
//
//    @When("the investor clicks on the Additional Purchase module from the side menu")
//    public void the_investor_clicks_on_the_additional_purchase_module_from_the_side_menu() {
//        driver.findElement(By.id("additionalPurchaseMenuOption")).click();
//    }
//
//    @Then("the Additional Purchase page should be displayed on the screen")
//    public void the_additional_purchase_page_should_be_displayed() {
//        Assert.assertTrue(driver.findElement(By.id("additionalPurchasePage")).isDisplayed(), "Additional Purchase page is not displayed");
//    }
//
//    // Scenario: Investor selects single holder and buys a new strategy
//    @Given("the investor is on the Additional Purchase page")
//    public void the_investor_is_on_the_additional_purchase_page() {
//        Assert.assertTrue(driver.findElement(By.id("additionalPurchasePage")).isDisplayed(), "Additional Purchase page is not displayed");
//    }
//
//    @When("the investor selects {string} from the dropdown")
//    public void the_investor_selects_from_the_dropdown(String holderType) {
//        WebElement holderDropdown = driver.findElement(By.id("holderDropdown"));
//        holderDropdown.sendKeys(holderType);
//    }
//
//    @When("the investor clicks on the Buy a New Strategy button")
//    public void the_investor_clicks_on_the_buy_a_new_strategy_button() {
//        driver.findElement(By.id("buyNewStrategyButton")).click();
//    }
//
//    @Then("the L2 screen should be displayed")
//    public void the_l2_screen_should_be_displayed() {
//        Assert.assertTrue(driver.findElement(By.id("L2Screen")).isDisplayed(), "L2 screen is not displayed");
//    }
//
//    // Scenario: Investor selects a strategy and continues
//    @Given("the investor is on the L2 screen")
//    public void the_investor_is_on_the_l2_screen() {
//        Assert.assertTrue(driver.findElement(By.id("L2Screen")).isDisplayed(), "L2 screen is not displayed");
//    }
//
//    @When("the investor selects a strategy name from the dropdown")
//    public void the_investor_selects_a_strategy_name_from_the_dropdown() {
//		WebElement strategyDropdown = driver.findElement(By.id("strategyDropdown"));
//        strategyDropdown.sendKeys("Example Strategy"); // Replace with actual strategy name if necessary
//    }
//
//    @When("the investor clicks on the Continue button")
//    public void the_investor_clicks_on_the_continue_button() {
//        driver.findElement(By.id("continueButton")).click();
//    }
//
//    @Then("the next step in the purchase process should be initiated")
//    public void the_next_step_in_the_purchase_process_should_be_initiated() {
//        // Implement assertions based on what happens next in the application
//        Assert.assertTrue(driver.findElement(By.id("nextStepElement")).isDisplayed(), "Next step in the purchase process is not initiated");
//    }
//}
