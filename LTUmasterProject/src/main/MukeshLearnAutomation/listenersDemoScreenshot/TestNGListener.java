package listenersDemoScreenshot;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Library.Utility;

public class TestNGListener implements ITestListener



{
	public WebDriver driver;
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		 this.driver = ((TestCase)result.getInstance()).driver;
		 
		 Utility.takeScreenShot(driver, "./screenshots/", result.getName()+"_Failed");
		 
		System.out.println("Test case's Failed "+result.getName());
		
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
