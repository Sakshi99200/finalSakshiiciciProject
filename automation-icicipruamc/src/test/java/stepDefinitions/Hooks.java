package stepDefinitions;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	private TestContextSetup testContextSetup;

	public Hooks(TestContextSetup testContextSetup) {

		this.testContextSetup = testContextSetup;

		System.out.println("this.testContextSetup = testContextSetup;----------------");
	}

	@Before
	public void beforeScenario() throws IOException, AWTException, InterruptedException {
		if (testContextSetup.driver == null) {
			testContextSetup.testBase.WebDriverManager();
			System.out.println("beforeScenario----------------------------------------------");
		}
	}

	@After
	public void AfterScenario(Scenario scenario) throws IOException, AWTException, InterruptedException {

		if (scenario.isFailed()) {
			// screenshot
			File sourcePath = ((TakesScreenshot) testContextSetup.driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
			System.out.println("sccreenshot taken---------------");

		}

		if (testContextSetup.driver != null) {

//			testContextSetup.testBase.WebDriverManager().quit();
		}
	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException, AWTException, InterruptedException {
//		WebDriver driver = testContextSetup.driver;
//		if (scenario.isFailed()) {
//			// screenshot
//			File sourcePath = ((TakesScreenshot) testContextSetup.driver).getScreenshotAs(OutputType.FILE);
//			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
//			scenario.attach(fileContent, "image/png", "image");
//
//		}
//
//	}
	}
}
