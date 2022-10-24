package AdvanceReporting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Library.Utility;

public class AdvanceReporting2 
//Advance reporting using extentreports-2.05.jar

{
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	
	SoftAssert sa=new SoftAssert();
	
	
	@Test
	public void verifytitle()
	{
		report =new ExtentReports("./reports/Advreport2.html");
		
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
		
		driver.get(Utility.project_path()+"./reports/Advreport2.html");
	    
	}
	
	
	
}	

