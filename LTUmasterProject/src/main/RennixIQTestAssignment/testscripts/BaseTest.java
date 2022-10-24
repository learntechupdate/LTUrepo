package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import library.BrowserFactory;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public  void launch() 
	{
		
//		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
//		 driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver=BrowserFactory.startBrowser("Chrome");
		
		
	}
	
	@AfterClass
	public  void closebrowser() 
	{
		//Not closing for testing purpose
		//driver.quit();
//		BrowserFactory.closeBrowser();
		
	}
	
	@BeforeMethod
	public void enterurl()
	{
		//not required for this scenario
	}
	
	@AfterMethod
	public void logout()
	{
		//not required for this scenario
	}
}
