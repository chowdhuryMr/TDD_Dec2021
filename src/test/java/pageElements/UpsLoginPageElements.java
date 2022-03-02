package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsLoginPageElements {

	@FindBy(id = "email")
	public WebElement userId;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(xpath = "//*[@id='submitBtn']")
	public WebElement submitBtn;

	@FindBy(id = "errorMessages")
	public WebElement errorMsg;

}
