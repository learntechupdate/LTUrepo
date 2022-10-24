package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FlipkartHomePage extends BasePage{
	
	
public WebDriver driver;
	
	//Data Members-----------
    @FindBy(xpath="//*[@class='_2AkmmA _29YdH8']")
	private WebElement loginpageClosebutton;

	@FindBy(xpath="//*[@title='Search for products, brands and more']")
  	private WebElement serachtextFeild;
	
	@FindBy(xpath="//*[@title='Search for products, brands and more']/../../button")
  	private WebElement searchButton;
	
	@FindBy(xpath="(//div[@class='_1vC4OE _2rQ-NK'])[1]")
  	private WebElement phonePriceText;
	
	
	
	//----------------------
	
	//Initializing the  Constructor
    public FlipkartHomePage(WebDriver driver)
    {
    	super(driver);
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
   //---------------------------- 

    
  //Member Functions----------------
    public void closeloginpage() {
    	loginpageClosebutton.click();
    }
    
    @Override
    public void searchphone(String phoneModel)
  	{
    	closeloginpage();
    	serachtextFeild.sendKeys(phoneModel);
    	serachtextFeild.sendKeys(Keys.ENTER);
//    	searchButton.click();
  	}
   
    @Override
    public String getphoneprice()
  	{
    	return phonePriceText.getText();
    	
  	}
    
    
    //-----------------------------
    
}
