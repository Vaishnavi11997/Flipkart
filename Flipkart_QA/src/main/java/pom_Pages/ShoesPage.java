package pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoesPage {
	
	@FindBy (xpath = "(//img[@class='_2r_T1I'])[1]")
	private WebElement whiteShoes;
	
	public ShoesPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void selectWshoes() {
		
		whiteShoes.click();
	}
	
	
	
	

}
