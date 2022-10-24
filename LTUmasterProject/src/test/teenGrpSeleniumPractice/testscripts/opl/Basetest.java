package testscripts.opl;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import AutomationLTU.BrowserFactory;



public class Basetest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		driver=BrowserFactory.startBrowser("chrome");
		
	}
	
	
	@BeforeMethod
    public void login() {
		
		BrowserFactory.enterUrl("https://login.onepaperlane.org/users/login");
		
		
	}

}
