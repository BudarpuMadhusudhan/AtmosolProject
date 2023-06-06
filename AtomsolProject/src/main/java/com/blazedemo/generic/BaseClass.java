package com.blazedemo.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}

	protected static WebDriver driver;
	@BeforeTest
	public void openBroswer() throws IOException
	{
		driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FilLib f = new FilLib();
		String url = f.getProperty1("url");
		driver.get(url);
	}
	@AfterTest
	public void closeBroswer()
	{
		driver.close();
	}

	}
