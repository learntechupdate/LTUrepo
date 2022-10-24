package Library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.google.common.io.Files;

public class Utility 

{

	public static String project_path()
	{
		String project_path="C:\\Users\\Admin\\Music\\SeleniumWB\\LearnAutomation";
		
		return project_path;
	}
	
	
	public static String takeScreenShot(WebDriver driver,String path,String picName)
	{
		
		try 
		{
				
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File(path+picName+".jpg");
				
				try {
					Files.copy(src, dest);
					//FileUtils.copyFile(src, dest);
				} catch (IOException e) {
					Reporter.log("file not copied to destination",true);
				}
			
		
				
		} 
		
		catch (Exception e)
		{
		 
			Reporter.log("Exception while taking screenshot "+e.getMessage(),true);
		}
		
		return project_path()+path+picName+".jpg";	 
		
	}
	
		
	
	
}
