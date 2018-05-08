package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("/Users/Shubham_MacbookPro/eclipse-workspace/"
				+ "BDDCucumberPOM/src/main/java/com/config/config.properties");
			prop.load(fis);
		}
		catch (IOException e) {
			e.getMessage();
		}
	}
	
	public static void initiallization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/Shubham_MacbookPro/Desktop/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		} 
		
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	
}
	public static void tearDown() {

	try{
		    driver.quit();
		   }catch (Exception e){
		      System.out.println("Unable to close the browser");
		      }
	}
}
