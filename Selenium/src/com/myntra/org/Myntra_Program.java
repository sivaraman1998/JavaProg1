package com.myntra.org;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Program {

	static WebDriver driver;

	public static void getProducts() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raman\\OneDrive\\Documents\\Eclipse\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");

		int size1 = driver.findElements(By.xpath("//li[@class=\"product-base\"]")).size();
		System.out.println("Total no of products : " + size1);
	}

	public static void getLowPrice() {
		List<WebElement> low = driver.findElements(By.xpath("//span[@class=\"product-discountedPrice\"]"));
		int size1 = low.size();
		System.out.println("Total no of Price lists : "+size1);

		for (WebElement price : low) {
			String text2 = price.getText();
			System.out.println(text2);
		}
	}

	public static void main(String[] args) {

		getProducts();
		getLowPrice();

	}

}
