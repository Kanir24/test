package com.assesment.utility;

import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMap {
	
	public static Properties OR;
	
	public static By getLocator(String objProp) throws Exception{
		
		String locatorType;
		String locatorValue;
		boolean hashLocatorType = objProp.startsWith("|");
		
		if(hashLocatorType) {
			locatorType = objProp.substring(1, objProp.indexOf("|",1));
			locatorValue = objProp.substring(objProp.indexOf("|",1)+1);
		}else {
			locatorType="xpath";
			locatorValue=objProp;
		}
		
		switch (locatorType.toLowerCase()) {
		
		case "id":		return By.id(locatorValue);
		case "xpath":	return By.xpath(locatorValue);
		default:		throw new Exception("Unknown locator Type '" + locatorType + "' for Object '" + objProp + "'");
		
		}
	}

}
