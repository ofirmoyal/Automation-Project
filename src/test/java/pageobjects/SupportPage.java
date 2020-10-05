package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupportPage extends BasePage {

	@FindBy(css = "#__next > div > div > div.css-k008qs > div.css-1rr4qq7 > div.css-lbyafe > div > div")
	private WebElement SupportPageText;

// ------------------------------------------------------------------------	

	public SupportPage(WebDriver driver) {
		super(driver);
	}

	public String getSupportPageText() {
		return getText(SupportPageText);
	}

}
