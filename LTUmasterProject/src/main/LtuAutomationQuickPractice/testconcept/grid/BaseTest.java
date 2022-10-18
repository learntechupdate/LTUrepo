package testconcept.grid;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public  void launch() throws MalformedURLException 
	{
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WIN10);
		URL nodeurl=new URL("http://10.0.3.48:5555/wd/hub");//node url
		driver=new RemoteWebDriver(nodeurl,cap);
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//java -jar D:\sss.jar -role hub
		//java -Dwebdriver.chrome.driver="D:\chromedriver.exe" -jar D:\sss.jar -role node -hub http://10.0.4.13:4444/grid/register/�-port 5555
		//http://localhost:4444/grid/console   /to check the nodes registered
	}
	
	@AfterClass
	public  void closebrowser() 
	{
		
		//driver.quit();
		
	}
	
	@BeforeMethod
	public void enterurl()
	{
		driver.get("https://login.onepaperlane.org/users/login");
	}
	
	@AfterMethod
	public void logout()
	{
		//driver.get("https://login.onepaperlane.org/users/login");
	}
}
