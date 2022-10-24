package pageobject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class TripAdvisorHotelReviewPage extends BasePage {
	
	
public WebDriver driver;
	
	//Data Members-----------
	@FindBy(linkText="Write a review")
  	private WebElement hotelReviewButton;
	
	
	
	@FindBy(xpath="//div[@id='REVIEWS']")
  	private WebElement reviewstab;
		
	//----------------------
	
	//Initializing the  Constructor
    public TripAdvisorHotelReviewPage(WebDriver driver)
    {
    	super(driver);
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
   //---------------------------- 

    
  //Member Functions----------------
    //return webelement to scroll
    public WebElement reviewstabWebelement(){
    	return reviewstab;
    }
    public void hotelreview() {
    	hotelReviewButton.click();
    }
   
    //-----------------------------
    
}
