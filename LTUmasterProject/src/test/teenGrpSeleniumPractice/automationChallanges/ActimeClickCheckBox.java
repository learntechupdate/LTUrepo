package TestScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Library.BaseActitime;


public class ActimeClickCheckBox extends BaseActitime
{
  public static void main(String[] args)
  {
  
			
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.navigate().to("http://192.168.56.1/login.do");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();

		

	
	driver.findElement(By.xpath("//*[@class='content tasks']/img")).click();
	
	List<WebElement> e = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	 //clicking all the checkboxes in increasing order
	 for(WebElement i:e)
	 {
		 i.click();
	 }	
	//clicking alternate checkboxes in increasing order
	 for(int i=0;i<e.size();i=i+2)
	 {
		 e.get(i).click();
		
	 }
	 //clicking alternate checkboxes in Decreasing order
	 for(int i=(e.size()-2);i>=0;i=i-2)
	 {
		 e.get(i).click();
	 }	 
	//clicking all the checkboxes in Reverse order
	 for(int i=(e.size()-1);i>=0;i--)
	 {
		 e.get(i).click();
	 }
		
  }
}
