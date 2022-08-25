package com.assignment.TestngPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGPOM {
	
	private ChromeDriver driver;
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}
	
	public class Class1 {
	@Test
	public void AddCart(String quantity) {
		driver.manage().window().setSize(new Dimension(1366, 728));
		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		driver.findElement(By.id("quantity_wanted")).click();
		driver.findElement(By.id("quantity_wanted")).sendKeys("2");
		driver.findElement(By.id("group_1")).click();
		WebElement dropdown = driver.findElement(By.id("group_1"));
		dropdown.findElement(By.xpath("//option[. = 'M']")).click();
		driver.findElement(By.id("color_14")).click();
		driver.findElement(By.cssSelector(".exclusive > span")).click();
		driver.findElement(By.cssSelector(".continue > span")).click();
		driver.findElement(By.cssSelector(".icon-home")).click();
	}
	}
	
	class Class2{
	@Test(priority = 2)
	public void RemoveCart() {
		driver.findElement(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(1) .button:nth-child(1) > span")).click();
		driver.findElement(By.cssSelector(".button-medium > span")).click();
		driver.findElement(By.cssSelector(".icon-home")).click();
		driver.findElement(By.cssSelector(".shopping_cart > a")).click();
		driver.findElement(By.cssSelector("#\\31_4_0_0 > .icon-trash")).click();
		driver.findElement(By.cssSelector(".icon-trash")).click();
		driver.findElement(By.cssSelector(".icon-home")).click();
	}
	}
	
	class Class3{
	@Test(priority = 3)
	public void SearchPositive(String Search1) {
		driver.findElement(By.id("search_query_top")).click();
		WebElement element = driver.findElement(By.cssSelector(".row > a > .img-responsive"));
		Actions builder = new Actions(driver);
	    builder.moveToElement(element).perform();
	    driver.findElement(By.id("search_query_top")).sendKeys("Blouse");
	    driver.findElement(By.name("submit_search")).click();
	    driver.findElement(By.cssSelector(".icon-home")).click();
	}
	
	@Test(priority = 4)
	public void SearchNegative(String Search2) {
		driver.findElement(By.id("search_query_top")).click();
	    driver.findElement(By.id("search_query_top")).sendKeys("Negative");
	    driver.findElement(By.name("submit_search")).click();
	    driver.findElement(By.cssSelector(".icon-home")).click();
	}
	}
	
	@AfterSuite
	public void tearDown() {		
		driver.quit();
	}

}
