package automationChallanges;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ChildBrowserPopup {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://192.168.56.1/login.do;jsessionid=209fauflnxjgq");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");//driver.findElement(By.name("username")).sendKeys(s1.next());
		driver.findElement(By.name("pwd")).sendKeys("manager");//driver.findElement(By.name("pwd")).sendKeys(s1.next());
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Create new tasks")).click();
		
		//Handling childbrowserWindow
		java.util.Set<String> wh = driver.getWindowHandles();
		for(String s:wh)
		{
		System.out.println(s);
		}
		Iterator<String>i=wh.iterator();
		String parent=i.next();
		System.out.println("Parent Window"+parent);
		String child= i.next();
		System.out.println("Child Window"+child);
		driver.switchTo().window(child);
		WebElement cID = driver.findElement(By.name("customerId"));
		Select s1=new Select(cID);
		s1.selectByIndex(4);
		WebElement pID = driver.findElement(By.name("projectId"));
		Select s2=new Select(pID);
		s2.selectByIndex(4);		
		//Selecting Date By Using Hidden Division Popup
		driver.findElement(By.id("ext-gen7")).click();
		driver.findElement(By.linkText("10")).click();
		
		driver.findElement(By.xpath("//*[@id='task0.cell']/input[1]")).sendKeys("LENOVOS");
	
		driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		
		
	}
		

}
