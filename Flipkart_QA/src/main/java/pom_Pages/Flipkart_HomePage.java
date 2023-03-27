package pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_HomePage {
	WebDriver driver;
	//declare data member inside the class with private access specifier
	//button[@class='_2KpZ6l _2doB4z']
	
    @FindBy (xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closebutton;
	
	@FindBy (xpath = "//input[@title='Search for products, brands and more']")
	private WebElement searchfield;
	
	
	@FindBy ( xpath = "//button[@class='L0Z3Pu']")
	private WebElement searchaicon;
	
	@FindBy ( xpath = "//span[text()='Cart']")
	private WebElement cart;
	
	@FindBy ( xpath = "//a[text()='Cancellation & Returns']")
	private WebElement cancellationReturn;
	
	
	
	
	//initialize data member within public constructor 
	public Flipkart_HomePage (WebDriver driver) {
		
		//global=local
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	 //action on methods
	
	public void closepopup(){
		closebutton.click();
		
	}
	public void serchitems() {
		//searchfield.click();
		searchfield.sendKeys(" shoes");
		searchaicon.click();
		
	}
	
	public void openCart() {
		cart.click();
			
	}
	
	public void opencancelandReturn() {
	
		cancellationReturn.click();
	}

	
		
	}
	
	


