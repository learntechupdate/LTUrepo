package Automation.LTU;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


/* Function Name : 
 * Description   : 
 * Parameters    : 
 * Author & Date : Touheed Aslam DD/MM/2019
 * Modified Date :*/

public class BaseTestGeneric {

	public WebDriver driver;

	@BeforeClass
	public void launch() {

		driver = BrowserFactory.startBrowser("Chrome");

	}

	@AfterClass
	public void closebrowser() {
		// BrowserFactory.closeBrowser();
	}

	@BeforeMethod
	public void beforeTCRunMethod() {

		Reporter.log("BeforeTCRunMethod", true);
	}

	@AfterMethod
	public void afterTCRunMethod() {
		Reporter.log("AfterTCRunMethod", true);
	}
}
