package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;

public class Google {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
	
		
		driver.manage().window().fullscreen();
		
		driver.get("http://www.google.com");
		
        String aTitle=driver.getTitle();
        String eTitle="Google";
        if(eTitle.equalsIgnoreCase(aTitle))
        {
        	System.out.println("pass");
        }
        else
        	{System.out.println("fail");}
	driver.quit();
	}

}
