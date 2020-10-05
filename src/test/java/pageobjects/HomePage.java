package pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class HomePage extends BasePage {
	@FindBy(css = ".value-module-desc")
	private WebElement alertMsg;

	@FindBy(css = ".icon.welcome-mat-module-close")
	private WebElement closeAlertMsg;

	@FindBy(css = ".language-select.hidden-xs.hidden-sm")
	private WebElement HeBtn;

	@FindBy(css = ".iherb-header-account.single-icon")
	private WebElement signInBtn;

	@FindBy(css = ".dropdown-text.text:nth-child(3)")
	private WebElement languageField;
	@FindBy(css = "body > header > div.language-menu.language-menu-universal > div > div > div > div.row > div:nth-child(2) > div > div.select-language.ui.fluid.search.selection.dropdown > div.menu.search-list.open > div:nth-child(1)")
	private WebElement languageOptionEn;

	@FindBy(css = ".save-selection.btn.btn-primary")
	private WebElement savePreferencesBtn;
	@FindBy(css = ".iherb-header-signed-out.icon-header_signed-out.sign-in.tablet-icon-login-link")
	private WebElement signInText;
	@FindBy(css = ".welcome-name")
	private WebElement signInVerifyText;

	@FindBy(css = "#txtSearch")
	private WebElement searchField;
	@FindBy(css = "#searchBtn")
	private WebElement searchBtn;

	@FindBy(css = ".sub-header-title.search")
	private WebElement searchResultsText;

	@FindBy(css = ".my-account>span")
	private WebElement myAccountDropDown;
	@FindBy(css = "#iherb-account > div > span > div.iherb-header-menu.iherb-header-menu-account.my-account-menu > ul.action-container > li.iherb-header-signed-in > a")
	private WebElement signOutBtn;
	@FindBy(css = "#universal-branded-header > div.iherb-header.iherb-header-layout.stackable-base > div.universal-header.iherb-universal > div > div.universal-header-end > a")
	private WebElement SupportBtn;

	@FindBy(css = "#iherb-account > div > span > div.iherb-header-menu.iherb-header-menu-account.my-account-menu > ul.my-account-links > li:nth-child(1) > a")
	private WebElement myAccountBtn;
	@FindBy(css = "[data-ga-event-label='myaccount-orders-click']")
	private WebElement ordersBtn;
	@FindBy(css = "[data-ga-event-label='myaccount-lists-click']")
	private WebElement listsBtn;
	@FindBy(css = "[data-ga-event-label='myaccount-myreviews-click']")
	private WebElement myReviewsBtn;
	@FindBy(css = "[data-ga-event-label='myaccount-communications-click']")
	private WebElement comunicationsBtn;
	@FindBy(css = "[data-ga-event-label='myaccount-myquestions-click']")
	private WebElement myQuestionsBtn;

	// -----------------------------------------------------------------------------------------------------
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public String getEnglishSignInText() {
		return getText(signInText);
	}

	public void signIn() {
		click(signInBtn);
	}

	public String getSearchResultsText() {
		return getText(searchResultsText);
	}

	public String getSignInVerifyText() {
		return getText(signInVerifyText);
	}

	/*
	 * Change the language from the default (englis...
	 */
	public void changeToEnglish() {
		click(HeBtn);
		click(languageField);
		click(languageOptionEn);
		sleep(1000);
		click(savePreferencesBtn);
		sleep(2000);
	}
	public void searchAnItem(String itemName) {
		fillText(searchField, itemName);
		click(searchBtn);
	}

	public void clickMyAccountDropDown() {
		click(myAccountDropDown);
	}

	public void clicSignOut() {
		click(signOutBtn);
	}

	public void clicSupportBtn() {
		click(SupportBtn);
	}

	public void clicMyAccountBtn() {
		click(myAccountBtn);
		sleep(4000);

	}

	public void clickOrdersBtn() {
		click(ordersBtn);
		sleep(6000);

	}

	public void clickListsBtn() {
		click(listsBtn);
		sleep(4000);

	}

	public void clickMyReviewsBtn() {
		click(myReviewsBtn);
		sleep(4000);
	}

	public void clickCommunicationsBtn() {
		click(comunicationsBtn);
		sleep(4000);

	}

	public void clickMyQuestionsBtn() {
		click(myQuestionsBtn);
		sleep(6000);

	}

	public void signOut() {
		click(signOutBtn);
	}

	/*
	 * change language from hebrew to english
	 */
	public void changeToEnglishAndClickSignin() {
		click(HeBtn);
		click(languageField);
		click(languageOptionEn);
		sleep(1000);
		click(savePreferencesBtn);
		sleep(2000);
		click(signInBtn);
	}

	public void clickSignInBtn() {
		click(signInBtn);
	}

	public void sleep() {
		sleep(4000);

	}
}
