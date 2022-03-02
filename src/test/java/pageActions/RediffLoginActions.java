package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageElements.RediffLoginElements;

public class RediffLoginActions {

	RediffLoginElements loginElements;
	
	public RediffLoginActions(WebDriver driver) {
		loginElements = new RediffLoginElements();
		PageFactory.initElements(driver, loginElements);
	}
	
	public void clickSubmitBtn() {
		loginElements.signIn.click();
	}
	
	
}
