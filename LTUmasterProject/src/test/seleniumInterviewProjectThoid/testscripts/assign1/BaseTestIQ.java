package testscripts.assign1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.MediaEntityBuilder;

import AutomationLTU.BaseTestGeneric;
import libraryGeneric.Utility;

public class BaseTestIQ extends BaseTestGeneric {
	
	@AfterMethod
	public void afterTCRunMethod(ITestResult result) {

		Utility.takeScreenshotOnPassOrFailure(driver, result);
		Utility genericUtility = new Utility();

		try {
			String screenshotPassedPath="D:/Riyaz/AWB/qspiderLtu/QspidersLTU/screenshot/passedTC/fetchItemPrice.jpg";
			// log with snapshot
			
			genericUtility.extentReport("fetchItemPrice",screenshotPassedPath);
			genericUtility.logger.pass("Passed Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPassedPath).build());
			
		} catch (IOException e) {
			genericUtility.extentReport("fetchItemPrice",
					"D:/Riyaz/AWB/qspiderLtu/QspidersLTU/screenshot/failedTC/fetchItemPrice.jpg");
			Assert.fail();

		}
	}

}
