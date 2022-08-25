package com.assesment.stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.assesment.pageObject.PageObjects;
import com.assesment.utility.UserDefinedException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDefinition {
	public static ChromeDriver driver;

	@Given("^user launches shopping application$")
	public void User_launches_shopping_application() throws Exception{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println("Browser launched successfully");		
	}

	@When("^user selects the Item (.*)$")
	public void User_selects_the_item(String Item) throws Exception{
		driver.manage().window().setSize(new Dimension(1366, 728));
		try {
			if(Item.equals("Item1")) {
				driver.findElement(By.linkText(PageObjects.OBJ_Item1_Link)).click();				
			}
			else if(Item.equals("Item2")) {
				driver.findElement(By.linkText(PageObjects.OBJ_Item2_Link)).click();			
			}
			else if(Item.equals("Item3")) {
				driver.findElement(By.xpath(PageObjects.OBJ_Item3_Link)).click();				
			}
			else if(Item.equals("Item4")) {
				driver.findElement(By.xpath(PageObjects.OBJ_Item4_Link)).click();				
			}
			else if(Item.equals("Item5")) {
				driver.findElement(By.xpath(PageObjects.OBJ_Item5_Link)).click();				
			}
			else if(Item.equals("Item6")) {
				driver.findElement(By.xpath(PageObjects.OBJ_Item6_Link)).click();				
			}
			else if(Item.equals("Item7")) {
				driver.findElement(By.linkText(PageObjects.OBJ_Item7_Link)).click();				
			}
		}catch (Exception e) {
			throw new UserDefinedException("<<< Not able to select the Item " +Item + ">>>" +e.getMessage());
		}
	}

	@And("^user adds quantity (.*), selects size (.*) and picks color (.*)$")
	public void User_adds_Quantity_selects_Size_picks_Color(String Quantity, String Size, String Color) throws Exception{
		driver.findElement(By.id(PageObjects.OBJ_quantity_Textbox)).sendKeys(Quantity);
		if(Size.equals("Size1")) {
			driver.findElement(By.xpath(PageObjects.OBJ_size1_Dropdown)).click();
		}
		else if(Size.equals("Size2")) {
			driver.findElement(By.xpath(PageObjects.OBJ_size2_Dropdown)).click();
		}
		else if(Size.equals("Size3")) {
			driver.findElement(By.xpath(PageObjects.OBJ_size3_Dropdown)).click();
		}
		if(Size.equals("I1C1")) {
			driver.findElement(By.id(PageObjects.OBJ_Item1color1_Link)).click();
		}
		else if(Size.equals("I1C2")) {
			driver.findElement(By.id(PageObjects.OBJ_Item1color2_Link)).click();
		}
		else if(Size.equals("I2C1")) {
			driver.findElement(By.id(PageObjects.OBJ_Item2color1_Link)).click();
		}
		else if(Size.equals("I2C2")) {
			driver.findElement(By.id(PageObjects.OBJ_Item2color2_Link)).click();
		}
	}

	@And("^user clicks AddtoCart$")
	public void User_clicks_Addcart() throws Exception{
		driver.findElement(By.xpath(PageObjects.OBJ_Addcart_Button)).click();
	}

	@And("^user clicks ContinueShop$")
	public void User_clicks_ContinueShop() throws Exception{
		driver.findElement(By.xpath(PageObjects.OBJ_ContinueShop_Button)).click();
	}

	@And("^user clicks HomeIcon$")
	public void User_clicks_HomeIcon() throws Exception{
		driver.findElement(By.xpath(PageObjects.OBJ_Home_Link)).click();
		driver.quit();
	}
	@And("^user navigates to Cart$")
	public void User_navigates_Tocart() throws Exception{
		driver.findElement(By.xpath(PageObjects.OBJ_Cart_Dropdown)).click();
	}
	
	@And("^user clicks Checkout$")
	public void User_clicks_Checkout() throws Exception{
		driver.findElement(By.xpath(PageObjects.OBJ_CartCheckout_Button)).click();
		//driver.manage().timeouts().wait(50);
	}
	
	@And("^user clicks DeleteIcon$")
	public void User_clicks_DeleteIcon() throws Exception{
		driver.findElement(By.xpath(PageObjects.OBJ_DeleteItem_Link)).click();
	}
	
	@And("^user clicks on SearchTextbox (.*)$")
	public void User_clicks_on_SearchTextbox(String Search) throws Exception{
		driver.findElement(By.id(PageObjects.OBJ_Search_Textbox)).sendKeys(Search);	
	}
	
	@And("^user clicks on Search$")
	public void User_clicks_Search() throws Exception{
		driver.findElement(By.xpath(PageObjects.OBJ_Search_Button)).click();
	}

	@And("^user scrolls down to bottom$")
	public void User_scrolls_down_bottom() throws Exception{
		JavascriptExecutor Scrool = (JavascriptExecutor) driver;
		Scrool.executeScript("window.scrollBy(0,300)", "");	
	}
	
	@And("^user validates Store information$")
	public void User_validates_Store_info() throws Exception{
		WebElement msg1=driver.findElement(By.xpath(PageObjects.OBJ_StoreHeading_Link));
        String text1=msg1.getText();
        String expectedText1 = "Store information";
        Assert.assertEquals(text1,expectedText1);
        WebElement msg2=driver.findElement(By.xpath(PageObjects.OBJ_StoreAddress_Link));
        String text2=msg2.getText();
        String expectedText2 = "Selenium Framework, Research Triangle Park, North Carolina, USA";
        Assert.assertEquals(text2,expectedText2);
        WebElement msg3=driver.findElement(By.xpath(PageObjects.OBJ_StoreContact_Link));
        String text3=msg3.getText();
        String expectedText3 = "(347) 466-7432";
        Assert.assertEquals(text3,expectedText3);
        WebElement msg4=driver.findElement(By.xpath(PageObjects.OBJ_StoreEmail_Link));
        String text4=msg4.getText();
        String expectedText4 = "support@seleniumframework.com";
        Assert.assertEquals(text4,expectedText4);
	}

}
