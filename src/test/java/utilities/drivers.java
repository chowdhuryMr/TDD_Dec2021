package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class drivers {

	public WebDriver getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver chromeDriver = new ChromeDriver();
		return chromeDriver;
	}

	public WebDriver getFirefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver fireFoxDriver = new FirefoxDriver();
		return fireFoxDriver;
	}

}
