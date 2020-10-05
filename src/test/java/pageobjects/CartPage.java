package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

	@FindBy(css = ".ltr-1t0rg9b")
	private WebElement itemNameInCart;
	@FindBy(css = ".ltr-xt7vrb")
	private WebElement proceedToCheckoutBtn;

	@FindBy(css = ".ltr-d63gxv")
	private WebElement removeItemFromCartBtn;

	@FindBy(css = ".ltr-1hgheub")
	private WebElement getRemovedItemFromCartText;

	@FindBy(css = ".ltr-1qcmugq")
	private WebElement removeAllItemsFromCartBtn;

	@FindBy(css = "[data-qa-element='btn-remove-all-yes']")
	private WebElement RemovedItemSFromCartAlertYes;

	@FindBy(css = "[data-ga-element='btnRemoveAllNo']")
	private WebElement RemovedItemSFromCartAlertNo;

	@FindBy(css = "#cartv2 > div > div.ltr-gn2aso > main > div.ltr-goky7h > div.ltr-1y7uifq > div:nth-child(2) > div")
	private WebElement getRemovedItemSFromCartText;

	@FindBy(css = "[data-ga-element='btnItemUndo']")
	private WebElement undoBtn;
	@FindBy(css = ".ltr-m83xv2")
	private WebElement undoRemoveFromCartText;

	@FindBy(css = "[data-qa-element='input-shipping-calculation']")
	private WebElement zipCodeField;
	@FindBy(css = "[data-ga-event-label='Calculate']")
	private WebElement calculateBtn;
	@FindBy(css = ".ltr-g83ynl")
	private WebElement calculatedText;

	@FindBy(css = "#shipping > div.ltr-14h64oq > svg > path")
	private WebElement shippingEstimatesToolTipBtn;
	@FindBy(css = ".ltr-3cnvtn")
	private WebElement shippingEstimatesToolTipText;
	// Shipping charges are based on the total weight of your items and your order
	// subtotal.
	@FindBy(css = "#cartv2 > div > div.ltr-vurnku > div > div.ltr-1ia869b > div.ltr-15d5yey > svg")
	private WebElement shippingEstimatesToolTipXBtn;

	@FindBy(css = "#shipping > div.ltr-1r4osd1 > div.ltr-1e7k7tl > svg")
	private WebElement destinationToolTipBtn;
	@FindBy(css = "#cartv2 > div > div.ltr-vurnku > div > div.ltr-1ia869b > div.ltr-3cnvtn > div:nth-child(1) > p:nth-child(2)")
	private WebElement destinationToolTipText;
	// Due to the fluctuations of the exchange rate, orders with value very close to
	// the tax-free limit may be assessed Duties and Taxes (D&T) as the currency
	// exchange rate may vary from the order date to the customs clearance date.
	@FindBy(css = "#cartv2 > div > div.ltr-vurnku > div > div.ltr-1ia869b > div.ltr-15d5yey > svg")
	private WebElement destinationToolTipXBtn;

	@FindBy(css = ".icon icon-iherblogo")
	private WebElement homePageBtn;

	// -----------------------------------------------------------------------------

	public CartPage(WebDriver driver) {
		super(driver);

	}

	public String getItemsNameInCart() {
		return getText(itemNameInCart);
	}

	public void clickOnProceedToCheckout() {
		click(proceedToCheckoutBtn);

	}

	public void clickRemoveBtn() {
		click(removeItemFromCartBtn);
		sleep(4000);
	}

	public String getItemRemovedFromCartText() {
		return getText(getRemovedItemFromCartText);
	}

	public void clickUndoBtn() {
		click(undoBtn);
		sleep(1000);
	}

	public String getUndoRemoveFromCartText() {
		return getText(undoRemoveFromCartText);
	}

	public void clickRemoveAllItems() {
		click(removeAllItemsFromCartBtn);
	}

	public String getItemSRemovedFromCartText() {
		return getText(getRemovedItemSFromCartText);
	}

	public void removeAllItemsFromCart() {
		click(removeAllItemsFromCartBtn);
		click(RemovedItemSFromCartAlertYes);
	}

	public void removeAllItemsFromCartNo() {
		click(removeAllItemsFromCartBtn);
		click(RemovedItemSFromCartAlertNo);
	}

	public void enterZipCodeAndCalculate() {
		fillText(zipCodeField, "7680400");
		click(calculateBtn);
		sleep(700);

	}

	public String getCalculatedText() {
		return getText(calculatedText);
	}

	public void clickShippingEstimatesToolTip() {
		click(shippingEstimatesToolTipBtn);

	}

	public String getShippingEstimatesText() {
		return getText(shippingEstimatesToolTipText);
	}

	public void clickShippingEstimatesToolTipXBtn() {
		click(shippingEstimatesToolTipXBtn);

	}

	public void clickDestinationToolTip() {
		click(destinationToolTipBtn);

	}

	public String getDestinationText() {
		return getText(destinationToolTipText);
	}

	public void clickDestinationToolTipXBtn() {
		click(destinationToolTipXBtn);

	}

	public void goBackToHomePage() {
		click(homePageBtn);
		sleep(1000);
	}

}
