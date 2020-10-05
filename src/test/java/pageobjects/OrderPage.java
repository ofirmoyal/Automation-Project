package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage {

	@FindBy(css = "#orderHistoryFilter > div.form-group")
	private WebElement orderPageText;

//  -----------------------------------------------------------
	public OrderPage(WebDriver driver) {
		super(driver);
	}

	public String getOrdersPageText() {
		return getText(orderPageText);
	}

}