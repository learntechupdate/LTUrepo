package TestScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MultiList
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///F:/thoid/MultiSelectListBox3.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//locating list of element
	List<WebElement> e = driver.findElements(By.xpath("//input[@type='text']"));
	System.out.println("e.size"+e.size());
	//code for typing in all textboxes
	for(WebElement i:e)
	{
		
			Thread.sleep(1000);
		 
		i.sendKeys("selenium");
	}
  }
}
