package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	@FindBy(css = "#div_fullname")
	private WebElement myAccountPageText;

	@FindBy(css = ".accountsettings")
	private WebElement accountInformationBtn;

	@FindBy(css = ".form-group.row.info-header >h3")
	private WebElement accountInformationText;

// verify the fields
	@FindBy(css = ".col-xs-12.info-name>p")
	private WebElement editFullNameText;

	@FindBy(css = "[data-edit-field='name']")
	private WebElement editNameBtn;

	@FindBy(css = ".btn.btn-block.btn-lg.btn-secondary.js-edit-cancel")
	private WebElement editNameCancelBtn;

	@FindBy(css = ".col-xs-12.info-email>p")
	private WebElement editEmailText;

	@FindBy(css = ".col-xs-12.info-phone>p")
	private WebElement editMobileNumberText;

	@FindBy(css = ".form-control.reset-input[value='*********']")
	private WebElement editPasswordText;

	@FindBy(css = ".col-xs-12.info-country>p")
	private WebElement editCountryText;

	@FindBy(css = ".col-xs-12.info-language>p")
	private WebElement editLanguageText;

	@FindBy(css = "[data-edit-field='language']")
	private WebElement editLanguageBtn;

	@FindBy(css = ".btn.btn-block.btn-lg.btn-secondary.js-edit-cancel")
	private WebElement editLanguageCancelBtn;

// ---------------------------------------------
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public String getmyAccountPageText() {
		return getText(myAccountPageText);
	}

	public void clickAccountInformationBtn() {
		click(accountInformationBtn);
	}

	public String getMyAccountInformationText() {
		sleep(750);
		return getText(accountInformationText);
	}

	public String getEditFullNameText() {
		sleep(750);
		return getText(editFullNameText);
	}

	public String getEditEmailText() {
		sleep(750);
		return getText(editEmailText);
	}

	public String getEditMobileText() {
		sleep(750);
		return getText(editMobileNumberText);
	}

	public String getEditPasswordext() {
		sleep(750);
		return getText(editPasswordText);
	}

	public String getEditCountryext() {
		sleep(750);
		return getText(editCountryText);
	}

	public String getEditLanguageext() {
		sleep(750);
		return getText(editLanguageText);
	}

	public void clickEditLanguageAndCancel() {
		click(editLanguageBtn);
		click(editLanguageCancelBtn);
	}

	public void clickEditNameAndCancel() {
		click(editNameBtn);
		click(editNameCancelBtn);
	}

}