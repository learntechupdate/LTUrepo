package automationChallanges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesHandling {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.zoho.com/login.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Locating Frame By Frame (Index)
		//driver.switchTo().frame(0);
		
		//Locating Frame By Frame(String)
		//driver.switchTo().frame("zohoiam");
		
		//Locating Frame By Frame(WebElement)
		WebElement e = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(e);
		
		driver.findElement(By.id("lid")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pwd")).sendKeys("123");
		driver.findElement(By.id("submit_but")).click();

	}

}
