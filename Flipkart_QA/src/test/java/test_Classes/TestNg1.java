
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

	import pom_Pages.CancelAndreturn;
	import pom_Pages.Flipkart_HomePage;
	import setup.Base;
	import utils.Utility;

	public class TestNg1 extends Base {
		private WebDriver driver;
		static ExtentHtmlReporter reporter;
		int testId;
		private SoftAssert soft;
		private CancelAndreturn cancel;
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
			 cancel = new CancelAndreturn(driver);
		}
		
		@BeforeMethod
		public void launchUrl() {
			
			driver.get("https://www.flipkart.com/");
			hpage.closepopup();
			hpage.opencancelandReturn();
			soft = new SoftAssert();
		}
		 @Test
		 public void verifyViewMore() throws IOException {
		 testId = 2001;
		 cancel.seeMore();
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 soft.assertEquals(url, "https://www.flipkart.com/helpcentre?catalog=55c9c6edb000002e002c1701&view=CATALOG");
		 soft.assertEquals(title, "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com");
		 Utility.captureScreenshot(driver, testId);
		 }
		 
		
		 @AfterMethod
		 public void logoutFromApplication() {
			 System.out.println("Aftermethod");
			 System.out.println("Logout Application");
			 
		 }
		 
		 @AfterClass
		 public void cleanPOMObject() {
			 hpage = null;
			 cancel = null;
			 System.out.println("Afterclass");
		 }
		 @AfterTest
		 public void closebrowser() {
			 driver.quit();
			 driver = null;
			 System.gc();
			 System.out.println("AfterTest");
		 }
	}


	
	

