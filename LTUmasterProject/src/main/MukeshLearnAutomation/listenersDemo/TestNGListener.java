package listenersDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import Library.Utility;

public class TestNGListener  implements ITestListener



{
	
	public WebDriver driver;
	
	String project_path="F:\\thoid\\SeleniumWB2\\MukeshDemo\\screenshots";
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test cases Failed "+result.getName());
	}
		
	@Override
	public void onFinish(ITestContext argo) {
		
		System.out.println("Testing Finished");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Testing Started");		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
	

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case's Skipped "+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case's Started "+result.getName());		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case's completed successfully : "+result.getName());
		
	}

}
