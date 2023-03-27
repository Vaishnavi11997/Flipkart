package pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	@FindBy (xpath = "//button[text()='Buy Now']")
	private WebElement buyNow;
	
	
	public AddToCartPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void openaddToCart() {
		
		buyNow.click();
	}
	

}

