package com.browserlaunch.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\raman\\OneDrive\\Documents\\Eclipse\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.get("https://youtube.com/");
		
		driver.navigate().refresh();
		
		driver.get("https://www.instagram.com/");
		
		driver.navigate().back();
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.get("https://www.instagram.com/");
		driver.navigate().refresh();
		
		driver.close();
		
		
	}

}
