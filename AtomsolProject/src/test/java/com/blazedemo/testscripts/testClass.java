package com.blazedemo.testscripts;

import java.util.Set;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.blazedemo.generic.BaseClass;
import com.blazedemo.generic.FileGeneric;
import com.blazedemo.pom.HomePage;
import com.blazedemo.pom.Travel;

public class testClass extends BaseClass{
@Test
public void testAtom() throws InterruptedException
{
	HomePage h = new HomePage(driver);
	String name = h.setHead();
	Reporter.log(name , true);
	h.setLink();
	driver.navigate().back();
	FileGeneric fi = new FileGeneric();
	fi.fromList("Mexico City");
	fi.toList("London");
	h.setFindButton();
	Travel t = new Travel(driver);
	t.setButton();
	String data = t.setCost();
	Reporter.log(data+"visible" , true);
	t.setButtonPur();
	Thread.sleep(4000);
	 Set<String> wh = driver.getWindowHandles();
	
	for(String wi:wh)
	driver.switchTo().window(wi);
	String id = t.setId();
	Reporter.log(id , true);
}
}
