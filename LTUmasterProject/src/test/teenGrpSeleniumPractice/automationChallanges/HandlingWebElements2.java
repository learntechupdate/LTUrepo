package automationChallanges;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class HandlingWebElements2 

{
	public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
	//code to print all the links present in the webpage
	driver.get("http://192.168.56.1/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 List<WebElement> e=driver.findElements(By.xpath("//a"));
	for(WebElement t :e)
	{
		System.out.println(t.getText());
	}
	System.out.println("count of links ="+e.size());
	
	}

}
 