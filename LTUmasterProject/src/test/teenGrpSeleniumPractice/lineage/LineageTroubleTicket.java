package lineage;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LineageTroubleTicket 
{ 
	public static void main(String[] args) 
	
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter user name");
		//String a=scn.next();
		System.out.println("Enter password");
		//String b=scn.next();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://smart.pacerenewables.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("appLogin_UserName")).sendKeys("Touheed");
		driver.findElement(By.id("appLogin_Password")).sendKeys("touheed");
		driver.findElement(By.id("appLogin_LoginImageButton")).click();
		scn.close();
		
	}
	
	

}
