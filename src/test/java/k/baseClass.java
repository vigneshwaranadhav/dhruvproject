package k;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class baseClass {
	

		static WebDriver driver;
		
		public static void getDriver() {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		//1.EnterUrl
		public static void enterApplyUrl(String url) {
			driver.get(url);
			}
		//2.maximize 
		public static void maximizeWindow() {
			driver.manage().window().maximize();
		}
		//3.insert the value
		public static void elementSendkeys(WebElement elements,String data) {
			elements.sendKeys(data);
		}
		public void elementSendkeysJs(WebElement element,String data) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("argument[0],setAttribute('value','data')",element);
		}
		//4.Click button
		public static void elementClick(WebElement element) {
			element.click();
			}
		//5.alert
		
		public void alert() {
//			Alert al=driver.switchTo().alert();
//			al.accept();
		}
		//6.alertCancel
		public void alertCancel() {
			
//			Alert al = driver.switchTo().alert();
//			al.dismiss();
		}
		
		//7.get the Webpage
		
		public String getText(WebElement element) {
			String text = element.getText();
			return text;
		}
		//8.get the inserted value from textbox
		public static String insertedValueTextBox(WebElement element,String value) {
	String textval = element.getAttribute(value);
		return textval;
		}
		
		//9.close all window
		public void closeWindow() {
		driver.quit();
		}
		//10.close current window
		public void currentWindow() {
			driver.close();
		}
		
		//11.get theTitle
		public String getTitle() {
			String title = driver.getTitle();
			return title;
		}
		//12.get the entered Url
		public String currentUrl() {
				String currentUrl = driver.getCurrentUrl();
				return currentUrl;
			}
		//13.select DropDown option by text
			public static void dropDown(WebElement element,String text) {
				Select s=new Select(element);
				s.selectByVisibleText(text);;
				
			}
			//14.select DropDown option by value
			public void dropDownValue(WebElement element,String value) {
				Select s=new Select(element);
				s.selectByValue(value);
				
			}	
			//15.select DropDown option byIndex
			public void dropDownValue(WebElement element,int index) {
						Select s=new Select(element);
						s.selectByIndex(index);
							}	
			//16.insert the value textbox by js
					public void textBoxJs( WebElement element) {
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].setAttribute('value','insertValue')",element);
					}
					//17.insert the value textbox by js
					public void clickJs( WebElement element) {
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].click()",element);
					}
			//19.switch to ChildWindow
					public void childWindow(String s) {
						driver.switchTo().window(s);
					}
				//20.Switch to frame by Index
					public void frameIndex(int index) {
						driver.switchTo().frame(index);
					}
		//21.switch to frameId
			public void frameId(String value) {
			driver.switchTo().frame(value);
					}
		//22.Find Locator by id
			public static WebElement elementById(String attributeValue) {
			WebElement element = driver.findElement(By.id(attributeValue));
			return element;
			
		
		}
		//23.Find Locator byName
			public WebElement elementByName(String attributeValue) {
			WebElement element = driver.findElement(By.name(attributeValue));
			return element;
		}
		//24.Find Locator byClassName 
		public WebElement findElementByClassName(String attributeValue) {
			WebElement element = driver.findElement(By.className(attributeValue));
			return element;
		}

		//25.Find the Locator Xpath
		public WebElement findElementXpath(String attributeValue) {
			WebElement element = driver.findElement(By.xpath("xpathExp"));
			return element;
		}
		
		
		//26.get all options from dropdown as text
		
		public String selectByText(WebElement element,String text) {
			Select s=new Select(element);
			

			s.selectByVisibleText(text);
			return text;}
		
		
		
		///27.Get All options dropdown as attributevalue
		public WebElement selectAllOptionsAttributeValue(WebElement element) {
//			Select select=new Select(element);
//			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			return element;
			}
		//28.Get the First Selected option text in dropdown
		public WebElement getFirstSelectedOption(WebElement element) {
	       Select select=new Select(element);
	       WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
		}
		//29.verify in dropdown is multiselected option
		public void multiSelectedOptions(WebElement element) {
			Select select=new Select(element);
			boolean multiple = select.isMultiple();
		}
		//30.ImplicitWait
		public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
			
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		//31.ExplicitWait for Vivibility of
		public void explicitWait(long seconds) {
			WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(seconds));
		}
		//32.FluentWait
		//private void fluentWait(long time ,Timeunit unit,int withTimeout) {
		//Wait w=new FluentWait(driver).withTimeout(100,TimeUnit.SECONDS).
		//}
		//33.Verify is Displayed
		public boolean isDisplayed(WebElement element) {
			boolean displayed = element.isDisplayed();
			return displayed;
		}
		//34.Verify is Enabled	
		public boolean isEnabled(WebElement element) {
			boolean enabled = element.isEnabled();
			return enabled;
			}
		//35.verify is Selected
		public boolean isSelected(WebElement element) {
			boolean selected = element.isSelected();
			return selected;
			}
		//36.Deselect by Index
		public void deselectByIndrx(WebElement element, int index) {
			Select s=new Select(element);
			s.deselectByIndex(index);
			}
		//37.DeselectByAttribute
		public void deselectByAttribute(WebElement element, String value) {
			Select s=new Select(element);
			s.deselectByValue(value);
			}
		//38.Deselect By Text
		public void deselectByText(WebElement element,String  text) {
			Select s=new Select(element);
			s.deselectByVisibleText(text);
			}
		//39.DeselectAll
		public void deselectAll(WebElement element) {
			Select s=new Select(element);
			s.deselectAll();
			}
		//40.Get the ParentWindow
		public String parWindoeGent() {
			String windowHandle = driver.getWindowHandle();
			return windowHandle;
			}
		//41.Get the all Windows
		public Set<String> allWindow(WebElement element) {
			Set<String> windowHandles = driver.getWindowHandles();
			return windowHandles;
			}
		//42.clear textbox
		public void clearTextBox(WebElement element) {
			element.clear();
			}
		//43. TakeScreenShot
