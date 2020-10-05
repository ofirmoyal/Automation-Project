package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UseTemporaryCodePage extends BasePage {

	@FindBy(css = "#send_verification_email>div:nth-child(1)>h2")
	private WebElement useTemporaryCodeText;

//-------------------------------------------------------------------------	

	public UseTemporaryCodePage(WebDriver driver) {
		super(driver);
	}

	public String getUseTemporaryCodeText() {
		return getText(useTemporaryCodeText);
	}

}
