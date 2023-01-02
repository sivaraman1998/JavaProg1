package com.webelement.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\raman\\OneDrive\\Documents\\Eclipse\\Selenium\\Driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("ramansiva1998@gmail.com");
		
		boolean displayed = emailId.isDisplayed();
		System.out.println(displayed);
		
		String attribute = emailId.getAttribute("name");
		System.out.println(attribute);
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("siva123");
		
		String attribute1 = pass.getAttribute("value");
		System.out.println(attribute1);
		
		boolean enabled = pass.isEnabled();
		System.out.println(enabled);
		
		WebElement log=driver.findElement(By.name("login"));
		log.click();
		
		boolean selected = log.isSelected();
		System.out.println(selected);
	}

}
