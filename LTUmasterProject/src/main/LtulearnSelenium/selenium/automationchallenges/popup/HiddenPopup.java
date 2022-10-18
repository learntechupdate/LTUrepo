package selenium.automationchallenges.popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Automation.LTU.BaseTestGeneric;
import Automation.LTU.BrowserFactory;


public class HiddenPopup extends BaseTestGeneric{
	
	
	@Test
	public void alertdemo() {
		
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId")));
        
		BrowserFactory.enterUrl("https://login.onepaperlane.org/user/listing");
		
		driver.findElement(By.xpath("//*[contains(text(),'Employee')  and  @class='user_category user_real_category']")).click();
		
		
		List<WebElement> delref = driver.findElements(By.xpath("//a[@title='Remove User']"));
		
		delref.get(1).click();
		
		
		//cancel deletion
        System.out.println("cancel deletion");
		driver.findElement(By.id("popup_cancel")).click();
		
		
		//delete user
		System.out.println("delete user");
		delref.get(4).click();
		driver.findElement(By.id("popup_ok")).click();
		
		
	}
	
	
	

}
