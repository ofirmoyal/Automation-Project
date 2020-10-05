package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommunicationsPage extends BasePage {
	@FindBy(css = "#reactRoot-preferences > div > div > div > div.sc-jwKygS.ZnXyF")
	private WebElement communicationsPageText;
//-------------------------------------------------------------

	public CommunicationsPage(WebDriver driver) {
		super(driver);
	}

	public String getcommunicationsPageText() {
		return getText(communicationsPageText);
	}

}
