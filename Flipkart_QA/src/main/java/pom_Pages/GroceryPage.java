package pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroceryPage {

	@FindBy (xpath = "//div[text()='Grocery']")
	private WebElement grocery;
	
	
	
	public GroceryPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void openGrocery() {
		grocery.click();
		
	}
	
  
	
}
