package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelector 


{
    public WebDriver driver;
	
	@Test
	public void usingIdClass()
	{
	System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
    driver=new ChromeDriver();
    
    driver.get("http://opensource.demo.orangehrmlive.com/");
    
    //using id (#)
    driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
    
    driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin");
    
    
  //using class (.)
    driver.findElement(By.cssSelector("input.button")).click();
    
    driver.findElement(By.cssSelector(".panelTrigger")).click();
    
    driver.findElement(By.cssSelector("a.panelTrigger")).click();
    
	}
	
	
	@Test
	public void usingAttribute()
	{
	System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
    driver=new ChromeDriver();
    
    driver.get("http://opensource.demo.orangehrmlive.com/");
    
      driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Admin");
    
      //mutiple  attribute
    driver.findElement(By.cssSelector("input[id='txtPassword'][type='password']")).sendKeys("admin");
    
	}
	
	@Test
	public void usingContains()// *
	{
	System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
    driver=new ChromeDriver();
    
    driver.get("http://opensource.demo.orangehrmlive.com/");
    
    
    driver.get("http://opensource.demo.orangehrmlive.com/");
    
    driver.findElement(By.cssSelector("input[name*='txtUsername']")).sendKeys("Admin");
  
    driver.findElement(By.cssSelector("input[id*='txtPassword']")).sendKeys("admin");
    
    
	}
	
	@Test
	public void endsWithstartwith() // ends with ($) starts with (^)
	{
	System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
    driver=new ChromeDriver();
    
    driver.get("http://opensource.demo.orangehrmlive.com/");
    
    
    driver.get("http://opensource.demo.orangehrmlive.com/");
    
    //ends with ($)
    driver.findElement(By.cssSelector("input[name$='Username']")).sendKeys("Admin");
  
    //start (^)& end ($)
    driver.findElement(By.cssSelector("input[name^='txtPass'][name$=word]")).sendKeys("admin");
    
    
	}
	
	
	
}
