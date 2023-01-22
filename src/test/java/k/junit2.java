package k;




import k.baseClass;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;



public class junit2   extends baseClass {
	
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		maximizeWindow();
		implicitWait();
		enterApplyUrl("http://adactinhotelapp.com/");

	}
	@Before
	public void before() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		}
	@After
	public void after() {
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	
	
	@Test
	public void tc1() throws Throwable {

	
		WebElement txtUserName = elementById("username");
		String userText = getDataFromCell("datas", 2, 0);
		elementSendkeys(txtUserName, userText);
		
		WebElement txtBoxPass = elementById("password");
		String passText = getDataFromCell("datas", 2, 1);
		elementSendkeys(txtBoxPass, passText);
		
		WebElement btnLogin = elementById("login");
		elementClick(btnLogin);
		
		WebElement welcomeMsg = elementById("username_show");
		String textBox = insertedValueTextBox(welcomeMsg, "value");
		boolean contains = textBox.contains("Hello");
		Assert.assertTrue("verify welcome", contains);
		
	}
	@Test
	public void tc2() throws Throwable {
		
		WebElement locationDD = elementById("location");
		String userText = getDataFromCell("datas", 2, 2);
		selectByText(locationDD, userText);
		
		WebElement hotelDD = elementById("hotels");
		String hotelText = getDataFromCell("datas", 2, 3);
		selectByText(hotelDD, hotelText);
		
		WebElement roomDD = elementById("room_type");
		String roomText = getDataFromCell("datas", 2, 4);
		selectByText(roomDD, roomText);
		
		WebElement roomNoDD = elementById("room_nos");
		String roomNoText = getDataFromCell("datas", 2, 5);
		selectByText(roomNoDD, roomNoText);
		

		WebElement ddOutDate = elementById("datepick_out");
		//String ddOutDateText = getDataFromCell("datas", 2, 7);
		ddOutDate.clear();
		elementSendkeys(ddOutDate, "15/02/2023");

		WebElement ddDate = elementById("datepick_in");
//		String ddDateText = getDataFromCell("datas", 2, 6);
		ddDate.clear();
		elementSendkeys(ddDate, "17/02/2023");
		

		WebElement ddAdults = elementById("adult_room");
		String ddAdultsText = getDataFromCell("datas", 2, 8);
		selectByText(ddAdults, ddAdultsText);
		
		WebElement ddChilds = elementById("adult_room");
		String ddChildsText = getDataFromCell("datas", 2, 9);
		selectByText(ddChilds, ddChildsText);
		
		WebElement btnSumbit = elementById("Submit");
		elementClick(btnSumbit);
		
		WebElement errorOutMsg = elementById("checkout_span");
		String errorOutTxt = getText(errorOutMsg);
		Assert.assertEquals("Check-Out", errorOutTxt);
		System.out.println(errorOutTxt);
		
		boolean enabledIndd = isEnabled(ddDate);
		Assert.assertTrue("date-in enable", enabledIndd);
		
	}
	//select hotel
	@Test
	public void tc3() throws  Throwable {
	
		Thread.sleep(7000);
		WebElement ddDate1 = elementById("datepick_in");
		ddDate1.clear();
		String ddDateText1 = getDataFromCell("datas", 2, 6);
		elementSendkeys(ddDate1, ddDateText1);
		
		WebElement ddOutDate1 = elementById("datepick_out");
		ddOutDate1.clear();
		String ddOutDateText1 = getDataFromCell("datas", 2, 7);
		elementSendkeys(ddOutDate1, ddOutDateText1);
		
		WebElement btnSumbit = elementById("Submit");
		elementClick(btnSumbit);
		
		
	}
	

//book hotel

	//booking confirmation
@Test
public void tc4() throws IOException{
	
	
	WebElement radioBtn = elementById("radiobutton_0");
	radioBtn.click();
	WebElement continueBtn = elementById("continue");
	continueBtn.click();
	
	
}
@Test
public void tc5() throws Throwable {

	WebElement billingFirstName = elementById("first_name");
	String billingName = getDataFromCell("datas", 2 , 0);
	elementSendkeys(billingFirstName, billingName);
	
	WebElement billingLastName = elementById("last_name");
	String billingLstName = getDataFromCell("datas", 2 , 0);
	elementSendkeys(billingLastName, billingLstName);

	WebElement billingAddress = elementById("address");
	String textAddress = getDataFromCell("datas", 2 , 10);
	elementSendkeys(billingAddress, textAddress);

	WebElement ccNo = elementById("cc_num");
	String ccText = getDataFromCell("datas", 2 , 11);
	elementSendkeys(ccNo, ccText);	
	
	WebElement ccType = elementById("cc_type");
	String ccTypeText = getDataFromCell("datas", 2 , 12);
	selectByText(ccType, ccTypeText);	
	
	WebElement ccExpiryMonth = elementById("cc_exp_month");
	String ccExpiryText = getDataFromCell("datas", 2 , 13);
	selectByText(ccExpiryMonth, ccExpiryText);	
	
	WebElement ccExpiryYear = elementById("cc_exp_year");
	String ccExpYearText = getDataFromCell("datas", 2 , 14);
	selectByText(ccExpiryYear, ccExpYearText);	
	
	WebElement cvvNo = elementById("cc_cvv");
	String cvvNoText = getDataFromCell("datas", 2 , 15);
	elementSendkeys(cvvNo, cvvNoText);	
	
	WebElement bookNow = elementById("book_now");
	elementClick(bookNow);
	Thread.sleep(10000);
	
	
	WebElement orderId1 = elementById("order_no");
	String valueOrder = insertedValueTextBox(orderId1, "value");
System.out.println(valueOrder);
	writeCellData("datas", 2, 16, valueOrder);
	
}

}
	

