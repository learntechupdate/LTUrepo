package brokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLinks


{

	public static void main(String[] args)
	
	
	{
		
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("http://www.google.com");
	    
	    List<WebElement> link = driver.findElements(By.tagName("a"));
	    
	    for (int i = 0; i < link.size(); i++) 
	    {
			WebElement ele = link.get(i);
			String url = ele.getAttribute("href");
			verifyLinkActive(url);
		
		}
	   
	}
	
	public static void verifyLinkActive(String linkURL)
	{
		try {
			    URL url = new URL(linkURL);
			     HttpURLConnection httpURLconnect = (HttpURLConnection)url.openConnection();
			     httpURLconnect.setConnectTimeout(3000);
			     
			     
			     if (httpURLconnect.getResponseCode()==200)
			     {
					System.out.println(linkURL+"-"+httpURLconnect.getResponseMessage());
				 }
			     if (httpURLconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			     {
					System.out.println(linkURL+"-"+httpURLconnect.getResponseMessage()+"-"+HttpURLConnection.HTTP_NOT_FOUND);
				 }
			    
			
		} catch (Exception e) {
			
			
		}
	
	    
	    
	}
}
