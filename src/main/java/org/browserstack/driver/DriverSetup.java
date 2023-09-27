package org.browserstack.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class DriverSetup {
	public static WebDriver driver;

	@BeforeMethod
	public static WebDriver getDriver() {
			  ChromeOptions options = new ChromeOptions();
	        options.addArguments("start-maximized");
	        driver = new ChromeDriver(options);
	        driver.get("https://demo.applitools.com/");
		return driver;
	}
	@AfterMethod
	public static void tearDownDriver() {
		driver.quit();
	}
}
