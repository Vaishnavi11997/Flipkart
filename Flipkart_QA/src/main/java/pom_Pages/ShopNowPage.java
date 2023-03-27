package pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopNowPage {

	@FindBy (xpath = "//span[text()='Shop now']")
	private WebElement shopNow;
	
   public ShopNowPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
  public void openshopNow() {
	shopNow.click();
		
	}
	
	
}
