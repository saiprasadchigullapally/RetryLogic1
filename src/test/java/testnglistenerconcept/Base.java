package testnglistenerconcept;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	
	public static void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}

	public void failled(String testMethodName) {
		
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrfile, new File("E:/myselenium/RetryLogic1/screenshots/"+testMethodName+"_"+".jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
}
