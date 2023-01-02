package com.alert.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\raman\\OneDrive\\Documents\\Eclipse\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simple.click();
		Thread.sleep(2000);
		
		org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
		((org.openqa.selenium.Alert) alert1).accept();
		
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		WebElement confirm = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirm.click();
		Thread.sleep(2000);
		
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		WebElement prompt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		prompt.click();
		Thread.sleep(2000);
		
		org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Sivaraman");
		alert3.accept();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
