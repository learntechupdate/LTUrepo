package actime;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actimelogin
{
	public static void main(String[] args)
	{
		//Scanner s1=new Scanner(System.in);
		
		WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://192.168.56.1/login.do;jsessionid=209fauflnxjgq");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("admin");//driver.findElement(By.name("username")).sendKeys(s1.next());
	driver.findElement(By.name("pwd")).sendKeys("manager");//driver.findElement(By.name("pwd")).sendKeys(s1.next());
	driver.findElement(By.id("loginButton")).click();
	 
	
	//locating list box
/*	WebElement e = driver.findElement(By.name("usersSelector.selectedUser"));
	Select s=new Select(e); 
	s.selectByIndex(2);
	 //Explicit wait
	WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.name("usersSelector.selectedUser"))));
		Select s1=new Select(driver.findElement(By.name("usersSelector.selectedUser")));
		s1.selectByIndex(1);*/
	
	
//	//Selecting Calendar
	
	
	WebElement e = driver.findElement(By.xpath("//tr[@id='calendar_row_1']"));
	Actions act=new Actions(driver);
	
	act.moveToElement(e);
	
	driver.findElement(By.xpath("//tr[@id='calendar_row_1']/../../..//img")).click();
	
	}

}