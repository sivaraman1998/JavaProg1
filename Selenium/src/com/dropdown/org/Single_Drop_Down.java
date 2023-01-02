package com.dropdown.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\raman\\OneDrive\\Documents\\Eclipse\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement create=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	create.click();
	
	Thread.sleep(5000);
	
	WebElement day = driver.findElement(By.id("day"));
	Select s=new Select(day);
	s.selectByValue("2");
	
	WebElement month=driver.findElement(By.id("month"));
	Select s1=new Select(month);
	s1.selectByIndex(4);
	
	WebElement year = driver.findElement(By.id("year"));
	Select s2=new Select(year);
	s2.selectByVisibleText("2022");
		
	}

}
