package com.testng;

import org.testng.annotations.Test;

public class TestNgexample {

	@Test(priority= 2)
	public void test1() {

	System.out.println("this should print 2nd");	
	}
	
	@Test(priority=3)
	public void test2() {

	System.out.println("this should print first");	
	}
	
	@Test(priority = 1)
	public void test3() {

	System.out.println("this should print 3rd");	
	}
	
}


