package automationChallanges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadPopup {

	public static void main(String[] args)
	{
		FirefoxProfile profile = new FirefoxProfile();
		//profile.setPreference(key, value); key->about:config value->http://www.hansenb.pdx.edu/DMKB/dict/tutorials/mime_typ.php
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/java-archive");
		
				
		WebDriver driver=new FirefoxDriver(profile);
		driver.get("http://www.seleniumhq.org/download");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("2.52.0")).click();
		
		

	}

}
