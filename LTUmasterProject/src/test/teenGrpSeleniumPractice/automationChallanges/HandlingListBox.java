package automationChallanges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class HandlingListBox 
{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.get("file:///F:/thoid/HandlingListBox.html");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//locating list box

WebElement list=driver.findElement(By.id("country"));

//Creating object of select class by passing list box element

Select select=new Select(list);
//Selecting the option form list box
select.selectByIndex(2);
//select.selectByValue("UK");
//select.selectByVisibleText("India");

}
	
}
 