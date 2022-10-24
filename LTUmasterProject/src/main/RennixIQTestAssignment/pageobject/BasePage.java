package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BasePage {
	
	
public WebDriver driver;
	
	//Data Members-----------
	@FindBy(id="search")
  	private WebElement serachtextFeild;
	
	@FindBy(id="searchButton")
  	private WebElement searchButton;
	
	@FindBy(id="phonepricetext")
  	private WebElement phonePriceText;
	
	//----------------------
	
	//Initializing the  Constructor
    public BasePage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
   //---------------------------- 

    
  //Member Functions----------------
    
    public void searchphone(String phoneModel)
  	{
    	serachtextFeild.sendKeys(phoneModel);
    	searchButton.click();
  	}
   
    public String getphoneprice()
  	{
    	return phonePriceText.getText();
    	
  	}
    //-----------------------------
    
}
