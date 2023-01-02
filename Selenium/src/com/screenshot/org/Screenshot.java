package com.screenshot.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\raman\\OneDrive\\Documents\\Eclipse\\Selenium\\Driver\\chromedriver.exe");
		  
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.instagram.com/accounts/login/");
		   driver.manage().window().maximize();
		   Thread.sleep(12000);
		   
		   TakesScreenshot ss =(TakesScreenshot) driver;
		   File source = ss.getScreenshotAs(OutputType.FILE);
		   File dest = new File("C:\\Users\\raman\\OneDrive\\Documents\\Eclipse\\Selenium\\Screenshot\\insta.png");
		   FileUtils.copyFile(source, dest);
	}

}
