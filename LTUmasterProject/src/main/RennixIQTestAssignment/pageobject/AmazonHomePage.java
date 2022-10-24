package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AmazonHomePage extends BasePage{
	
	
public WebDriver driver;
	
	//Data Members-----------
	@FindBy(id="twotabsearchtextbox")
  	private WebElement serachtextFeild;
	
	@FindBy(xpath="//input[@value='Go']")
  	private WebElement searchButton;
	
	@FindBy(xpath="(//*[@class='a-price-whole'])[1]")  //independent dependent xpath
  	private WebElement phonePriceText;
	
	
	//----------------------
	
	//Initializing the  Constructor
    public AmazonHomePage(WebDriver driver)
    {
    	super(driver);
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
   //---------------------------- 

    
  //Member Functions----------------
    @Override
    public void searchphone(String phoneModel)
  	{
    	serachtextFeild.sendKeys(phoneModel);
    	searchButton.click();
  	}
   
    @Override
    public String getphoneprice()
  	{
    	return phonePriceText.getText();
    	
  	}
    
    
    //-----------------------------
    
}
