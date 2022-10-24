package listenersDemoScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(listenersDemo.TestNGListener.class)
public class TestCase 


{
    public WebDriver driver;
	
	@Test
	public void verifyActime()
	{
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
	    driver=new ChromeDriver();
	    
	    driver.get("http://sultan:7070/login.do");
	}
	
	@Test
	public void test3()
	{
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
	    driver=new ChromeDriver();
	    
		
		System.out.println("Browserlanunced");
	}
	
	@Test(dependsOnMethods="test3")
	public void test4()
	{
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
	    driver=new ChromeDriver();
	    
		Assert.fail();
		System.out.println("1st test run");
	}
	
}
