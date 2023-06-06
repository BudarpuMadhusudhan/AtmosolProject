package com.blazedemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	

	@FindBy(xpath="//h1[text()='Welcome to the Simple Travel Agency!']")
	private WebElement head;
	
	
	@FindBy(xpath="//a[text()='destination of the week! The Beach!']")
	private WebElement link;
	
	@FindBy(xpath="//select[@name=\"fromPort\"]")
	private WebElement fromPort;
	
	@FindBy(xpath="//select[@name=\"toPort\"]")
	private WebElement toPort;
	
	@FindBy(xpath="//input[@value=\"Find Flights\"]")
	private WebElement findButton;


	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String setHead() {
		this.head = head;
		String data = head.getText();
		return data;
	}

	public void setLink() {
		this.link = link;
		link.click();
	}

	public Object setFromPort() {
		this.fromPort = fromPort;
		fromPort.click();
		return findButton;	
	}

	public void setToPort() {
		this.toPort = toPort;
		toPort.click();
	}
	
	public void setFindButton() {
		this.findButton = findButton;
		findButton.click();
		
	}
	
}
