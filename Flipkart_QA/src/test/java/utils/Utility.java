package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	
	public static void captureScreenshot(WebDriver driver,int testId) throws IOException {
		
		SimpleDateFormat  format = new SimpleDateFormat("dd-MM-yy_hh-mm-ss");
		Date date = new Date();
		String df = format.format(date);
		
		TakesScreenshot take = (TakesScreenshot) driver;
		File src = take.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\Flipkart_QA\\Screenshot\\Screenshot"+testId+" "+df+".jpg");
		FileHandler.copy(src, dest);
	}
}
