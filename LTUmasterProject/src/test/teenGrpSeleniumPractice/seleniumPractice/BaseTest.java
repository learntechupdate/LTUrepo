package MasterProject.MasterProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import library.generic.BrowserFactory;

/* Function Name : 
 * Description   : 
 * Parameters    : 
 * Author & Date : Touheed Aslam DD/MM/2019
 * Modified Date :*/


public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public  void launch() 
	{
		
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
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
		BrowserFactory.closeBrowser();
		
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
