package TestScript;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageOnLoadPopUp {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://192.168.1.1/");
		
		try {
			Runtime.getRuntime().exec("F:/thoid/demo.exe");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	
	}

}
