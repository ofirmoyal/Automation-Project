package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListsPage extends BasePage {

	@FindBy(css = "#WishlistTitle")
	private WebElement listsPageText;
// ------------------------------------	

	public ListsPage(WebDriver driver) {
		super(driver);
	}

	public String getListsText() {
		return getText(listsPageText);

	}

}
