package com.sos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample {

	@Test
	public void test() {
System.out.println("test");
	}
	
	@Before
	public void before() {
System.out.println("befour");
	}
	
	
	@After
	public void after() {
System.out.println("after");
	}
	
	@AfterClass
	static public void afterclass() {
System.out.println("afterclass");
	}
	
	
	@BeforeClass
	static public void befourclass() {
System.out.println("befourclass");
	}
	
	
	
}
