package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyQuestionsPage extends BasePage {

	@FindBy(css = "#ugc-root > div > div > div:nth-child(3) > div.css-asxa0l > div:nth-child(2) > p.css-9txm19")
	private WebElement myQuestionsPageText;

// --------------------------------------------------------------
	public MyQuestionsPage(WebDriver driver) {
		super(driver);
	}

	public String getmyQuestionsPageText() {
		return getText(myQuestionsPageText);
	}

}
