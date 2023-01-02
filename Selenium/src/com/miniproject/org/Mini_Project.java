package com.miniproject.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FileUtilsCopyToFileTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\raman\\OneDrive\\Documents\\Eclipse\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("Sivaraman1998");
		driver.findElement(By.id("password")).sendKeys("9444722630");
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		WebElement loc = driver.findElement(By.id("location"));
		Select s1=new Select(loc);
		s1.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s2=new Select(hotels);
		s2.selectByValue("Hotel Sunshine");
		Thread.sleep(2000);
		
		WebElement type = driver.findElement(By.id("room_type"));
		Select s3=new Select(type);
		s3.selectByVisibleText("Double");
		Thread.sleep(2000);
		
		WebElement num = driver.findElement(By.id("room_nos"));
		Select s4=new Select(num);
		s4.selectByVisibleText("3 - Three");
		Thread.sleep(2000);
		
		driver.findElement(By.id("datepick_in")).sendKeys("22/11/2022");
		driver.findElement(By.id("datepick_out")).sendKeys("22/11/2023");
		Thread.sleep(2000);
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s5=new Select(adult);
		s5.selectByVisibleText("4 - Four");
		Thread.sleep(2000);
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s6=new Select(child);
		s6.selectByVisibleText("2 - Two");
		Thread.sleep(5000);
	
		driver.findElement(By.id("Submit")).click();
		
		WebElement sel = driver.findElement(By.id("radiobutton_0"));
		sel.click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("first_name")).sendKeys("Sivaraman");
		driver.findElement(By.id("last_name")).sendKeys("S");
		driver.findElement(By.id("address")).sendKeys("99A, Senaiyar Street, Urkadu, Ambasamudram(TK), Tirunelveli(DT).");
		driver.findElement(By.id("cc_num")).sendKeys("5241523652844542");
		
		WebElement credit = driver.findElement(By.id("cc_type"));		
		Select s7=new Select(credit);
		s7.selectByValue("MAST");
		
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select s8=new Select(month);
		s8.selectByVisibleText("March");
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s9=new Select(year);
		s9.selectByValue("2022");
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("1334");
		Thread.sleep(3000);
		
		driver.findElement(By.id("book_now")).click();	
		Thread.sleep(5000);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\raman\\OneDrive\\Documents\\Eclipse\\Selenium\\Screenshot\\hotel.png");
		FileUtils.copyFile(source, dest);
	}	
}
