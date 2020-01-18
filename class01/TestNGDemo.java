package com.class01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
@Test
public void testone() {
	System.out.println("Hello");
}
@Test
public void TestTwo() {
	System.out.println("Hello from test 2");
}
@BeforeClass
public void beforeClass() {
	System.out.println("Before Class");
}
@AfterClass
public void afterClass() {
	System.out.println("After CLass");
}
@BeforeMethod
public void beforeMethod() {
	System.out.println("Before Method");
}
public void afterMethod() {
	System.out.println("After Method");

}}
