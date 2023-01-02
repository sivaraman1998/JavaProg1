package com.dropdown.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\raman\\OneDrive\\Documents\\Eclipse\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testleaf.herokuapp.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s=new Select(multiple);
		boolean multiple2 = s.isMultiple();
		System.out.println(multiple2);
		
		s.selectByValue("1");
		s.selectByIndex(2);
		s.selectByVisibleText("Loadrunner");
		
		System.out.println("***All Options***");
		
		List<WebElement> allSelectedOptions = s.getOptions();
		for (WebElement allSelected : allSelectedOptions) {
				String text = allSelected.getText();
				System.out.println(text);
		}
	}
	
}
