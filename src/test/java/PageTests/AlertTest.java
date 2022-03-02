package PageTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageActions.RediffLoginActions;
import utilities.drivers;

public class AlertTest extends drivers {

	WebDriver driver;
	RediffLoginActions actions;

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		this.driver = getChromeDriver();
		this.actions = new RediffLoginActions(this.driver);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}

	@Test
	public void errorMsgTest() throws InterruptedException {
		actions.clickSubmitBtn();
		Alert a = driver.switchTo().alert();
		a.accept();

	}

}
