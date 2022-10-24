package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {
	
	public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("touheedaslam");
	driver.findElement(By.id("pass")).sendKeys("password123");
	driver.findElement(By.id("loginbutton")).click();
	
	}

}
