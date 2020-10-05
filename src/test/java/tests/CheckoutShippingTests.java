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
@Feature("Add a new address")
public class CheckoutShippingTests extends BaseTest {
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "add a new address and move on to checkout payment screen")
	public void tc04_1AddAnAddressAndgoToPaymentsSuccess() {
		HomePage hp1 = new HomePage(driver);
		hp1.searchAnItem("Protein shake");
		searchResultsPage srp = new searchResultsPage(driver);
		srp.pickAnItem();
		srp.closeCartFrame();
		srp.goToCart();
		CartPage cp = new CartPage(driver);
		cp.clickOnProceedToCheckout();
		CheckoutShippingPage cop = new CheckoutShippingPage(driver);
		String expected = "Order Summary";
		String actual = cop.getCheckoutText();
		assertEquals(actual, expected);
		CheckoutPaymentPage cpp = new CheckoutPaymentPage(driver);
		cpp.goBackToHomePage();

	}
}