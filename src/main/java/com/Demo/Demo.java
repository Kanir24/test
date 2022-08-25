package com.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");	
		driver.manage().window().setSize(new Dimension(1366, 728));
		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		driver.findElement(By.id("quantity_wanted")).click();
		driver.findElement(By.id("quantity_wanted")).sendKeys("2");
		driver.findElement(By.id("group_1")).click();
		WebElement dropdown = driver.findElement(By.id("group_1"));
		dropdown.findElement(By.xpath("//option[. = 'M']")).click();
		driver.findElement(By.id("color_14")).click();
		driver.findElement(By.cssSelector(".exclusive > span")).click();
		//driver.findElement(By.cssSelector(".continue > span")).click();
		driver.findElement(By.cssSelector("#\\31_4_0_0 > .icon-trash")).click();
		driver.findElement(By.cssSelector(".icon-home")).click();
		driver.findElement(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(1) .button:nth-child(1) > span")).click();
		driver.findElement(By.cssSelector(".button-medium > span")).click();
		driver.findElement(By.cssSelector(".icon-home")).click();
		driver.findElement(By.cssSelector(".shopping_cart > a")).click();
		driver.findElement(By.cssSelector("#\\31_4_0_0 > .icon-trash")).click();
		driver.findElement(By.cssSelector(".icon-trash")).click();
		driver.findElement(By.cssSelector(".icon-home")).click();	
		

	}

}
