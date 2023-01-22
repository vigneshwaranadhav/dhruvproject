package k;

import java.io.IOException;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class junit1 extends baseClass {
@BeforeClass
public static void beforeClass() {
	System.out.println("beforecls");
	getDriver();
	implicitWait();
	enterApplyUrl("http://adactinhotelapp.com/");
	maximizeWindow();
}
@AfterClass
public static void afterClass() {
	System.out.println("aftercls");
	//quitwindow();
}
@Before
public void before() {
	System.out.println("before");
	long startTime = System.currentTimeMillis();
	System.out.println(startTime);
}
@After
public void after() {
	System.out.println("after");
	long endTime = System.currentTimeMillis();
	System.out.println(endTime);
}
@Test

public void tc1() throws IOException {
	WebElement txtusername = elementById("username");
	String name = getDataFromCell("Sheet1", 1, 0);
	elementSendkeys(txtusername, name);
	WebElement txtpassword = elementById("password");
	String pass = getDataFromCell("Sheet1", 1, 1);
	elementSendkeys(txtpassword, pass);
	WebElement btnlogin = elementById("login");
	elementClick(btnlogin);
	WebElement welcomeattribute = elementById("username_show");
	String welcome = elementGetAttribute1(welcomeattribute,"value");
	boolean contains = welcome.contains("Hello Kaviraja");
	System.out.println(contains);
	Assert.assertTrue("Welcome Note",contains);
	WebElement ddlocation = elementById("location");
	selectOptionByIndex(ddlocation, 7);
	WebElement ddhotels = elementById("hotels");
	selectOptionByIndex(ddhotels, 3);
	WebElement ddroomtype = elementById("room_type");
	selectOptionByIndex(ddroomtype, 3);
	WebElement ddroomnos = elementById("room_nos");
	selectOptionByIndex(ddroomnos, 1);
	WebElement checkin = elementById("datepick_in");
	textBoxJs(checkin);
	String checkindate = getDataFromCell("sheet1", 2, 4);//Check-In Date shall be before than Check-Out Date
	elementSendkeys(checkin, checkindate);
	WebElement checkout = elementById("datepick_out");
	textBoxJs(checkout);
	String checkoutdate = getDataFromCell("sheet1", 2, 5);//Check-Out Date shall be after than Check-In Date
	elementSendkeys(checkout, checkoutdate);
	WebElement ddadultnos = elementById("adult_room");
	selectOptionByIndex(ddadultnos, 1);
	WebElement ddchlnos = elementById("child_room");
	selectOptionByIndex(ddchlnos, 1);
	WebElement btnsubmit = elementById("Submit");
	elementClick(btnsubmit);
	WebElement spanintext = elementById("checkin_span");
	String chkinspan = getText(spanintext);
	System.out.println(chkinspan);
	Assert.assertEquals("adapodain","Check-In Date shall be before than Check-Out Date", chkinspan);
	
	WebElement spanouttext = elementById("checkout_span");
	String chkoutspan = getText(spanouttext);
	System.out.println(chkoutspan);
	Assert.assertEquals("out neeyumada","Check-Out Date shall be after than Check-In Date", chkoutspan);
	
	//pageRefresh();
}

private void selectOptionByIndex(WebElement ddlocation, int i) {
	// TODO Auto-generated method stub
	
}
private String elementGetAttribute1(WebElement welcomeattribute, String string) {
	// TODO Auto-generated method stub
	return null;
}
@Test
public void tc2() throws IOException {
	WebElement ddlocation = elementById("location");
	selectOptionByIndex(ddlocation, 7);
	WebElement ddhotels = elementById("hotels");
	selectOptionByIndex(ddhotels, 3);
	WebElement ddroomtype = elementById("room_type");
	selectOptionByIndex(ddroomtype, 3);
	WebElement ddroomnos = elementById("room_nos");
	selectOptionByIndex(ddroomnos, 1);
	WebElement checkin = elementById("datepick_in");
	textBoxJs(checkin);
	String checkindate = getDataFromCell("sheet1", 1, 4);
	elementSendkeys(checkin, checkindate);
	WebElement checkout = elementById("datepick_out");
	textBoxJs(checkout);
	String checkoutdate = getDataFromCell("sheet1", 1, 5);
	elementSendkeys(checkout, checkoutdate);
	WebElement ddadultnos = elementById("adult_room");
	selectOptionByIndex(ddadultnos, 1);
	WebElement ddchlnos = elementById("child_room");
	selectOptionByIndex(ddchlnos, 1);
	WebElement btnsubmit = elementById("Submit");
	elementClick(btnsubmit);
}
@Test
public void tc3() {
	WebElement btnradio = elementById("radiobutton_0");
	elementClick(btnradio);
	WebElement btncontinue = elementById("continue");
	elementClick(btncontinue);
}
@Test
public void tc4() throws IOException {
	WebElement txtfirstname = elementById("first_name");
	String firstname = getDataFromCell("Sheet1", 1, 6);
	elementSendkeys(txtfirstname, firstname);
	WebElement txtlastname = elementById("last_name");
	String lastname = getDataFromCell("Sheet1", 1, 7);
	elementSendkeys(txtlastname, lastname);
	WebElement txtaddress = elementById("address");
	String address = getDataFromCell("Sheet1", 1, 8);
	elementSendkeys(txtaddress, address);
	WebElement txtccno = elementById("cc_num");
	String ccno = getDataFromCell("Sheet1", 1, 9);
	elementSendkeys(txtccno, ccno);
	WebElement ddcctype = elementById("cc_type");
	selectOptionByIndex(ddcctype, 1);
	WebElement ddmonth = elementById("cc_exp_month");
	selectOptionByIndex(ddmonth, 8);
	WebElement ddyear = elementById("cc_exp_year");
	selectOptionByIndex(ddyear, 12);
	WebElement txtcvv = elementById("cc_cvv");
	String cvv = getDataFromCell("Sheet1", 1, 10);
	elementSendkeys(txtcvv, cvv);
	WebElement btnbooknow = elementById("book_now");
	elementClick(btnbooknow);
}
@Test
public void tc5() throws Throwable {
	WebElement txtorderno = elementById("order_no");
	String elementGetAttribute1 = elementGetAttribute1(txtorderno, "value");
	System.out.println(elementGetAttribute1);
	writeCellData("Sheet1", 1, 11, elementGetAttribute1);
}

}
