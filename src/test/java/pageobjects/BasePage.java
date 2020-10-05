package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract class BasePage {
	WebDriver driver;
	JavascriptExecutor js;
	Actions actions;
	WebDriverWait wait;

	BasePage(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor) driver;
		actions = new Actions(driver);
		// initiate wait
		wait = new WebDriverWait(driver, 15);
		// initiate factory
		PageFactory.initElements(driver, this);

	}

	/*
	 * method to clear field and send keys for login
	 */
	public void fillText(WebElement el, String text) {
		highlightElement(el, "green");
		el.clear();
		el.sendKeys(text);
	}

	public void click(WebElement el) {
		highlightElement(el, "green");
		el.click();
	}

	public String getText(WebElement el) {
		highlightElement(el, "orange");
		return el.getText();

	}

	void alertOk() {
		driver.switchTo().alert().accept();

	}

	// mouse options
	void moveTo(WebElement el) {
		highlightElement(el, "green");
		actions.moveToElement(el).perform();
	}

	void moveToAndClick(WebElement el) {
		highlightElement(el, "green");
		actions.moveToElement(el).click().perform();
	}

	public void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clear(WebElement el) {
		highlightElement(el, "green");
		clear(el);
	}
	private void highlightElement(WebElement element, String color) {
		String originalStyle = element.getAttribute("style");
		String newStyle = "background-color:yellow; border: 1px solid " + color + ";" + originalStyle;
		JavascriptExecutor js = (JavascriptExecutor) driver;

		/*
		 * change the style
		 */
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ newStyle + "');},0);", element);

		/*
		 * Change the style back after few miliseconds
		 */
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ originalStyle + "');},400);", element);

	}
}