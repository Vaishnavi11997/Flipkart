package pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelAndreturn {
	
	
	@FindBy (xpath = "//span[text()='View More']")
	private WebElement viewmore;

	
	public CancelAndreturn(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	

	public void seeMore() {
		
		viewmore.click();
		
	}
}
