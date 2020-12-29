package com.atmecs.swaglabs.helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.swaglabs.filepath.FilePath;

public class CommonHelpers {
	public static String pageTittle;
	public static String currentUrl;

	public static void SendkeysAction(WebDriver driver, String elementPath, String value) {
		driver.findElement(By.xpath(elementPath)).sendKeys(value);
	}

	public static void clickAction(WebDriver driver, String elementPath) {
		driver.findElement(By.xpath(elementPath)).click();
	}

	public static void getTittle(WebDriver driver, String elementPath, String Value) {
		pageTittle = driver.getTitle();
		return;
	}

	public static void getUrl(WebDriver driver, String elementPath, String Value) {
		currentUrl = driver.getCurrentUrl();

	}

	public static void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(FilePath.page_load_timeout, TimeUnit.SECONDS);
	}

	public static void explicitWait(WebDriver driver, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, FilePath.page_load_timeout);
		WebElement element;
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		element.click();
	}

}
