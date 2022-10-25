package testscripts.RennixIQTestAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import AutomationLTU.BrowserFactory;
import libraryGeneric.Utility;
import testscripts.pom.BaseTest;


public class Assign2Alternate extends BaseTest{
	
	String tripURL="https://www.softwaresuggest.com/";
	
	//Test data
	String searchHotel="Club Mahindra";
	int starRating = 5; // int starRating=4
	
	@Test
	public  void rating()  
	{
		
		BrowserFactory.enterUrl(tripURL);
		
		//search
		driver.findElement(By.id("query")).sendKeys(searchHotel);
		driver.findElement(By.id("query")).sendKeys(Keys.ENTER);
		
		//select 1st search result
		driver.findElement(By.xpath("(//a[@class='ga_track_soft_name software_name'])[1]")).click();
		
		//write reivew
		driver.findElement(By.xpath("//a[@class='ga_track_nr_wrs header_small_text write-review-btn']")).click();
		
		Utility.swtichToTab(driver, 2);
		
		
			//hover over overall rating and click on 5th rating
			for (int i = 1; i <= starRating ; i++) {
			
			WebElement star = driver.findElement(By.xpath("(//*[@data-rating-value='" +i+ "'])[1]"));
			Utility.mouseHover(driver, star);
			
		}
		
			//Features * hover	
		for (int i = 1; i <= starRating; i++) {
			
			WebElement star = driver.findElement(By.xpath("(//*[@data-rating-value='" +i+ "'])[2]"));
			Utility.mouseHover(driver, star);
			
		}
		
		//Ease of use *

		for (int i = 1; i <= starRating; i++) {
			
			WebElement star = driver.findElement(By.xpath("(//*[@data-rating-value='" +i+ "'])[3]"));
			Utility.mouseHover(driver, star);
			
		}
		
		//Value for money

		for (int i = 1; i <= starRating; i++) {
			
			WebElement star = driver.findElement(By.xpath("(//*[@data-rating-value='" +i+ "'])[4]"));
			Utility.mouseHover(driver, star);
			
		}
		
		//Customer support
		for (int i = 1; i <= starRating; i++) {
			
			WebElement star = driver.findElement(By.xpath("(//*[@data-rating-value='" +i+ "'])[5]"));
			Utility.mouseHover(driver, star);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
			
}	
