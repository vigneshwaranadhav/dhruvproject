
package org.executable;

import org.base.Baseclass;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import k.baseClass;

public class AdactineHotel  {

	static AdactineHotel base = new AdactineHotel();

	@BeforeClass
	public static void beforeclass() throws InterruptedException {

		base.getDriver();
		base.maximizeWindow();
		base.enterAppUrl("https://adactinhotelapp.com/");
		Thread.sleep(3000);

	}

	
	private void enterAppUrl(String string) {
		// TODO Auto-generated method stub
		
	}


	private void maximizeWindow() {
		// TODO Auto-generated method stub
		
	}


	private void getDriver() {
		// TODO Auto-generated method stub
		
	}


	@Test
	public void tc1() {

		WebElement findElementByXpath = base.findElementByXpath("//*[@id='username']");
		findElementByXpath.sendKeys("Kaviraja");
		base.findElementByXpath("//*[@id='password']").sendKeys("Kaviraj@143");
		base.findElementByXpath("//*[@id='login']").click();
	} 

	private WebElement findElementByXpath(String string) {
		// TODO Auto-generated method stub
		return null;
	}


	@Test
	public void tc2() throws InterruptedException {
		/* * WebElement user = base.findElementByXpath("//*[@value='Hello Kaviraja!']");
		 * String usertxt= user.getText(); System.out.println(usertxt);
		 * boolean contains = usertxt.contains("Hello Kaviraja!");
		 * base.assertTrue(contains);
		 */
		base.findElementByXpath("//*[@value='Sydney']").click();
		base.findElementByXpath("//*[@value='Hotel Hervey']").click();
		base.findElementByXpath("//*[@value='Double']").click();
		base.findElementByXpath("//*[@value='1']").click();
		Thread.sleep(5000);
		WebElement findElementByXpath = base.findElementByXpath("//*[@id='datepick_in']");
		findElementByXpath.clear();
		findElementByXpath.sendKeys("11/01/2023");
		WebElement findElementByXpath2 = base.findElementByXpath("//*[@id='datepick_out']");
		findElementByXpath2.clear();
		
		findElementByXpath2.sendKeys("16/01/2023");
		 base.findElementByXpath("//*[@id='adult_room']").click();
		/*//findElementByXpath3.clear();
		base.findElementByXpath("//*[@value='2'][1]").click();
		*/
		base.findElementByXpath("//*[@id='child_room']").click();
		
		
		
		
	}

}
