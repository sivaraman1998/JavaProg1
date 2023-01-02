package com.webdriver.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Example {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\OneDrive\\Documents\\Eclipse\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().to("https://www.snapdeal.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
	}
}
