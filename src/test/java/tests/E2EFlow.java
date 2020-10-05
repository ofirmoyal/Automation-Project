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
import utilities.AllureAttachment;
@Epic("Sanity E2E")
@Feature("Login,add an item and go to checkout page")
public class E2EFlow extends BaseTest {
	@Severity(SeverityLevel.BLOCKER)
	@Test(description = "perform a full E2E flow with adding an item and going to checkout")
	public void tc05_checkOutPaymentSuccess() {
		HomePage hp = new HomePage(driver);
		hp.searchAnItem("Protein shake");
		searchResultsPage srp = new searchResultsPage(driver);
		srp.pickAnItem();
		srp.closeCartFrame();
		srp.goToCart();
		CartPage cp = new CartPage(driver);
		cp.clickOnProceedToCheckout();
		CheckoutShippingPage cop = new CheckoutShippingPage(driver);
		String expected1 = "Order Summary";
		String actual1 = cop.getCheckoutText();
		assertEquals(actual1, expected1);

	}
}
