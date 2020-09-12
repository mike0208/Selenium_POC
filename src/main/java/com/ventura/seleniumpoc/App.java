package com.ventura.seleniumpoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

/**
 * Hello world!
 *
 */
public class App {
	
	static WebDriver driver;
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver");
		ChromeOptions  options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1920,1080");
		
		driver = new ChromeDriver(options);
		driver.get("https://www.bing.com/");
		driver.findElement(By.id("sb_form_q")).sendKeys("Intellipaat");

		WebElement svgObject = driver.findElement(By.xpath("//*[name()='svg']//*[name()='circle']"));
		Actions builder = new Actions(driver);
		builder.click(svgObject).build().perform();
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
