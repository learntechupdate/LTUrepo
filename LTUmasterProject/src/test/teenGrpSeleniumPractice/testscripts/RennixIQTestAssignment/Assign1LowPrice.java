package testscripts.RennixIQTestAssignment;

import org.testng.Reporter;
import org.testng.annotations.Test;

import MasterProject.MasterProject.BaseTest;
import library.RennixIQTestAssignment.EcomPriceComp;
import library.generic.BrowserFactory;
import library.generic.Utility;
import pageobject.RennixIQTestAssignment.AmazonHomePage;
import pageobject.RennixIQTestAssignment.FlipkartHomePage;


public class Assign1LowPrice extends BaseTest{
	
	
	
	
	String amazonURL="https://www.amazon.in";
	String FlipkartURL="https://www.flipkart.com/";
	
	//Test data
	String phoneModel="iPhone XR (64GB) - Yellow";
//	String phoneModel="Realme 5s (Crystal Blue, 128 GB)  (4 GB RAM)";//for testing 
	
	@Test
	public  void lowpricecheck()  
	{
		
		
		// Amazon login
//		driver.get("https://www.amazon.in");
		BrowserFactory.enterUrl(amazonURL);
		
		//testing
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(phoneModel);
//		driver.findElement(By.xpath("//input[@value='Go']")).click();
//		//independent dependent xpath	
//	    String amazonPrice = driver.findElement(By.xpath("(//*[contains(text(),'Apple iPhone XR (64GB) - Yellow')]"
//	    		                                      + "/..)[1 ]/../../../../../..//*[@class='a-price-whole' ]"))
//	    		                               .getText();
//	
//	    System.out.println(amazonPrice);
		
		
		AmazonHomePage azp= new AmazonHomePage(driver);
		azp.searchphone(phoneModel);
		Reporter.log("Amazon price for "+phoneModel+" is : "+azp.getphoneprice(),true);
				
//		int amazonPrices = ExtractNumberFromString.AlpaNumericToInteger(azp.getphoneprice());//price is in alphanumeric String
		
		//We get price in  alphanumeric String converting to int
		int amazonPrices = Utility.AlpaNumericToInteger(azp.getphoneprice());
		
		
		//---------------------// flipkart price check--------------------------------------------------------
//		driver.get("https://www.flipkart.com/");
		BrowserFactory.enterUrl(FlipkartURL);
		
			
		//testing
//		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
//		driver.findElement(By.xpath("//*[@title='Search for products, brands and more']")).sendKeys(phoneModel);
//		driver.findElement(By.xpath("//*[@title='Search for products, brands and more']/../../button")).click();
//		
//		String flipKartprice = driver.findElement(By.xpath("(//*[@class='_1-2Iqu row']/div/div/div)[1]")).getText();
//		System.out.println(flipKartprice);
		
		
		FlipkartHomePage fkp = new FlipkartHomePage(driver);
		fkp.searchphone(phoneModel);
		Reporter.log("Flipkart price for "+phoneModel+" is : "+fkp.getphoneprice(),true);
		
		
			
//		int flipkartprices = ExtractNumberFromString.AlpaNumericToInteger(fkp.getphoneprice());//testing
		int flipkartprices = Utility.AlpaNumericToInteger(fkp.getphoneprice());
		
		
		//testing
//		if (flipkartprices < amazonPrices) {
//			
//			Reporter.log(("Filpkart price is lesser : Rs " + flipkartprices),true);
//			 
//		} else {
//			Reporter.log(("Amazon price is lesser : Rs " + amazonPrices),true);
//		}
				
						
		EcomPriceComp.lowpriceCompare("Amazon", amazonPrices, "Flipkart", flipkartprices);
		
	}
	
			
}	
