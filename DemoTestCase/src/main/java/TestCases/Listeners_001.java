package TestCases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_001 implements ITestListener {
	
	public void onFinish(ITestContext arg0) {
		System.out.println("Test ON Finished");
		
	}

	public void onStart(ITestContext arg0) {
	
		System.out.println("Test ON Started");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test Case Failed");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test Case Skipped");
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("Test Case Started");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test Case Sucessed");
		
	}
}
