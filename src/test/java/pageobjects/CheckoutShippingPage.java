package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutShippingPage extends BasePage {
	@FindBy(css = ".title>h1")
	private WebElement CheckoutText;

	@FindBy(css = "#FirstName")
	private WebElement fullNameField;
	@FindBy(css = "#AddressLine1")
	private WebElement Address1Field;
	@FindBy(css = "#AddressLine2")
	private WebElement Address2Field;
	@FindBy(css = "#City")
	private WebElement cityField;
	@FindBy(css = "#RegionName")
	private WebElement regionField;
	@FindBy(css = "#PostalCode")
	private WebElement zipCodeField;
	@FindBy(css = "#TelNumber")
	private WebElement mobileNumberField;
	@FindBy(css = ".btn.btn-primary.btn-lg.btn-full.form-submit.load-next-page")
	private WebElement continueBtn;
	@FindBy(css = ".btn.btn-default.btn-lg.btn-full.cancel-button.form-cancel")
	private WebElement cancelBtn;

	@FindBy(css = ".btn.btn-primary.btn-full.btn-lg.form-submit.load-next-page")
	private WebElement nextBtn;

	@FindBy(css = "edit")
	private WebElement changeBtn;

	@FindBy(css = "#checkoutShippingAddress > div.checkout-main-section > div > div > div > section > article > label > span > span.select-option-radio.col-inline")
	private WebElement addANewAddressBtn;

	@FindBy(css = "#full-name")
	private WebElement invalidNameFieldFormText;

	@FindBy(css = "#dynamic-form\\ fs-mask > div:nth-child(2) > label.form-error.fs-unmask")
	private WebElement invalidAddressFieldFormText;

	@FindBy(css = "#city-section > div > label.form-error.fs-unmask")
	private WebElement invalidCityFieldFormText;

	@FindBy(css = "#region-postal-section > div:nth-child(1) > div > label.form-error.fs-unmask")
	private WebElement invalidStateRegionFieldFormText;

	@FindBy(css = ".postal-error.form-error.form-error-required.fs-unmask")
	private WebElement invalidZipCodeFieldFormText;

	@FindBy(css = "[data-default-label=\"Valid Phone Number is required.\"]")
	private WebElement invalidMobileNumberFormText;

	@FindBy(css = "#identificationCode")
	private WebElement idField;

	@FindBy(css = "#billing_address_list > div > article:nth-child(3) > label > span.select-option-col.col-xs-24.col-md-17.fs-mask > input")
	private WebElement defaultAddressELements;
	@FindBy(css = "#billing_address_list > div > article.select-option.fs-mask.selected > label > span.select-option-col.col-xs-24.col-md-17.fs-mask > span.col-inline.address-info > span.card-holder")
	private WebElement newAddressELements;

	@FindBy(css = "#progress-bar > form:nth-child(2) > input.stage-name")
	private WebElement backToPayment;

	// ---------------------------------------------------------------------------------------

	public CheckoutShippingPage(WebDriver driver) {
		super(driver);
	}

	public String getCheckoutText() {
		return getText(CheckoutText);
	}

	/*
	 * fill out forms
	 */
	public void fillAddressForm(String name, String address, String address2, String city, String region,
			String zipCode, String mobile) {
		fillText(fullNameField, name);
		fillText(Address1Field, address);
		fillText(Address2Field, address2);
		fillText(cityField, city);
		fillText(regionField, region);
		fillText(zipCodeField, zipCode);
		fillText(mobileNumberField, mobile);
		sleep(3000);
		click(continueBtn);

	}

	/*
	 * fill out forms with clearing fields
	 */
	public void fillAddressFormClearField(String name, String address, String address2, String city, String region,
			String zipCode, String mobile) {
		fillText(fullNameField, name);
		fillText(Address1Field, address);
		fillText(Address2Field, address2);
		fillText(cityField, city);
		fillText(regionField, region);
		fillText(zipCodeField, zipCode);
		fillText(mobileNumberField, mobile);
		fillText(Address1Field, "");
		sleep(3000);
		click(continueBtn);

	}

	// ----------------------------------------------
	public void clickNext() {
		click(nextBtn);
	}

	public void chooseDefaultAddress() {
		click(defaultAddressELements);
	}

	public void clickAddAnewAddress() {
		click(addANewAddressBtn);
	}

	public String getInvalidNameText() {
		return getText(invalidNameFieldFormText);
	}

	public String getInvalidAddressText() {
		return getText(invalidAddressFieldFormText);
	}

	public String getInvalidCityText() {
		return getText(invalidCityFieldFormText);
	}

	public String getInvalidStateRegionText() {
		return getText(invalidStateRegionFieldFormText);
	}

	public String getInvalidZipCodeText() {
		return getText(invalidZipCodeFieldFormText);
	}

	public String getInvalidMobileText() {
		return getText(invalidMobileNumberFormText);
	}

	public String getNewAddressText() {
		return getText(newAddressELements);
	}

	public void changeShipping() {
		click(changeBtn);
	}

	public void addId(String idNumber) {
		fillText(idField, idNumber);
		click(continueBtn);
		sleep(2000);
	}

	public void goBackToPayment() {
		click(backToPayment);
	}

	public void sleep() {
		sleep(2000);
	}
}
