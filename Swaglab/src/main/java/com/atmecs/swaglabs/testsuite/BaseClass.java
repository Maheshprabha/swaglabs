package com.atmecs.swaglabs.testsuite;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import com.atmecs.swaglabs.filepath.FilePath;
import com.atmecs.swaglabs.utils.LocationReader;

public class BaseClass {
	Properties property;
	public WebDriver driver;
    
	@BeforeTest
	public void invokeBrowser(String browser) throws Exception {
		property = LocationReader.readLocation(FilePath.Config_Path);
		// CommonHelpers.implicitWait(driver);
		String baseUrl = property.getProperty("Url");
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", FilePath.Chrome_Path);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefiox")) {
			System.setProperty("webdriver.gecko.driver", FilePath.Fire_Fox);
			driver = new FirefoxDriver();
		
		System.out.println(baseUrl);
		driver.get(baseUrl);
		// CommonHelpers.implicitWait(driver);
		driver.manage().window().maximize();
	}
}
}
