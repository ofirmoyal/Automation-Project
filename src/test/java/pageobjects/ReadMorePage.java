package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReadMorePage extends BasePage {

	@FindBy(css = ".col-xs-24>h3")
	private WebElement ReadMorePageText;

// --------------------------------------------------------------	
	public ReadMorePage(WebDriver driver) {
		super(driver);
	}

	public String getReadMorePageText() {
		return getText(ReadMorePageText);
	}

}
