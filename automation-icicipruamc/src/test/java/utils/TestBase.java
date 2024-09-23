package utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	ChromeOptions option;
	EdgeOptions Eoption;

	public WebDriver WebDriverManager() throws IOException, AWTException, InterruptedException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		String browser_properties = prop.getProperty("browser");
		String browser_maven = System.getProperty("browser");
		// result = testCondition ? value1 : value2

		String browser = browser_maven != null ? browser_maven : browser_properties;

		if (driver == null) {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				option = new ChromeOptions();

				option.addArguments("disable-infobars");
				option.addArguments("--disable-notifications");
				option.addArguments("--disable-extensions");
//				option.addArguments("--headless");
//				option.setHeadless(false);
				option.addArguments("--disable-gpu");
				option.addArguments("--disable-dev-shm-usage");
				option.addArguments("--no-sandbox");
				option.addArguments("--remote-allow-origins=*");
				option.addArguments("--window-size=1920,1080");
				driver = new ChromeDriver(option);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				System.out.println("browser open successfully -----------------------");

			}
			if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				Eoption = new EdgeOptions();

				Eoption.addArguments("disable-infobars");
				Eoption.addArguments("--disable-notifications");
				Eoption.addArguments("--disable-extensions");
//				Eoption.addArguments("--headless");
//				option.setHeadless(false);
				Eoption.addArguments("--disable-gpu");
				Eoption.addArguments("--disable-dev-shm-usage");
				Eoption.addArguments("--no-sandbox");
				Eoption.addArguments("--remote-allow-origins=*");
				Eoption.addArguments("--window-size=1920,1080");
				driver = new EdgeDriver(Eoption);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			}
			driver.manage().window().maximize();

			driver.get(url);
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_CONTROL);

			robot.keyPress(KeyEvent.VK_MINUS);

			robot.keyRelease(KeyEvent.VK_CONTROL);

			robot.keyRelease(KeyEvent.VK_MINUS);

			Thread.sleep(2000);
		}
		return driver;

	}

}
