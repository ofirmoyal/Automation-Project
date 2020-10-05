package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageobjects.ForgotPasswordPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.ReadMorePage;
import pageobjects.UseTemporaryCodePage;
import utilities.AllureAttachment;
@Epic("Security")
@Feature("Login tests")
public class LoginTests extends BaseTest {

	@Override
	public void setUpLogin() {
	}
	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "try to log in with a wrong email address")
	public void tc02_1LoginWrongEmailFailed() {
		// add log from utilities -> AllureAttachments
		AllureAttachment.attachText("some log");
		HomePage hp = new HomePage(driver);
		hp.changeToEnglish();
		hp.signIn();
		LoginPage lp = new LoginPage(driver);
		lp.signIn("ofirmoyal@gmail.co", "Enigma14!");
		String actual = lp.getWrongEmailText();
		String expected = "We can't find an account associated with the credentials you've entered. Try again or reset your password";
		assertEquals(actual, expected);
		lp.goBackToHomePage();
	}
	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "try to log in with a wrong password")
	public void tc02_2LoginWrongPasswordFailed() {
		AllureAttachment.attachText("some log 2");
		HomePage hp = new HomePage(driver);
		hp.signIn();
		LoginPage lp = new LoginPage(driver);
		lp.signIn("ofirmoyal@gmail.com", "Enigma!");
		String actual = lp.getWrongEmailText();
		String expected = "We can't find an account associated with the credentials you've entered. Try again or reset your password";
		assertEquals(actual, expected);
		lp.goBackToHomePage();
	}
	
	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "try to log in without adding any email address")
	public void tc02_3LoginNoEmail() {
		HomePage hp = new HomePage(driver);
		hp.signIn();
		LoginPage lp = new LoginPage(driver);
		lp.signInNoEmail("", "Enigma14!");
		String actual = lp.getNoEmailText();
		String expected = "Mobile Number or Email required";
		assertEquals(actual, expected);
		lp.goBackToHomePage();

	}
	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "try to log in without adding any password")
	public void tc02_4LoginNoPasswordFailed() {
		HomePage hp = new HomePage(driver);
		hp.signIn();
//		hp.changeToEnglishAndClickSignin();
		LoginPage lp = new LoginPage(driver);
		lp.signIn("ofirmoyal@gmail.com", "");
		String expected = "Password is required.";
		String actual = lp.getNoPasswordText();
		assertEquals(actual, expected);
		lp.goBackToHomePage();

	}
	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "go to forgot password ")
	public void tc02_5ForgotPasswordLinkFailed() {
		HomePage hp = new HomePage(driver);
		hp.signIn();
		LoginPage lp = new LoginPage(driver);
		ForgotPasswordPage fpp = new ForgotPasswordPage(driver);
		lp.clickOnForgotPassword();
		String expected = "Reset Password";
		String actual = fpp.getForgotPasswordPageText();
		assertEquals(actual, expected);
		lp.goBackToHomePage();

	}
	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "go to temporary code screen")
	public void tc02_6UseTemporaryCodeLinkSuccess() {
		HomePage hp = new HomePage(driver);
		hp.signIn();
		LoginPage lp = new LoginPage(driver);
		UseTemporaryCodePage utcp = new UseTemporaryCodePage(driver);
		lp.clickOnUseTemporaryCode();
		String expected = "Sign in with Temporary Code";
		String actual = utcp.getUseTemporaryCodeText();
		assertEquals(actual, expected);
		lp.goBackToHomePage();

	}
	@Severity(SeverityLevel.MINOR)
	@Test(description = "open read more screen")
	public void tc02_7ReadMoreLinkSuccess() {
		HomePage hp = new HomePage(driver);
		hp.signIn();
		LoginPage lp = new LoginPage(driver);
		lp.clickOnReadMoreLink();
		ReadMorePage rmp = new ReadMorePage(driver);
		String expected = "Not Healthcare Advice";
		String actual = rmp.getReadMorePageText();
		assertEquals(actual, expected);

	}
	@Severity(SeverityLevel.BLOCKER)
	@Test(description = "check that login success with valid email + password")
	public void tc02_8LoginSuccess() {
		HomePage hp = new HomePage(driver);
		hp.signIn();
		LoginPage lp = new LoginPage(driver);
		lp.signIn("ofirmoyal@gmail.com", "Enigma14!");
		String actual1 = hp.getSignInVerifyText();
		String expected1 = "ofir";
		assertEquals(actual1, expected1);

	}

}