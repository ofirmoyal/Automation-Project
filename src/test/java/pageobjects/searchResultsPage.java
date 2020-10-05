package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchResultsPage extends BasePage {

	@FindBy(css = "#pid_96323 > div.product-inner.product-inner-wide > div.absolute-link-wrapper > div.product-image-wrapper > div > button > bdi")
	private WebElement item;

	@FindBy(css = "#pid_7307 > div.product-inner.product-inner-wide > div.absolute-link-wrapper > div.product-image-wrapper > div > button > bdi")
	private WebElement anotherItem;

	@FindBy(css = ".icon-exit.close")
	private WebElement cartFrameExitBtn;

	@FindBy(css = ".icon.icon-header-cart")
	private WebElement cartBtn;

// ------------------------------------------------------------	

	public searchResultsPage(WebDriver driver) {
		super(driver);
	}

	public void pickAnItem() {
		click(item);
		sleep(2000);
	}

	public void pickAnotherItem() {
		click(anotherItem);
		sleep(2000);
	}

	public void goToCart() {
		click(cartBtn);
	}

	public void closeCartFrame() {
		click(cartFrameExitBtn);
		sleep(1500);
	}

}
