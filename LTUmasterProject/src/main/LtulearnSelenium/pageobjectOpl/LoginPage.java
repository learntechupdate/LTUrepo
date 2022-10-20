package pageobjectOpl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

	
	//Data Members--------
		@FindBy(id="email")
	  	private WebElement userEmailTextFeild;
		
		@FindBy(xpath="//*[@value='Continue']")
	  	private WebElement continueButton;
		
		@FindBy(name="password")
	  	private WebElement passwordTextFeild;
		
		@FindBy(linkText="One Paper Lane")
	  	private WebElement loginButton;
	//--------------------
	
	//Initializing and extending the base page by calling super method
	public LoginPage(WebDriver driver) {
		super(driver);//to constructor chaining
		this.driver=driver;
    	PageFactory.initElements(driver, this);
	}
	//----------------
	
	//Member Functions------------------------------
	
	//
	
	public void loginViaOplCredentials(String userEmail, String password)
	{
		
		username(userEmail);
		continueButton();
		password(password);
		loginButton();
	}
    private void username(String userEmail)
  	{
    	userEmailTextFeild.sendKeys(userEmail);
  	}
    
    private void continueButton()
  	{
    	continueButton.click();
  	}
    
    private void password(String password)
  	{
    	passwordTextFeild.sendKeys(password);
  	}
    
    private void loginButton()
  	{
    	loginButton.click();
  	}
	

}
