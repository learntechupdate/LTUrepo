package selenium.advance;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Automation.LTU.BaseTestGeneric;
import Automation.LTU.BrowserFactory;
import libraryGeneric.Utility;



public class CaptureScreenshotOnFailure extends BaseTestGeneric {
	
	public WebDriver driver;

	@Test
	public void captureScreenshot() {
		
		BrowserFactory.enterUrl("https://www.facebook.com/");
		//Assert.fail(); //We are purposefully failing the Test Case
		
		
	}
	
	@AfterMethod
	public void afterTCRunMethod(ITestResult result)
	{
		if(result.FAILURE==result.getStatus()) {
			Utility.takeScreenShot(driver, "./screenshot/failedTC/", result.getName());
			
		}
			
		else {
			Utility.takeScreenShot(driver, "./screenshot/passedTC/", result.getName());
		}
		//Reporter.log("AfterTCRunMethod", true);
		
		BrowserFactory.enterUrl("C:\\soft\\LTURepo\\QspidersLTU\\screenshot\\passedTC\\captureScreenshot.jpg");
	}
}
