package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

public class BrowserFactory 

{
  public static  WebDriver driver;
  
  		  
	public static WebDriver startBrowser(String BrowserName)
	{
		
		
		if (BrowserName.equalsIgnoreCase("mozilla")|BrowserName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./exe/geckodriver.exe");
			
		    driver=new FirefoxDriver();
		    
		    
		}
		
		else if(BrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		}
		
		else if (BrowserName.equalsIgnoreCase("ie")|BrowserName.equalsIgnoreCase("InternetExplorer")) 
		{
			System.setProperty("webdriver.ie.driver", "./exe/IEDriverServer.exe");
		    driver=new InternetExplorerDriver();
		    driver.manage().window().maximize();
		}
		
		
		
		Reporter.log("[INFO] "+BrowserName +" Browser Launched",true);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	
	public static void closeBrowser()
	{
		driver.quit();
		Reporter.log("[INFO] Browser Closed",true);
	}
	
	
	public static void enterUrl(String url)
	{
		
		driver.get(url);
		Reporter.log("[INFO]  "+"URL entered : "+url,true);
	}
	
}
