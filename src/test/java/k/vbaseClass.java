package k;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vbaseClass {
	
	static WebDriver driver;
	
	public static  void driverlaunch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

	}
	public static void enterurl(String url) {
		driver.get(url);

	}
	public WebElement findelementbyid(String aributevalue) {
		WebElement element = driver.findElement(By.name(aributevalue));
		return element;

	}
	
	  public WebElement  findelementbyXpath(String attributevalue) {
		  WebElement findElement = driver.findElement(By.xpath(attributevalue));
		return findElement;
		  

	}
	//get text from webpage
	  
	  public String gettext(WebElement element) {
		  String text = element.getText();
		return text;

	}
	  
	  public void selectbytext(WebElement element,String text) {
		  Select select = new Select(element);
		  select.selectByVisibleText(text);
		
		
		  

	}
	  

	}
	


