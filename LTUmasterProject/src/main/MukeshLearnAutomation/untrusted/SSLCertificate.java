package untrusted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SSLCertificate 

 
{
	WebDriver driver;
	
	@Test
	public void handleCertificate()
	{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
	    driver=new ChromeDriver(cap);
	    
	    driver.get("https://www.cacert.org");
	    Assert.fail();
		
	}

}
