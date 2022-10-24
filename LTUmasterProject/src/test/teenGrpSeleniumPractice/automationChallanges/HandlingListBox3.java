package automationChallanges;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class HandlingListBox3 
{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("file:///F:/thoid/HandlingListBox3.html");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//locating list box

WebElement list=driver.findElement(By.id("country"));

//Creating object of select class by passing list box element

Select select=new Select(list);
//Selecting the option from list box

List<WebElement> alloptions=select.getOptions();
for(WebElement e:alloptions)
{
	//to select all the options
e.click();
//to print all the options avaliable in list box
System.out.println(e.getText());
}

//Deselecting all the options
select.deselectAll();
select.selectByIndex(3);
}
	
}
 