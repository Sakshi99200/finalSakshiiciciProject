package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public LandingPage landingPage;
	public OffersPage offersPage;
	private WebDriver driver;
	public CheckoutPage checkoutPage;
	private LoginPage loginpage;
	private PMSRedemption_InvestorLogin pmsRedemption_InvestorLogin;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LandingPage getLandingPage() {

		landingPage = new LandingPage(driver);
		return landingPage;
	}

	public OffersPage OffersPage() {
		offersPage = new OffersPage(driver);
		return offersPage;
	}

	public CheckoutPage getCheckoutPage() {
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}

	public LoginPage getLoginPage() {
		return (loginpage == null) ? new LoginPage(driver) : loginpage;
//		loginpage = new LoginPage(driver);
//		return loginpage;
	}

	public PMSRedemption_InvestorLogin getPMSRedemption_InvestorLogin() {

//		pmsRedemption_InvestorLogin = new PMSRedemption_InvestorLogin(driver);
//		return pmsRedemption_InvestorLogin;

		return (pmsRedemption_InvestorLogin == null) ? new PMSRedemption_InvestorLogin(driver)
				: pmsRedemption_InvestorLogin;

	}

}
