package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyReviewsPage extends BasePage {

	@FindBy(css = "#ugc-root > div > div > p")
	private WebElement myReviewPageText;
// --------------------------------------------------------------------

	public MyReviewsPage(WebDriver driver) {
		super(driver);
	}

	public String getMyReviewsPageText() {
		return getText(myReviewPageText);
	}

}
