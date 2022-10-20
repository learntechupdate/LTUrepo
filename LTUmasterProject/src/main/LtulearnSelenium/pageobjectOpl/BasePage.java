package pageobjectOpl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	
public WebDriver driver;
	
	//Data Members-----------
	@FindBy(linkText="Login")
  	private WebElement loginTab;
	
	//----------------------
	
	//Initializing the  Constructor
    public BasePage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
   //---------------------------- 

    
  //Member Functions----------------
    public void logintab()
  	{
  		loginTab.click();
  	}
    //-----------------------------
    
}
