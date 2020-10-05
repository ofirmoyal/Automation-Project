package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(css = "#username_input")
	private WebElement emailField;
	@FindBy(css = "#Password")
	private WebElement passwordField;
	@FindBy(css = "#sign_in_button")
	private WebElement signInBtn;
	@FindBy(css = ".error-messages")
	private WebElement emailError;
	@FindBy(css = ".error-message li")
	private WebElement passwordError;
	@FindBy(css = "#login_form > section.form-group.validate-form > div:nth-child(1) > label.form-error.form-error-required")
	private WebElement noEmailError;
	@FindBy(css = "#login_form > section.form-group.validate-form > div:nth-child(2) > label.form-error.form-error-required")
	private WebElement noPasswordError;

	@FindBy(css = "[data-ga-event-label='Forgot Password']")
	private WebElement forgotPasswordBtn;
	@FindBy(css = "#login_form > section.form-row.link > a:nth-child(3)")
	private WebElement useTemporaryCodeBtn;
	@FindBy(css = ".read-more")
	private WebElement readMoreBtn;

	@FindBy(css = "body > header > section > div > a > svg")
	private WebElement homePageBtn;
	// --------------------------------------------------------------------------------------

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void signIn(String email, String password) {
		fillText(emailField, email);
		fillText(passwordField, password);
		click(signInBtn);
	}

	public void signInNew(String email, String password) {
		fillText(emailField, email);
		fillText(passwordField, password);
		click(signInBtn);
	}

	public void signInNoEmail(String email, String password) {
		fillText(emailField, email);
		fillText(passwordField, password);
		sleep(1000);
	}

	public void signInNoPassword(String email, String password) {
		fillText(emailField, email);
		fillText(passwordField, password);
		click(emailField);
		sleep(4000);
		click(passwordField);

	}

	public String getWrongEmailText() {
		return getText(emailError);
	}

	public String getWrongPasswordText() {
		return getText(passwordError);
	}

	public String getNoEmailText() {
		return getText(noEmailError);
	}

	public String getNoPasswordText() {
		return getText(noPasswordError);
	}

	public void clickOnForgotPassword() {
		click(forgotPasswordBtn);
	}

	public void clickOnUseTemporaryCode() {
		click(useTemporaryCodeBtn);
	}

	public void clickOnReadMoreLink() {
		click(readMoreBtn);
		sleep(1000);
	}

	public void goBackToHomePage() {
		click(homePageBtn);
	}

}