//		public void TakesScreenshot(WebElement element) {
//			TakesScreenshot screenshot=(TakesScreenshot)driver;
			
		
		//}
		//45.Mouseover Action for SingleOption
		public WebElement singleOptionMouseover(WebElement element) {
			Actions actions=new Actions(driver);
			actions.moveToElement(element).perform();
			return element;
			}
		//45.1.Mouseover Action
		public void singleOptionMouseover(WebDriver driver, WebElement element) {
			Actions actions=new Actions(driver);
			actions.moveToElement(element).perform();
			
			}
		//46.Drag and Drop
		public void dragAndDrop(WebDriver driver, WebElement source,WebElement target) {
			Actions actions= new Actions(driver);
			actions.dragAndDrop(source, target).perform();
		}
		
		public static void writeCellData(String SheetName,int rownum,int cellnum,String dataV) throws Throwable {
			File file = new File("C:\\Users\\user\\eclipse-workspace\\Newunit\\excel\\TestMav for dupe.xlsx");
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(SheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(dataV);
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			workbook.write(fileOutputStream);
			
			

		}
		
		
		
		
		
		public  void updateCellData(String SheetName,int rownum,int cellnum,String oldData,String newData) throws IOException {
			
//			File file = new File ("C:\\\\Users\\\\karthik.ss\\\\eclipse-workspace\\\\KarthikMaven\\\\excel\\\\TestMav.xlsx");
//			FileInputStream fileInputStream = new FileInputStream(file);
//			Workbook workbook = new XSSFWorkbook(fileInputStream);
//			Sheet sheet = workbook.getSheet(SheetName);
//			
			
			//Update the cell data
			File file = new File("C:\\Users\\user\\eclipse-workspace\\Newunit\\excel\\TestMav for dupe.xlsx");
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(SheetName);
			Row row = sheet.getRow(rownum);
			 Cell cell = row.getCell(2);
			String value = cell.getStringCellValue();
			if (value.equals(oldData)) {
				cell.setCellValue(newData);
				
			}
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);
			

		}
		
		
		
		
		
		
		
//		@SuppressWarnings("rawtypes")
		public static String getDataFromCell(String SheetName,int rownum,int cellnum) throws IOException {
			String res = null;
			
			File file = new File("C:\\Users\\user\\eclipse-workspace\\Newunit\\excel\\TestMav for dupe.xlsx");
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(SheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			CellType type = cell.getCellType();
			
			CellType cellType = cell.getCellType();
			
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simpledateformat = new SimpleDateFormat("dd-mm-yyyy");
				res = simpledateformat.format(dateCellValue);
			}else {
				double d = cell.getNumericCellValue();
				
				long check = Math.round(d);
				if (check==d) {
					res = String.valueOf(check);
				}else {
					res = String.valueOf(d);
					
				}
				
			}
			break;
			default:
				break;
		}
		return res;
		
	 
		}

 private void america() {
System.out.println("america");
}
 
 private void london() {
System.out.println("london");
}
		
		
		
	}


