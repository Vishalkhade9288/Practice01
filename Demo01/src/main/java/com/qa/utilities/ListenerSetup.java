package com.qa.utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		UtilClass.takeScreenShot(result.getName()+System.currentTimeMillis());
		logger.info("Test Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		UtilClass.takeScreenShot(result.getName()+System.currentTimeMillis());
		logger.info("Test Execution Completed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		UtilClass.takeScreenShot(result.getName()+System.currentTimeMillis());
		logger.info("Test Execution failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		UtilClass.takeScreenShot(result.getName()+System.currentTimeMillis());
		logger.info("Test Execution skipped");
	}

}