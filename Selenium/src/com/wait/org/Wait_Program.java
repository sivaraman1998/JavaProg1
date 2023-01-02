package com.wait.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Program {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\raman\\OneDrive\\Documents\\Eclipse\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sivaraman");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("S");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		WebElement pass1 = driver.findElement(By.id("firstpassword"));
		pass1.sendKeys("siva@123");
		
//		WebDriverWait wait=new WebDriverWait (driver,50);
//		wait.until(ExpectedConditions.visibilityOf(pass1));
		
		driver.findElement(By.id("secondpassword")).sendKeys("siva@123");
	}

}
