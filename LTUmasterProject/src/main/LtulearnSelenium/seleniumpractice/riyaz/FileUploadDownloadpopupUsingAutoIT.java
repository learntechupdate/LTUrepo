package seleniumpractice.riyaz;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import AutomationLTU.BrowserFactory;



/* Auto it script
 * Mozilla - File Upload , chrome - Open
WinWaitActive("File Upload")
Sleep(2000)
Send("C:\Fileupload\PDFFile.pdf")
Sleep(2000)
Send("{TAB}")
Sleep(2000)
Send("{TAB}")
Sleep(2000)
Send("{ENTER}")
*/
public class FileUploadDownloadpopupUsingAutoIT{
	
	public WebDriver driver;
	
	/*
	@Test
	public void fileUploadDownloadChrome() throws IOException {
		
		driver= BrowserFactory.startBrowser("chrome");
		
		BrowserFactory.enterUrl("https://www.investintech.com/pdf-to-word/");
		
		driver.findElement(By.id("dzupload")).click();	
		
		
		// below line execute the AutoIT script
		Runtime.getRuntime().exec("./exe/chromefileupload.exe");
		
		
		driver.findElement(By.id("dl-file")).click();
	}
	*/
	
	@Test
	public void fileUploadDownloadMozilla() throws IOException {
		
		driver= BrowserFactory.startBrowser("firefox");
		
		BrowserFactory.enterUrl("https://www.investintech.com/pdf-to-word/");
		
		driver.findElement(By.id("dzupload")).click();	
		
		
		// below line execute the AutoIT script
		Runtime.getRuntime().exec("./exe/mozillafileupload.exe");
		
//		WebElement downloadfileButton = driver.findElement(By.xpath("//*[@id='dl-file']"));
//		Utility.scrollTillWebelement(driver, downloadfileButton);
//		downloadfileButton.click();
		
		//click on download file manually
		Runtime.getRuntime().exec("./exe/filedownloadMozillashekar.exe");
		
		
		
	}
	
	
	
	
		
}

	
	
