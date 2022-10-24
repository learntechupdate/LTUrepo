package library;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.google.common.io.Files;

public class GenericUtility 

{

	
	//MouseHover 
	public static void mouseHover(WebDriver driver,WebElement e)
	{
		new Actions(driver).moveToElement(e).click().build().perform();
	}
	
	public static void contextClick(WebDriver driver,WebElement e)
	{
		new Actions(driver).contextClick().perform();
	}
	
	//Wait 
	public static void wait(int sec)
	{
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			
		}
	}
	
	
	
    public static void scrollTillWebelement(WebDriver driver ,WebElement webelement) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", webelement);
    }
    
	//To convert the Alpanumeric String to Numeric String
	public static String ConvertToNumericString(String inputString) 
	
	{
		
		String outputString= "";

		for(char ch : inputString.toCharArray() )
		{
			if (Character.isDigit(ch)) {
				
				outputString=outputString+ch;
			}
		}
		
		return outputString;
		
	}
	//To convert the Numeric String  to Integer
	public static int  AlpaNumericToInteger(String inputString) {
			
			return Integer.parseInt(ConvertToNumericString(inputString));
		
		}

	
	
	
	//to perform action on new tab
	public static void swToTab(WebDriver driver, int TabNo)
	{	
	ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(windowHandles.get(TabNo-1));
	}
	
	
}
