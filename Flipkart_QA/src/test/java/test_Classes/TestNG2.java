package test_Classes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import pom_Pages.Flipkart_HomePage;
import pom_Pages.GroceryPage;
import pom_Pages.ShopNowPage;
import setup.Base;
import utils.Utility;


	public class TestNG2 extends Base {
		private WebDriver driver;
		static ExtentHtmlReporter reporter;
		int testId;
		private SoftAssert soft;
		private GroceryPage groc;
		private ShopNowPage shopnow;
		private Flipkart_HomePage hpage;
		
		@Parameters ("browser")
		@BeforeTest
		
		public void launchBrowser(String browserName) {
			reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
	 		ExtentReports extend = new ExtentReports();
	 		extend.attachReporter(reporter);	
	 		
	 		if(browserName.equals("Chrome")) {
	 			
	 			driver= openchromebrowser();
	 		}
	 		
            if(browserName.equals("Firefox")) {
	 			
	 			driver= openFirefoxbrowser();
	 		}
	 		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		}
		
		
		@BeforeClass
		public void createPOMObject() {
		
			 hpage = new Flipkart_HomePage(driver);
			 groc = new GroceryPage(driver);
			 shopnow = new ShopNowPage(driver);
			
		}
		@BeforeMethod
		public void launchurl() throws InterruptedException {
			
			driver.get("https://www.flipkart.com/");
			hpage.closepopup();
			hpage.openCart();
			Thread.sleep(3000);
			groc.openGrocery();	

			soft = new SoftAssert();
		}
        @Test
        public void verifyShopNowButton() throws IOException, InterruptedException {
        	testId = 3001;
        	Thread.sleep(3000);
        	shopnow.openshopNow();
        	String url = driver.getCurrentUrl();
        	System.out.println(url);
        	String title = driver.getTitle();
        	System.out.println(title);
        	
        	soft.assertEquals(url, "https://www.flipkart.com/grocery-supermart-store?marketplace=GROCERY");
        	soft.assertEquals(title, "Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com"); 
        	Utility.captureScreenshot(driver, testId);
        }
        @AfterMethod
        public void logoutApplication() {
        	System.out.println("LogoutFromApplication");
        }
        @AfterClass
        public void clearPOMObjects() {
        	hpage = null;
        	groc = null;
        	shopnow = null;
        	System.out.println("Afterclass");
        }
        @AfterTest
        public void closeBrowser() {
        	driver.quit();
        	driver = null;
        	System.gc();
        	System.out.println("AfterTest");
        }
	}
