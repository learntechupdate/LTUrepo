package automationChallanges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class HiddenDivisionPopup3 
{
 public static void main(String[] args)
 {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("http://192.168.56.1/login.do");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.findElement(By.className("textField")).sendKeys("admin");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath("//td[5]/a")).click();
	 
 }
	
}
 