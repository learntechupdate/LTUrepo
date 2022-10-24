package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEnable 


{
	WebDriver driver;

	@Test
	public void test1()
	{
		
		System.out.println("1st test run");
	}
	
	@Test(enabled=false)
	public void test2()
	{
		
		System.out.println("2nd test run");
	}
	
	@Test()
	public void test3()
	{
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
	    driver=new ChromeDriver();
	    
		Assert.fail();
	}
	
}
