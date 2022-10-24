package DemoListenerNReporting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Library.Utility;


@Listeners(DemoListenerNReporting.TestNGListener.class)
public class TestCase 


{
	
	 ExtentReports report;
	 ExtentTest logger;
	public WebDriver driver;
	
	
	@Test
	public void googleTest()
	{
		
	    
	    driver.get("https://www.google.com");
	    logger.log(LogStatus.INFO, "Google web url entered");
		
	    driver.findElement(By.id("lst-ibdss")).sendKeys("facebook");//to check screechto given wrong id
	    logger.log(LogStatus.PASS, "send the search key");
	}
	
	@Test
	public void gmailTest()
	{
		
	    
	    driver.get("https://www.gmail.com");
	    logger.log(LogStatus.PASS, "Gmail url entered");
		
	    
	}
	
	@Test(dependsOnMethods="googleTest")
	public void skipTest()
	{
		
	    
	    driver.get("https://www.facebook.com");
	    logger.log(LogStatus.PASS, "facebook url entered");
		
	    
	}
	
	
	
	
	
	@BeforeClass
	public void StartBrower()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
	    driver=new ChromeDriver();
	    
	    report =new ExtentReports("./reports/Advreport2.html");
		 
		logger=report.startTest("TestCase");
	}
	
	@AfterClass
	public void closeBrower()
	{
		
		
		Reporter.log("flushing report",true);
		report.endTest(logger);
		report.flush();
		driver.get(Utility.project_path()+"./reports/Advreport2.html");
		
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			
			String screenshot_path = Utility.takeScreenShot(driver, "./screenshots/", result.getName());
			
			
			String image = logger.addScreenCapture(screenshot_path);

			logger.log(LogStatus.FAIL, result.getTestName(),image);
		}
		
		if(ITestResult.SKIP==result.getStatus())
		{
			
			//String screenshot_path = Utility.takeScreenShot(driver, "./screenshots/", result.getName());
			
			
			//String image = logger.addScreenCapture(screenshot_path);

			Reporter.log("Skipped ",true);
			logger.log(LogStatus.FAIL, result.getTestName()+" Failed");
		}
		
		
	}

	
}
