package test_Classes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_Pages.AddToCartPage;
import pom_Pages.CancelAndreturn;
import pom_Pages.Flipkart_HomePage;
//import pom_Pages.GroceryPage;
//import pom_Pages.ShoesPage;
//import pom_Pages.ShopNowPage;


public class Test_1 {

	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\OneDrive\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		 
		Flipkart_HomePage hpage = new Flipkart_HomePage (driver);	
		
		hpage.closepopup();
		
		Thread.sleep(3000);
		
		hpage.opencancelandReturn();

		
//		ShoesPage spage = new ShoesPage(driver);
//		
//		Thread.sleep(3000);
//		spage.selectWshoes();
//		
//		Thread.sleep(3000);
		
//		AddToCartPage addcart = new AddToCartPage(driver);
//		
//		Thread.sleep(3000);
//		
//		addcart.openaddToCart();
//		hpage.openCart();
//		
//		Thread.sleep(3000);
		
//		GroceryPage gpage = new GroceryPage(driver);
//		
//		Thread.sleep(3000);
//		
//		gpage.openGrocery();
//	
//		Thread.sleep(3000);
//		
//		ShopNowPage snpage = new ShopNowPage(driver);
//		
//		snpage.openshopNow();
		

		Thread.sleep(3000);
		
		CancelAndreturn canReturn = new CancelAndreturn(driver);
		

		Thread.sleep(3000);
		
		
		canReturn.seeMore();
	
		
		driver.quit();
		
	
	}
}
	
	
	
	
	
	

