package PageTests;

import static org.testng.Assert.fail;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageActions.UpsLoginPageActions;
import utilities.drivers;

public class UpsLoginPageTests extends drivers {

	WebDriver driver;
	UpsLoginPageActions actions;

	@BeforeTest(alwaysRun = true)
	@Parameters({ "browser" })
	public void beforeTest(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			this.driver = getChromeDriver();
			this.actions = new UpsLoginPageActions(this.driver);
			driver.get("https://www.ups.com/lasso/login?");
			driver.manage().window().maximize();
			// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("firefox")) {
			this.driver = getFirefoxDriver();
			this.actions = new UpsLoginPageActions(this.driver);
			driver.get("https://www.ups.com/lasso/login?");
			driver.manage().window().maximize();
			// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		}
	}

	@Test(groups = { "SanityTest" }, priority = 3)
	public void errorMsgTest() throws InterruptedException {
		actions.inputUserId("hello");
		actions.inputPassword("world");
		actions.submit();
		Thread.sleep(4000);
		String errorMsg = actions.errorMessage();

		if (errorMsg.contains("unsuccessful") || errorMsg.contains("Something") || errorMsg.contains("added")) {
			System.out.println("PASSED");
		} else {
			fail();
		}
	}

	@Test(groups = { "SanityTest" }, priority = 2)
	public void funTest1() {
		System.out.println("funTest 1 executed");
	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		driver.quit();
	}

}
