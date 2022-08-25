package com.assesment.pageObject;

public class PageObjects {
	
	//Add Items:
	public static final String OBJ_Item1_Link = "|linkText|Faded Short Sleeve T-shirts";
	public static final String OBJ_Item2_Link = "|linkText|//a[@title='Blouse']";
	public static final String OBJ_Item3_Link = "|xpath|//li[3]/div/div[2]/h5/a[@title='Printed Dress']";
	public static final String OBJ_Item4_Link = "|xpath|//li[4]/div/div[2]/h5/a[@title='Printed Dress']";
	public static final String OBJ_Item5_Link = "|xpath|//li[5]/div/div[2]/h5/a[@title='Printed Summer Dress']";
	public static final String OBJ_Item6_Link = "|xpath|//li[6]/div/div[2]/h5/a[@title='Printed Summer Dress']";
	public static final String OBJ_Item7_Link = "|linkText|Printed Chiffon Dress"; 
	public static final String OBJ_quantity_Textbox = "|id|quantity_wanted";
	public static final String OBJ_size_Dropdown = "|id|group_1";
	public static final String OBJ_size1_Dropdown = "|xpath|//option[. = 'S'";
	public static final String OBJ_size2_Dropdown = "|xpath|//option[. = 'M'";
	public static final String OBJ_size3_Dropdown = "|xpath|//option[. = 'L'";
	public static final String OBJ_Item1color1_Link = "|id|color_13"; //Orange
	public static final String OBJ_Item1color2_Link = "|id|color_14"; //Blue
	public static final String OBJ_Item2color1_Link = "|id|color_8"; //White
	public static final String OBJ_Item2color2_Link = "|id|color_9"; //Black
	public static final String OBJ_Addcart_Button = "|cssSelector|.exclusive > span"; 
	public static final String OBJ_ContinueShop_Button = "|cssSelector|.continue > span";
	public static final String OBJ_Checkout_Button = "|xpath|//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span/text()";
	public static final String OBJ_Home_Link = "|cssSelector|.icon-home";
	
	//Remove Item:
	public static final String OBJ_Cart_Dropdown = "|xpath|//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"; 
	public static final String OBJ_CartCheckout_Button = "|xpath|//*[@id=\"button_order_cart\"]/span/text()";
	public static final String OBJ_DeleteItem_Link = "|xpath|//*[@id=\"2_7_0_0\"]/i";
	
	//Search Item:
	public static final String OBJ_Search_Textbox = "|id|search_query_top";
	public static final String OBJ_Search_Button = "|xpath|//*[@id=\"searchbox\"]/button";
	
	//Validate Store info:
	public static final String OBJ_StoreHeading_Link = "|xpath|//*[@id=\"block_contact_infos\"]/div/h4/text()"; //Store information
	public static final String OBJ_StoreAddress_Link = "|xpath|//*[@id=\"block_contact_infos\"]/div/ul/li[1]/text()"; 
	//Selenium Framework, Research Triangle Park, North Carolina, USA            	
	public static final String OBJ_StoreContact_Link = "|xpath|//*[@id=\"block_contact_infos\"]/div/ul/li[2]/span"; //(347) 466-7432
	public static final String OBJ_StoreEmail_Link = "|xpath|//*[@id=\"block_contact_infos\"]/div/ul/li[3]/span/a"; //support@seleniumframework.com
	
	
}
