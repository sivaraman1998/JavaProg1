package com.webelement.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\raman\\OneDrive\\Documents\\Eclipse\\Selinium\\Driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement emailId=driver.findElement(By.id("email"));
		emailId.sendKeys("ramasiva1998@gmail.com");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("siva123");
		
		WebElement log=driver.findElement(By.name("login"));
		log.click();
		
		
	}

}
