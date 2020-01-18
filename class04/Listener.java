package com.class04;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	 public void onTestStart1(ITestResult result) {
		    System.out.println("Test started "+ result.getName());
		  }
	 public void onTestStart(ITestResult result) {
		    System.out.println("Test passed "+result.getName());
		  }
	 public void onTestFailure(ITestResult result) {
		    System.out.println("Test failed "+result.getName());
		  }
	 
}
