package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartLogin {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.id("fk-top-search-box")).sendKeys("men watches");
		driver.findElement(By.xpath("//div/input[@value='Search']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath(".//*[@id='login-signup-newDialog']/div/div[1]/div[1]/div/div/div[4]/div[2]/input")).sendKeys("touheed.aslam@gmail.com");
		
	}

}
