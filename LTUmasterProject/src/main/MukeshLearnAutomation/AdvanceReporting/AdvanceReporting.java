package AdvanceReporting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class AdvanceReporting 


{

	/*
	 //Advance reporting using extentreports-1.4.jar
	@Test
	public void verifytitle()
	{
		
		ExtentReports logger= ExtentReports.get(AdvanceReporting.class);
		
		logger.init("./extReport/extreport.html", true);
		logger.startTest("verify page title");
		
		
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    logger.log(LogStatus.INFO, "Browser is up and running");
	    
	    driver.get("http://learn-automation.com/");
	    logger.log(LogStatus.INFO, "Application is up and running");
	    
	    String actualtitle = driver.getTitle();
	    logger.log(LogStatus.INFO, "Title captured");
	    
	    Assert.assertTrue(actualtitle.contains("Selenium "));
	    logger.log(LogStatus.PASS, "Title is verified");
	    
	    logger.attachScreenshot("F:\\thoid\\SeleniumWB2\\MukeshDemo\\screenshots\\test.jpg");
	    
	    logger.endTest();
	}
	*/
	
}
