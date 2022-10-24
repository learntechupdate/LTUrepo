package pageobject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import library.GenericUtility;

public class TripAdvisorHotelUserReviewPage extends BasePage {
	
	
public WebDriver driver;
	
	//Data Members-----------
	
	@FindBy(id="bubble_rating")
  	private WebElement propertyRatingButton;
	
	@FindBy(id="ReviewTitle")
  	private WebElement reviewTitleTextfeild;
	
	@FindBy(id="ReviewText")
  	private WebElement reviewTextTextfeild;
	
	
	@FindBy(xpath="//input[@id='noFraud']")
  	private WebElement submitReviewCheckbox;
	
	@FindBy(xpath="//div[contains(text(),'Submit your review')]")
  	private WebElement submitReviewSection;
	
	
	

//	   GenericUtility.mouseHover(driver, pRating);
//	  driver.findElement(By.xpath("//*[@class='ui_bubble_rating fl bubble_50']")).click();
		
	//----------------------
	
	//Initializing the  Constructor
    public TripAdvisorHotelUserReviewPage(WebDriver driver)
    {
    	super(driver);
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
   //---------------------------- 

    
  //Member Functions----------------
    
    public void HoverRating(int Starrating) {
    }
    
    public void reviewTitleText(String reviewTitleText) {
    	reviewTitleTextfeild.sendKeys(reviewTitleText);
    }
    
    public void reviewText(String reviewText) {
    	reviewTextTextfeild.sendKeys(reviewText);
    	
    	
    }
    
    public void submitReviewCheckbox( ) {
    	submitReviewCheckbox.click();;
    	
    	
    }
    
    public WebElement submitReviewSectionWebelement() {
		return submitReviewSection;
    	
    }
    
    
   
    //-----------------------------
    
    
    
    
}
