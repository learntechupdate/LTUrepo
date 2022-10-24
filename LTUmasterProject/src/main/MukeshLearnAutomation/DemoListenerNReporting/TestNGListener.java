package DemoListenerNReporting;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Library.Utility;

public class TestNGListener implements ITestListener

{
   public WebDriver driver;	
	
	@Override
	public void onStart(ITestContext result) {
          
		Reporter.log("Testing of Started",true);
	}
	
	@Override
	public void onFinish(ITestContext argo) {
		
		
		Reporter.log("Testing Completed",true);
		
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		 this.driver = ((TestCase)result.getInstance()).driver;
		 
		 Utility.takeScreenShot(driver, "./screenshots/Failed/", result.getName()+"_Failed");
		 
//		 System.out.println(screenshot_path);
//		 String image = logger.addScreenCapture(screenshot_path);
//
//		 logger.log(LogStatus.FAIL, "Not able to find element",image);
		 
		 Reporter.log("Failed Test case(s) : "+result.getName(),true);
		
	}


	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
		Reporter.log(result.getName()+" Test case Skipped ",true);
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" Test case Started !",true);		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test case completed successfully : "+result.getName(),true);
		
	}

}
