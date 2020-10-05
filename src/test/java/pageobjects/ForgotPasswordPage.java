package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage {

	@FindBy(css = "#password_reset_form > div:nth-child(1) > h2")
	private WebElement forgotPasswordPageText;
// -------------------------------------------------------------------

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}

	public String getForgotPasswordPageText() {
		return getText(forgotPasswordPageText);
	}

}
