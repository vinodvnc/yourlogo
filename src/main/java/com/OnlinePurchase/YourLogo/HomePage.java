package com.OnlinePurchase.YourLogo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	
	@FindBy(xpath = "//ul/li[1]/a[@title= 'Women']")
	public WebElement womentab;
	
	@FindBy(xpath = "//ul[contains(@class, 'sf-menu clearfix menu-content sf-js-enabled sf-arrows')]/li[2]/a[@title='Dresses']")
	public WebElement dressestab;
	
	@FindBy(xpath = "////ul[contains(@class,'submenu-container clearfix first-in-line-xs')]/li[1]/a[@title='Casual Dresses']]")
	public WebElement casualdresses;
	
	
	@FindBy(xpath = "//ul/li[3]/a[@title='T-shirts']")
	public WebElement tshirtstab;

	
	public WebElement womentab() 
	{
		return womentab;
	}
	
	public WebElement dressestab()
	{
		return dressestab;
	}
	public WebElement casualdresses()
	{
		return casualdresses;
	}
	
	public WebElement tshirtstab()
	{
		return tshirtstab;
	}
	
	public HomePage() 
	{
	PageFactory.initElements(driver, this);
	}

}

/*
@FindBy(xpath ="//input[@id='newsletter-input']" )
public WebElement newsletter;*/

	/*public WebElement newsletter()
	{
		return newsletter;
	}*/
	

