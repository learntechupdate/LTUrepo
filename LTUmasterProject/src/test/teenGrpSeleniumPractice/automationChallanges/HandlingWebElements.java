package automationChallanges;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandlingWebElements 

{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///F:/thoid/HandlingMWE.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 List<WebElement> e=driver.findElements(By.tagName("input"));
		//code to type selenium in all the text boxes present in the webpage
//		 for (WebElement t : e) 
//		{
//			t.sendKeys("Selenium");
//		}
		 
		 //code to type Selenium in the last text box always
		 
		 e.get(e.size()-2).sendKeys("Selenium");
		
		 System.out.println("count of WebElements having input type ="+e.size());
		
	}
	

}
 