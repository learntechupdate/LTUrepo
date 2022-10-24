package testscripts.RennixIQTestAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import AutomationLTU.BrowserFactory;
import libraryGeneric.Utility;
import pageobjectRennixIQTestAssignment2.BasePage;
import pageobjectRennixIQTestAssignment2.TripAdvisorHotelReviewPage;
import pageobjectRennixIQTestAssignment2.TripAdvisorHotelUserReviewPage;
import testscripts.pom.BaseTest;


public class Assign2TripAdvisorHotelRating extends BaseTest{
	
	String tripURL="https://www.tripadvisor.in";
	
	//Test data
	String searchHotel="Club Mahindra";
	String reviewTitleText="Good place to stay";
	String reviewText="Rooms facility are nice , "
		  		+ "great place to live have more time to spend here  "
		  		+ "It�s good and exciting adventure and even the good show "
		  		+ "for evening and good hospitality and good motivational staff the evening...";
	
	
	@Test
	public  void ratinghotel() throws InterruptedException  
	{
		
//		driver.get("https://www.tripadvisor.in");
		BrowserFactory.enterUrl(tripURL);
		
//		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
//		driver.findElement(By.id("mainSearch")).sendKeys("Club Mahindra");
//		driver.findElement(By.id("SEARCH_BUTTON")).click();
		BasePage trp=new BasePage(driver);
		
		trp.searchHotel(searchHotel);
		
		//click on 1st search result
//		driver.findElement(By.xpath("(//div[@class='result-title'])[1]")).click();
		trp.openFirstSearchResult();
		
		
		//s/w to 2nd tabto perform action on new tab
//		ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(windowHandles.get(1));
		Utility.swtichToTab(driver, 2);
		Utility.staticWait(3);
		
		
		//To click on write hotel review Button
//		driver.findElement(By.xpath("//div[@class='hotels-community-content-common-"
//				+ "ContextualCTA__currentOption--3Wd5D']")).click();
		
		
		
		TripAdvisorHotelReviewPage trhp=new TripAdvisorHotelReviewPage(driver);
		//to scroll till the page appears
		
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[@id='REVIEWS']")));
		Utility.scrollTillWebelement(driver, trhp.reviewstabWebelement());
		Utility.staticWait(3);
		
//		GenericUtility.elementVisibledynamicwait(driver, 20, "linkText", "Write a review");
		
		trhp.hotelreview();
		Utility.staticWait(3);
		
		//sw to 3rd tab
//		ArrayList<String> windowHandles2 = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(windowHandles2.get(2));
		Utility.swtichToTab(driver, 3);
		
		//To click on write hotel review
				
		//added for testing
//		driver.get("https://www.tripadvisor.in/UserReviewEdit-g641714-d1156207-Club_Mahindra"
//				+ "_Madikeri_Coorg-Madikeri_Kodagu_Coorg_Karnataka.html");
		
		
		
		//property rating
		   WebElement pRating = driver.findElement(By.id("bubble_rating"));
		   Utility.mouseHover(driver, pRating);
		  driver.findElement(By.id("bubble_rating")).click();
		  
		  
		
		  //Enter the 
//		  driver.findElement(By.id("ReviewTitle")).sendKeys("Good place to stay");
//		  driver.findElement(By.id("ReviewText")).sendKeys("Rooms facility are nice , "
//		  		+ "great place to live have more time to spend here  "
//		  		+ "It�s good and exciting adventure and even the good show "
//		  		+ "for evening and good hospitality and good motivational staff the evening...");
		  TripAdvisorHotelUserReviewPage urp=new TripAdvisorHotelUserReviewPage(driver);
		  
		  urp.reviewTitleText(reviewTitleText);
		  urp.reviewText(reviewText);
		 
		  
		  
//		  WebElement hserviceR = driver.findElement(By.id("qid12_bubbles"));
//		  GenericUtility.mouseHover(driver, hserviceR);
//		  driver.findElement(By.xpath("//*[@class='answersBubbles ui_bubble_rating fl qid12 bubble_50']")).click();
//		  
//		  WebElement sQaulityR = driver.findElement(By.id("qid190_bubbles"));
//		  GenericUtility.mouseHover(driver, sQaulityR);
//		  driver.findElement(By.xpath("//*[@class='answersBubbles ui_bubble_rating fl qid190 bubble_50']")).click();
//		  
//		  WebElement hrv = driver.findElement(By.id("qid13_bubbles"));
//		  GenericUtility.mouseHover(driver, hrv);
//		  driver.findElement(By.xpath("//*[@class='answersBubbles ui_bubble_rating fl qid13 bubble_50']")).click();
		  
		  
//		  driver.findElement(By.xpath("//input[@id='noFraud']")).click();
		 Utility.scrollTillWebelement(driver, urp.submitReviewSectionWebelement());
		  urp.submitReviewCheckbox();
		
	}
	
			
}	
