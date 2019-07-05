package com.OnlinePurchase.YourLogo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HomePageTest extends HomePage{

	HomePage hp;
	BasePage bp;

	public HomePageTest()
	{
		hp = new HomePage();
	    bp = new BasePage();
}
	@Test()
	public void verifytabs() 
	{
		Assert.assertTrue(hp.womentab().isDisplayed());
		hp.womentab().click();
		hp.Winback();
		
		Assert.assertTrue(hp.dressestab().isDisplayed());
		hp.dressestab().click();
		Assert.assertTrue(hp.casualdresses().isDisplayed());
		hp.casualdresses().click();
		hp.Winback();
		
		Assert.assertTrue(hp.tshirtstab().isDisplayed());
		hp.tshirtstab().click();
		hp.Winback();
		
	}
		
	}
	/*
	public void verifynewsletter()
	{

	Assert.assertTrue(hp.newsletter().isDisplayed());
	hp.newsletter().sendKeys("vinod@gmail.com");
	
	}*/
