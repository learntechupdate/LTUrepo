package TestScript;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownMenu {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.get("http://www.homeshop18.com/");
				
	    try
	    {
	    	driver.findElement(By.xpath("//*[@id='HS18Logo']/area[2]")).click();
	    	System.out.println("Welcome to "+driver.getTitle());
	    }
	    catch(NoSuchElementException ex)
		{
			System.out.println("check the Internet connection");
			driver.quit();
		} 
	    		
//		driver.findElement(By.xpath("//*[@class='live_tv_wrapper']/a")).click();
//		System.out.println(driver.getTitle());
//		
//		driver.findElement(By.xpath("//*[@id='HS18Logo']/area[2]")).click();
//		System.out.println("your in Home page"+driver.getTitle());
//		
		driver.findElement(By.linkText("Tablets")).click();	
	    System.out.println(driver.getTitle());
	    
	    //To handle drop down menu
	    Actions act=new Actions(driver);
		WebElement e = driver.findElement(By.linkText("HomeShop18"));
		act.moveToElement(e).perform();
		
		driver.findElement(By.linkText("Electronics")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
