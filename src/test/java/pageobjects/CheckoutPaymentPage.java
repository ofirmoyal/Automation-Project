package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPaymentPage extends BasePage {

	@FindBy(css = "#newCCForm:nth-child(2)")
	private WebElement form;

	@FindBy(css = ".btn.btn-primary.btn-lg.btn-full.float-submit.load-next-page")
	private WebElement continueBtn;
	@FindBy(css = "#progress-bar > form:nth-child(1)")
	private WebElement shippingBtn;

	@FindBy(css = ".icon.icon-iherblogo")
	private WebElement homePageBtn;

	@FindBy(css = ".checkout-title-wrapper>p:nth-child(2)")
	private WebElement paymentPageText;
// --------------------------------------------------------------------------

	public CheckoutPaymentPage(WebDriver driver) {
		super(driver);

	}

	public void clickContinue() {
		click(continueBtn);
	}

	public void goBackFromIframe() {
		driver.switchTo().defaultContent();
	}

	public void goToForm() {
		moveTo(form);
		sleep(2000);
	}

	public void goBackToShipping() {
		click(shippingBtn);
	}

	public void goBackToHomePage() {
		click(homePageBtn);
		sleep(1000);
	}

	public String getPaymentPageText() {
		return getText(paymentPageText);
	}

}
