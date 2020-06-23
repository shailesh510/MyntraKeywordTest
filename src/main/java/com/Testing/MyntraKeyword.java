package com.Testing;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.TestingSearchComponent.myntraSearchComponent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraKeyword extends Constants {
	static Logger log = Logger.getLogger(MyntraKeyword.class);
	

	public static void openBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		
		  case "HtmlUnit": driver = new HtmlUnitDriver(); 
		  break;
		 
		default:
			log.info("Open the Browser");
			break;
		}
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
		log.info("window maximize");
	}

	public static void deleteCookies() {
		driver.manage().deleteAllCookies();
	}

	public static void openUrl(String url) {
		driver.get("https://www.myntra.com/");
		log.info("open Url");

	}

	public static void pageLoadTimeOut() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	public static void implictWait() {
		log.info("wait for 10 seconds");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public static void close() {
		log.info("Close the Browser");
		driver.close();

	}

	public static WebElement getElement(String locatorType, String LocatorVlaue) {
		WebElement element = null;
		switch (locatorType) {
		case "xpath":
			element = driver.findElement(By.xpath(LocatorVlaue));
			break;
		case "name":
			element = driver.findElement(By.name(LocatorVlaue));
			break;
		case "id":
			element = driver.findElement(By.id(LocatorVlaue));
			break;
		case "cssselector":
			element = driver.findElement(By.cssSelector(LocatorVlaue));
			break;
		case "classname":
			element = driver.findElement(By.className(LocatorVlaue));
			break;
		case "linktext":
			element = driver.findElement(By.linkText(LocatorVlaue));
			break;
		case "partiallinktext":
			element = driver.findElement(By.partialLinkText(LocatorVlaue));
			break;
		default:
			log.info("invalid locatore Enter");
			break;
		}
		return element;

	}

	public static void enterText(String locatorType, String LocatorVlaue, String sendvalue) {
		getElement(locatorType, LocatorVlaue).sendKeys(sendvalue);

	}

	public static void performClick(String locatorType, String LocatorVlaue) {
		getElement(locatorType, LocatorVlaue).click();

	}

	public static void MouseMoveToLocation(String locatorType, String LocatorVlaue) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locatorType, LocatorVlaue)).build().perform();

	}

	public static void isDisplayed(String locatorType, String LocatorVlaue) {
		getElement(locatorType, LocatorVlaue).isDisplayed();
	}
	public static void pageScroll() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,700)");
	}
	/**/

}