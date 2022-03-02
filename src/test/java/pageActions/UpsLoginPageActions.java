package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageElements.UpsLoginPageElements;

public class UpsLoginPageActions {

	UpsLoginPageElements pageElements;

	public UpsLoginPageActions(WebDriver driver) {
		pageElements = new UpsLoginPageElements();
		PageFactory.initElements(driver, pageElements);
	}

	public void inputUserId(String userId) {
		System.out.println("Passing UserId");
		pageElements.userId.sendKeys(userId);
	}

	public void inputPassword(String password) {
		System.out.println("Passing Password");
		pageElements.password.sendKeys(password);
	}

	public void submit() {
		System.out.println("Clicking Submit Button");
		pageElements.submitBtn.click();
	}

	public String errorMessage() {
		String error = pageElements.errorMsg.getText();
		return error;
	}

}
