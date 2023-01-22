package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	// private static final Duration TimeOut = null;
		static WebDriver driver;

		// 1.Launch Browser
		public static void getDriver() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		// 2.Enter url
		public static void enterAppUrl(String url) {
			driver.get(url);

		}

		// 3.Maximize window
		public static void maximizeWindow() {
			driver.manage().window().maximize();

		}
		public void assertNotEqual(String actual, String Expected) {
			Assert.assertNotEquals(Expected, actual, "err msg ");
		}
		public void assertEqual(String actual, String Expected) {
			Assert.assertEquals(Expected, actual, "err msg ");
		}
		public void assertTrue(boolean bool) {
			Assert.assertTrue("err msg",bool);
		}
		
		//4.Assert
		
		/*public void getpass(boolean value) {
				boolean multiple = select.isMultiple();
				return multiple;

			*/

		
		
		

		// 4.click button
		public void click(WebElement element) {
			element.click();

		}

		// 5.Insert value in textbox using JS
		public void elementSendKeys(WebElement element, String data) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click(, arg1)", element);

		}

		// 6.Click button by using JS
		public void elementClickJs(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click", element);

		}

		// 7.Click ok in alert
		public Alert alertAccept() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			return alert;

		}

		// 8.Click cancel in alert
		public Alert alertCancel() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			return alert;

		}

		// 9.Get the text from web page
		public String elementGetText(WebElement element) {
			String text = element.getText();
			return text;

		}

		// 10.Get the inserted value from the textbox using value
		public String elementGetAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;

		}

		// 11.using other values
		public String elementGetAttribute(WebElement element, String attributeName) {
			String attribute = element.getAttribute(attributeName);
			return attribute;
		}

		// 12.Close all window
		public void quitWindow() {
			driver.quit();

		}

		// 13.Close current window
		public void closeWindow() {
			driver.close();

		}

		// 14.Get title
		public String getAppTitle() {
			String title = driver.getTitle();
			return title;

		}

		// 15.Get the entered url
		public String getCurrenturl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;

		}

		// 16.Select dropdown option by text
		public void selectOptionBytext(WebElement element, String text) {
			Select select = new Select(element);
			select.selectByVisibleText(text);

		}

		// 17.Select dropdown option by attribute
		public void selectOptionByAttributeValue(WebElement element, String text) {
			Select select = new Select(element);
			select.selectByValue(text);

		}

		// 18.Select dropdown option by Index
		public void selectOptionByIndex(WebElement element, int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}

		// 19.Switch to child window
		public void switchToChildWindow(String id) {
			driver.switchTo().window(id);

		}

		public void switchToChildWindow1(String title) {
			driver.switchTo().window(title);

		}

		public void switchToChildWindow2(String url) {
			driver.switchTo().window(url);

		}

		// 20.Switch to frame by index
		public void switchFramebyIndex(int index) {
			driver.switchTo().frame(index);

		}

		// 21.Switch to frame by id
		public void switchFramebyId(String id) {
			driver.switchTo().frame(id);

		}

		// 22.Find the locator by id
		public WebElement findElementById(String attributevalue) {
			WebElement element = driver.findElement(By.name(attributevalue));
			return element;

		}

		// 23.Find the locator by Name
		public WebElement findElementByName(String attributevalue) {
			WebElement element = driver.findElement(By.name(attributevalue));
			return element;
		}

		// 24.Find the locator by ClassName
		public WebElement findElementByClassName(String attributevalue) {
			WebElement element = driver.findElement(By.className(attributevalue));
			return element;

		}

		// 25.Find locator by xpath
		public WebElement findElementByXpath(String xpathExpression) {
			WebElement element = driver.findElement(By.xpath(xpathExpression));
			return element;

		}

		// 26.Get the firstSelected option test in dropdown
		public WebElement firstSelectedOtionsDropDown(WebElement element) {
			Select select = new Select(element);
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			return firstSelectedOption;
		}

		// 27.Verify in dropdown is multiselected option
		public boolean isMultiSelected(WebElement element) {
			Select select = new Select(element);
			boolean multiple = select.isMultiple();
			return multiple;

		}

		// 28.Get the parent window
		public String getParentWindow() {
			String windowHandle = driver.getWindowHandle();
			return windowHandle;

		}

		// 29.Get all window
		public Set<String> getAllWindow() {
			Set<String> windowHandles = driver.getWindowHandles();
			return windowHandles;

		}

		// 30.refresh page
		public void refreshPage() {
			driver.navigate().refresh();

		}

		// 31.drag and drop
		public void dragAndDrop(WebElement src, WebElement tar) {
			Actions actions = new Actions(driver);
			actions.contextClick().perform();

		}

		// 32.double click
		public void doubleClick(WebElement element) {
			Actions actions = new Actions(driver);
			actions.doubleClick(element).perform();

		}

		// 33.Right click
		public void right(WebElement element) {
			Actions actions = new Actions(driver);
			actions.contextClick().perform();

		}

		// 34.MouseOverAction
		public void mouseOverAction(WebElement tar) {
			Actions actions = new Actions(driver);
			actions.moveToElement(tar).perform();
		}

		// 35.To insert the value in textbox
		public void elementSendKeys1(WebElement element, String value) {
			element.sendKeys(value);

		}

		// 36.Get all options from dropdown as text
		public List<WebElement> dropDownTextAllOptions(WebElement element) {
			Select select = new Select(element);
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			return allSelectedOptions;

		}
		// 37.Get all options from dropdown as attribute value

		// 38.Implicit wait
		public void implicitWait(int index) {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		}/*
			 * //39.//Explicit wait for visibilityOf public void explicitWait(WebElement
			 * element) { WebDriverWait wait = new WebDriverWait(driver,TimeOut);
			 * wait.until(ExpectedConditions.visibilityOf(element));
			 */

		// 40.Fluent wait
		/*
		 * public void FluentWait() { Wait w = new
		 * FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery
		 * (Duration.ofSeconds(TimeOut)).ignoring(NoSuchElementException.class);
		 */
		// }
		// 41.Verify is displayed
		public boolean verifyIsDisplayed(WebElement element) {
			boolean displayed = element.isDisplayed();
			return displayed;

		}

		// 42.Verify is enabled
		public boolean verifyIsEnabled(WebElement element) {
			boolean selected = element.isSelected();
			return selected;

		}

		// 43.Verify is selected
		public boolean verifyIsSelected1(WebElement element) {
			boolean selected = element.isSelected();
			return selected;

		}

		// 44.Deselect by index
		public void deSelectByIndex(WebElement element, int index) {
			Select s = new Select(element);
			s.deselectByIndex(index);

		}

		// 45.Deselect by attribute
		public void deSelectByAttribute(WebElement element, String value) {
			Select s = new Select(element);
			s.deselectByValue(value);

		}

		// 46.Deselect by text
		public void deSelectByText(WebElement element, String text) {
			Select s = new Select(element);
			s.deselectByVisibleText(text);
		}

		// 47.Deselect all
		public void deSelectAll(WebElement element) {
			Select s = new Select(element);
			s.deselectAll();

		}

		// 48.Clear textbox
		public void clearTextBox(WebElement element) {
			element.clear();

		}

		// 49.Takes Screenshot
		public File takesScreenShot() {
			TakesScreenshot tk = (TakesScreenshot) driver;
			File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
			return screenshotAs;

		}

		// 50.Insert value in textbox and enter
		public void insertValueAndEnter(WebElement element, String value) {
			element.sendKeys(value, Keys.ENTER);

		}

		// 51.Click by action
		public void elementClick(WebElement element) {
			Actions action = new Actions(driver);
			action.click().perform();

		}

		// 52.Find locator by tagname
		public WebElement locatorByTagName(WebElement element, String value) {
			WebElement findElement = driver.findElement(By.tagName(value));
			return findElement;

		}

		// 53.ThreadSleep
		public void threadSleep(int index) throws InterruptedException {
			Thread.sleep(index);

		}

		// 54.Navigate to forward
		public void navigateForward() {
			driver.navigate().forward();

		}

		// 55.Navigate to backward
		public void navigateBackward() {
			driver.navigate().back();

		}

		// 56.Navigate url
		private void navigateUrl(String url) {
			driver.navigate().to(url);

		}

		// 57.Switch to frame by webelement
		private void switchToFrameByWebElement(WebElement element) {
			driver.switchTo().frame(element);

		}

		// 58.Find the size of list
		private int liseSize(WebElement element) {
			List li = new ArrayList();
			int size = li.size();
			return size;

		}

		// 59.To pass the values and click OK in alert
		private void sendKeysOkInAlert(String name) {
			driver.switchTo().alert().sendKeys(name);
			driver.switchTo().alert().accept();
		}

		// 60.To pass the values and click cancel in alert
		private void sendKeysCancelInAlert(String name) {
			driver.switchTo().alert().sendKeys(name);
			driver.switchTo().alert().dismiss();
		}

		// 61.To pass the values and get text
		private void toGetText(String name) {
			driver.switchTo().alert().sendKeys(name);
			driver.switchTo().alert().getText();
		}

		// 62.Send keys by action
		private void elementActionsSendKeys(WebElement element, String name) {
			Actions action = new Actions(driver);
			action.sendKeys(name);

		}
	}



