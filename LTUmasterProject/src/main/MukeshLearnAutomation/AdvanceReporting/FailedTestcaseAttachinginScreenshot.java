package AdvanceReporting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Library.Utility;

public class FailedTestcaseAttachinginScreenshot

{
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	
	SoftAssert sa=new SoftAssert();
	
	@Test
	public void googlefailuretest()
	{
		report =new ExtentReports("./reports/Advreport2.html");
		 
		logger=report.startTest("VerifyBlogTitle");
		
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
	    driver=new ChromeDriver();
	    
	    driver.get("https://www.google.com");
		
	    driver.findElement(By.id("xyz"));//to check screechto given wrong id
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			
			String screenshot_path = Utility.takeScreenShot(driver, "./screenshots/", result.getName());
			
			
			String image = logger.addScreenCapture(screenshot_path);

			logger.log(LogStatus.FAIL, "Not able to find element",image);
		}
		
		Reporter.log("flushing report",true);
		report.endTest(logger);
		report.flush();
		driver.get(Utility.project_path()+"./reports/Advreport2.html");
	}
	
	/*
	@Test
	public void verifytitle()
	{
		report =new ExtentReports("./extReport/Advreport2.html");
		
		logger =report.startTest("Test to verify Blog title");
		
		
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
	    driver=new ChromeDriver();
	    
	    
	    logger.log(LogStatus.INFO, "Browser is up and running");
	    
	    driver.get("http://learn-automation.com/");
	    logger.log(LogStatus.INFO, "Application is up and running");
	    
	    String actualtitle = driver.getTitle();
	    logger.log(LogStatus.INFO, "Title captured");
	    
	    sa.assertTrue(actualtitle.contains("Selenium "));
	    
	    String screenshot_path = Utility.takeScreenShot(driver, ".\\screenshots\\","AdReport2Screenshot");
		
		
		String image = logger.addScreenCapture(screenshot_path);

		logger.log(LogStatus.PASS, "Title is verified",image);
		
		report.endTest(logger);
		report.flush();
		
		sa.assertAll();
		
		driver.get(Utility.project_path()+"./extReport/Advreport2.html");
	    
	}
	*/
	
	
}	

