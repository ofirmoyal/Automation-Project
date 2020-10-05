package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobjects.CommunicationsPage;
import pageobjects.HomePage;
import pageobjects.ListsPage;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;
import pageobjects.MyQuestionsPage;
import pageobjects.MyReviewsPage;
import pageobjects.OrderPage;
import pageobjects.SupportPage;
@Epic("Functionality")
@Feature("Home page actions")
public class HomePageTests extends BaseTest {

	@Test(description = "search for an item")
	public void tc02_1searchTestSuccess() {
		HomePage hp = new HomePage(driver);
		hp.searchAnItem("Protein shake");
		String actual2 = hp.getSearchResultsText();
		String expected2 = "Search Results for \"Protein shake\"";
		assertEquals(actual2, expected2);

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "go to my account screen")
	public void tc02_2goToMyAccountSuccess() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccountDropDown();
		hp.clicMyAccountBtn();
		MyAccountPage map = new MyAccountPage(driver);
		String actual = map.getmyAccountPageText();
		String expected = "Hey, ofirmoyal@gmail.com!";
		assertEquals(actual, expected);

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "in my account screen go to orders screen")
	public void tc02_3goToOrdersSuccess() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccountDropDown();
		hp.clickOrdersBtn();
		OrderPage op = new OrderPage(driver);
		String actual = op.getOrdersPageText();
		String expected = "Find Orders:\nLast 6 Months";
		assertEquals(actual, expected);

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "in my account screen go to lists screen")
	public void tc02_4goToListsSuccess() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccountDropDown();
		hp.clickListsBtn();
		ListsPage lip = new ListsPage(driver);
		String actual = lip.getListsText();
		String expected = "My List";
		assertEquals(actual, expected);

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "in my account screen go to my reviews screen")
	public void tc02_5goToMyReviewsSuccess() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccountDropDown();
		hp.clickMyReviewsBtn();
		MyReviewsPage mrp = new MyReviewsPage(driver);
		String actual = mrp.getMyReviewsPageText();
		String expected = "Help millions of others make smarter shopping decisions!";
		assertEquals(actual, expected);

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "in my account screen go to communications screen")
	public void tc02_6goToCommunicationsSuccess() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccountDropDown();
		hp.clickCommunicationsBtn();
		hp.sleep();
		CommunicationsPage cmp = new CommunicationsPage(driver);
		String actual = cmp.getcommunicationsPageText();
		String expected = "Communication Preferences";
		assertEquals(actual, expected);

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "in my account screen go to my questions screen")
	public void tc02_7goToMyQuestionsSuccess() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccountDropDown();
		hp.clickMyQuestionsBtn();
		MyQuestionsPage mqp = new MyQuestionsPage(driver);
		String actual = mqp.getmyQuestionsPageText();
		String expected = "Need more information on products? Ask other customers who have purchased those products and understand the experience. Visit a Product Detail Page to ask a question. Use this page to manage all your questions and activity.";
		assertEquals(actual, expected);

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "in my account screen go to support screen")
	public void tc02_8goToSupportSuccess() {
		HomePage hp = new HomePage(driver);
		hp.clicSupportBtn();
		SupportPage sp = new SupportPage(driver);
		String actual = sp.getSupportPageText();
		String expected = "Israel Lockdown & Boxit Delivery Important Notice";
		assertEquals(actual, expected);
	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "sign out of the account")
	public void tc02_81signOutSuccess() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccountDropDown();
		hp.clicSignOut();
		String actual = hp.getEnglishSignInText();
		String expected = "Sign In";
		assertEquals(actual, expected);

	}
}
