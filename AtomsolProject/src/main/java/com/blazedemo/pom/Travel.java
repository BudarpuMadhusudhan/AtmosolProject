package com.blazedemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Travel {

	@FindBy(xpath="(//input[@class=\"btn btn-small\"])[3]")
	private WebElement button;
	
	@FindBy(xpath="//p[text()='Total Cost: ']")
	private WebElement cost;
	
	public String setCost() {
		this.cost = cost;
		String data = cost.getText();      
		return data;
	}
	@FindBy(xpath="//input[@value=\"Purchase Flight\"]")
	private WebElement buttonPur;

	

	public Travel(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setButton() {
		this.button = button;
		button.click();
	}
	public void setButtonPur() {
		this.buttonPur = buttonPur;
		buttonPur.click();
	}
	
	@FindBy(xpath="//td[text()='1685950570632']")
	private WebElement id;
	

	public String setId() {
		this.id = id;
		String data = id.getText();
		return data;
	}
}
