package testcasescreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.Utility;

public class ScreenshotOnFailure 


{

	public WebDriver driver;
	
	@Test
	public void googlefailuretest()
	{
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
	    driver=new ChromeDriver();
	    
	    driver.get("https://www.google.com");
		
	    driver.findElement(By.id("xyz"));//to check screechto given wrong id
	}
	@Test
	public void gmailfailuretest()
	{
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
	    driver=new ChromeDriver();
	    
	    driver.get("https://www.gmail.com");
		
	    driver.findElement(By.id("sdfsd")).click();//to check screechto given wrong id
	}
	
			
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.takeScreenShot(driver, "./screenshots/", result.getName());
		}
		
	}
	
	
}
