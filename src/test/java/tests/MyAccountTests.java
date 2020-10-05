package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.Sleeper;
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
import pageobjects.MyAccountPage;
import pageobjects.searchResultsPage;
@Epic("Functionality")
@Feature("MyAccount actions")
public class MyAccountTests extends BaseTest {
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "go to account information screen")
	public void tc06_1goToAccountInformationSuccess() {
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		hp.clickMyAccountDropDown();
		hp.clicMyAccountBtn();
		MyAccountPage map = new MyAccountPage(driver);
		map.clickAccountInformationBtn();
		String expected = "Manage Personal Information";
		String actual = map.getMyAccountInformationText();
		assertEquals(actual, expected);

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "verify full name in account information screen")
	public void tc06_2verifyFullNameSuccess() {
		HomePage hp = new HomePage(driver);
		MyAccountPage map = new MyAccountPage(driver);
		map.clickAccountInformationBtn();
		String expected = "ofir moyal";
		String actual = map.getEditFullNameText();
		assertEquals(actual, expected);

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "cancel editing of full name in account information screen")
	public void tc06_3editNameCancelSuccess() {
		HomePage hp = new HomePage(driver);
		MyAccountPage map = new MyAccountPage(driver);
		map.clickEditNameAndCancel();
		String expected = "ofir moyal";
		String actual = map.getEditFullNameText();
		assertEquals(actual, expected);

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "verify email address in account information screen")
	public void tc06_4verifyEmailSuccess() {
		HomePage hp = new HomePage(driver);
		MyAccountPage map = new MyAccountPage(driver);
		String expected = "ofirmoyal@gmail.com";
		String actual = map.getEditEmailText();
		assertEquals(actual, expected);

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "verify mobile number in account information screen")
	public void tc06_5verifyMobileSuccess() {
		HomePage hp = new HomePage(driver);
		MyAccountPage map = new MyAccountPage(driver);
		String expected = "+972 50-909-2926";
		String actual = map.getEditMobileText();
		assertEquals(actual, expected);
	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "verify country in account information screen")
	public void tc06_6verifyCountrySuccess() {
		HomePage hp = new HomePage(driver);
		MyAccountPage map = new MyAccountPage(driver);
		String expected = "US - United States";
		String actual = map.getEditCountryext();
		assertEquals(actual, expected);
	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "verify language in account information screen")
	public void tc06_7verifyLanguageSuccess() {
		HomePage hp = new HomePage(driver);
		MyAccountPage map = new MyAccountPage(driver);
		String expected = "English";
		String actual = map.getEditLanguageext();
		assertEquals(actual, expected);
	}
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "verify cancel of editing the language field in account information screen")
	public void tc06_8editCancelSuccess() {
		HomePage hp = new HomePage(driver);
		MyAccountPage map = new MyAccountPage(driver);
		map.clickEditLanguageAndCancel();
		String expected = "English";
		String actual = map.getEditLanguageext();
		assertEquals(actual, expected);

	}

}
