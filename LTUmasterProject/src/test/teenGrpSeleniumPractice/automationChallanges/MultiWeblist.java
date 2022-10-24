package TestScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiWeblist
{
  public static void main(String[] args) 
  {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///F:/thoid/MultiSelectListBox3.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//locating the element
	WebElement list = driver.findElement(By.id("country"));
	
	
	Select select=new Select(list);
	//storing list 	
	List<WebElement> all = select.getOptions();
	
	//selecting all the list elements
	for(WebElement e:all)
	{
		System.out.println(e.getText());
		e.click();
		
	}
	select.deselectAll();
  }
}
