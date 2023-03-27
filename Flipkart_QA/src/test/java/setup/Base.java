package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	
	public static WebDriver openchromebrowser() {
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Flipkart_QA\\Browser\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    return driver;
	}
	
	public static WebDriver openFirefoxbrowser() {
		
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\AppData\\Local\\Temp\\Temp2_geckodriver-v0.32.2-win64.zip\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    return driver;
		}
	
}
