package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobjects.CartPage;
import pageobjects.HomePage;
//import pageobjects.ItemPage;
import pageobjects.LoginPage;
import pageobjects.searchResultsPage;
@Epic("Functionality")
@Feature("Search results")
public class searchResultsTests extends BaseTest {
	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "add an item and go to cart screen")
	public void tc03_goToCartSuccess() {
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
}
