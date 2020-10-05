package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobjects.CartPage;
import pageobjects.CheckoutPaymentPage;
import pageobjects.CheckoutShippingPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.searchResultsPage;
@Epic("Functionality")
@Feature("Actions with cart")
public class CartTests extends BaseTest {
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "add an item to cart")
	public void tc04_1addToCartSuccess() {
		HomePage hp = new HomePage(driver);
		hp.searchAnItem("Protein shake");
		searchResultsPage srp = new searchResultsPage(driver);
		srp.pickAnItem();
		srp.closeCartFrame();
		srp.goToCart();
		CartPage cp = new CartPage(driver);
		String expected = "Sierra Fit Keto Shake, Vanilla Flavor, 1.27 lbs (578 g)";
		String actual = cp.getItemsNameInCart();
		assertEquals(actual, expected);
	}
	@Severity(SeverityLevel.BLOCKER)
	@Test(description = "move to checkout screen")
	public void tc04_2goToCheckoutSuccess() {
		CartPage cp = new CartPage(driver);
		cp.clickOnProceedToCheckout();
		CheckoutShippingPage cop = new CheckoutShippingPage(driver);
		String expected = "Order Summary";
		String actual = cop.getCheckoutText();
		assertEquals(actual, expected);
		CheckoutPaymentPage cpp = new CheckoutPaymentPage(driver);
		cpp.goBackToHomePage();

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "remove a single item from cart")
	public void tc04_3RemoveFromCartSuccess() {
		HomePage hp = new HomePage(driver);
		searchResultsPage srp = new searchResultsPage(driver);
		srp.goToCart();
		CartPage cp = new CartPage(driver);
		cp.clickRemoveBtn();
		String expected = "Removed:";
		String actual = cp.getItemRemovedFromCartText();
		assertEquals(actual, expected);
	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "cancel item removal from cart")
	public void tc04_4UndoRemoveFromCartSuccess() {
		CartPage cp = new CartPage(driver);
		cp.clickUndoBtn();
		String expected = "Product ID: SIE-01637";
		String actual = cp.getUndoRemoveFromCartText();
		assertEquals(actual, expected);
		CheckoutPaymentPage cpp = new CheckoutPaymentPage(driver);

	}
	@Severity(SeverityLevel.MINOR)
	@Test(description = "remove all items from cart")
	public void tc04_5RemoveAllItemFromCartYesSuccess() {
		HomePage hp1 = new HomePage(driver);
		hp1.searchAnItem("Protein shake");
		searchResultsPage srp = new searchResultsPage(driver);
		srp.pickAnItem();
		srp.closeCartFrame();
		srp.goToCart();
		CartPage cp = new CartPage(driver);
		cp.removeAllItemsFromCart();
		String expected = "Your Shopping Cart is Empty";
		String actual = cp.getItemSRemovedFromCartText();
		assertEquals(actual, expected);
		cp.goBackToHomePage();
	}

	/*
	 * pre-requisites empty cart before testing
	 */
	@Severity(SeverityLevel.MINOR)
	@Test(description = "calculate sum by destination")
	public void tc04_6DestinationCalculateSuccess() {
		HomePage hp1 = new HomePage(driver);
		hp1.searchAnItem("Protein shake");
		searchResultsPage srp = new searchResultsPage(driver);
		srp.pickAnItem();
		srp.closeCartFrame();
		srp.goToCart();
		CartPage cp = new CartPage(driver);
		cp.enterZipCodeAndCalculate();
		String expected = "Total Weight: 1.87 lbs ( 0.85 kg )";
		String actual = cp.getCalculatedText();
		assertEquals(actual, expected);
	}
	@Severity(SeverityLevel.MINOR)
	@Test(description = "click to open tool tip of shipping estimates")
	public void tc04_7ShippingEstimatesToolTipSuccess() {
		CartPage cp = new CartPage(driver);
		cp.clickShippingEstimatesToolTip();
		String expected = "Shipping charges are based on the total weight of your items and your order subtotal.";
		String actual = cp.getShippingEstimatesText();
		assertEquals(actual, expected);
		cp.clickShippingEstimatesToolTipXBtn();
	}
	@Severity(SeverityLevel.MINOR)
	@Test(description = "verify destination tool tip text")
	public void tc04_8DestinationToolTipSuccess() {
		CartPage cp = new CartPage(driver);
		cp.clickDestinationToolTip();
		String expected = "Due to the fluctuations of the exchange rate, orders with value very close to the tax-free limit may be assessed Duties and Taxes (D&T) as the currency exchange rate may vary from the order date to the customs clearance date.";
		String actual = cp.getDestinationText();
		assertEquals(actual, expected);
		cp.clickDestinationToolTipXBtn();
	}

}