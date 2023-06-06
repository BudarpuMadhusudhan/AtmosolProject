package com.blazedemo.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.blazedemo.pom.HomePage;

public class FileGeneric extends BaseClass {

	public void fromList(String city)
	{
//		HomePage p = new HomePage(driver);
//		  fromList = p.setFromPort();
//		
//		Select s = new Select(fromList);
//		s.selectByVisibleText(city);
	}
	public void toList(String city)
	{
		WebElement toList = driver.findElement(By.xpath("//select[@name=\\\"Port\\\"]"));
		Select s = new Select(toList);
		s.selectByVisibleText(city);
	}
}
