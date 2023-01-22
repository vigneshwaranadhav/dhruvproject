package frameworkTestNG;

import org.base.Baseclass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Sample extends Baseclass {
	@BeforeClass
	private void beforeClass() {
		System.out.println("BC");
		/*getDriver();
		enterAppUrl("http://adactinhotelapp.com/");
		maximizeWindow();
		implicitWait(30);*/
	}
	/*@AfterClass
	private void after() {
		closeWindow();
*/
	@Before
	private void before() {
    long startTime = System.currentTimeMillis();
    System.out.println(startTime);
	}
	@Test
	private void login() {
		/*WebElement findElementById = findElementById("username");
		findElementById.sendKeys("vigneshwaran123");
		WebElement findElementById2 = findElementById("password");
		findElementById2.sendKeys("01TO1S");
*/
	System.out.println("test");
		

	}

}
