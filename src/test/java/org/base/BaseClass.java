package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver chromeDriver() {
		
		 driver=new ChromeDriver();
		return driver;
	}
	
	public static WebDriver fireBox() {
		 driver=new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver browserLaunch(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firebox")) {
			 driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			 driver=new EdgeDriver();
		}
		return driver;

	}
	
	public static WebDriver browserName(String browsername) {
		switch (browsername) {
		case "chrome":
			 driver=new ChromeDriver();	
			break;
			
		case "edge":
			 driver=new EdgeDriver();	
			break;	

		case "firefox":
			 driver=new FirefoxDriver();	
			break;	
			
		default:
			System.err.println("Invalid brwoser name");
		}
		return driver;

	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	public static void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public static void sendKeys(WebElement e,String value) {
		e.sendKeys(value);

	}
	
	public static void click(WebElement e) {
		e.click();

	}
	
	public static String getCurrentUrl() {
//		String url = driver.getCurrentUrl();
//		return url;
		return driver.getCurrentUrl();
	}
	
	public static String getTitle() {
//		String url = driver.getCurrentUrl();
//		return url;
		return driver.getTitle();
	}
	
	public static String getText(WebElement e) {
		return e.getText();

	}
	
	public static String getattribute(WebElement e) {
		return e.getAttribute("value");

	}
	
	public static void quit() {
		driver.quit();

	}
	
	public static void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();

	}
	
	public static void dragAndDrop(WebElement source,WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();

	}
	
	public static void selectByIndex(WebElement e,int a) {
		Select s=new Select(e); 
		s.selectByIndex(a);

	}
	
	public static boolean isSelected(WebElement e) {
		boolean selected = e.isSelected();
		return selected;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
