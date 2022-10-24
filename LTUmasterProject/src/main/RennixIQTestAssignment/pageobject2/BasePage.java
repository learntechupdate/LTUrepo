package pageobject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BasePage {
	
	
public WebDriver driver;
	
	//Data Members-----------
	@FindBy(xpath="//span[contains(text(),'Search')]")
  	private WebElement serachButton1;
	
	@FindBy(id="mainSearch")
  	private WebElement mainSearchTextfield;
	
	@FindBy(id="SEARCH_BUTTON")
  	private WebElement searchButton2;
	
	@FindBy(xpath="(//div[@class='result-title'])[1]")
  	private WebElement FirstSearchResultLink;
	
	
	//----------------------
	
	//Initializing the  Constructor
    public BasePage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
   //---------------------------- 

    
  //Member Functions----------------
    
    public void searchHotel(String searchHotel)
  	{
    	serachButton1.click();
    	mainSearchTextfield.sendKeys(searchHotel);
    	searchButton2.click();
    	
  	}
    public void openFirstSearchResult() {
    	FirstSearchResultLink.click();
    }
   
    //-----------------------------
    
}
