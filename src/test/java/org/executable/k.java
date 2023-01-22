/*package org.executable;

import org.base.Baseclass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;




public class k {
	
	@BeforeClass
	public static void beforeclass() { 
		getDriver();
		maximizeWindow();
		enterAppInUrl("https://adactinhotelapp.com/");
		implicitWait(20);
	
		
		}
	@Test
	public  void tc1() {
		WebElement txtusername = findElementById("username");
		txtusername.sendKeys("Kaviraja");
		WebElement txtpassword = findElementById("password");
		txtpassword.sendKeys("Kaviraj@143");
		WebElement btnlogin = findElementById("login");
		btnlogin.click();
	}
	@Test
	public void tc2() {
		WebElement id = findElementById("username_show");
		String text = elementGetAttribute(id, "value");
		System.out.println(text);
		WebElement locate = findElementById("location");
		selectText(locate, "New York");
		WebElement hotel = findElementById("hotels");
		selectText(hotel, "Hotel Hervey");
		WebElement room = findElementById("room_type");
		selectText(room, "Super Deluxe");
		WebElement roomno = findElementById("room_nos");
		selectText(roomno, "2 - Two");
		WebElement indate = findElementById("datepick_in");
		indate.clear();
		indate.sendKeys("17/01/2023");
		WebElement outdate = findElementById("datepick_out"); 
		outdate.clear();
		outdate.sendKeys("10/01/2023");
		WebElement Adultroom = findElementById("adult_room");
		selectText(Adultroom, "2 - Two");
		WebElement children = findElementById("child_room");
		selectText(children, "1 - One");
		WebElement btnsearch = findElementById("Submit");
		btnsearch.click();
		WebElement errorCheckIn = findElementById("checkin_span");
		String text2 = errorCheckIn.getText();
		System.out.println(text2);
		WebElement errorCheckout  = findElementById("checkout_span");
		String text3 = errorCheckout.getText();
		System.out.println(text3);	
	}
	@Test
	public void tc3() {
		WebElement rdobdn = findElementById("radiobutton_0");
		rdobdn.click();
		WebElement slctContinue = findElementById("continue");
		slctContinue.click();
}
	@Test
	public void tc4() {
		WebElement fstname = findElementById("first_name");
		fstname.sendKeys("Kavi");
		WebElement lstname = findElementById("last_name");
		lstname.sendKeys("raj");
		WebElement billing = findElementById("address");
		billing.sendKeys("164/  salem main road,Villupuram");
		WebElement credit = findElementById("cc_num");
		credit.sendKeys("2233445566778899");
		WebElement creditcardtype = findElementById("cc_type");
		selectText(creditcardtype, "Master Card");
		
		
 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	

}
*/