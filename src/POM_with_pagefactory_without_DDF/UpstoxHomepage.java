package POM_with_pagefactory_without_DDF;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Selenium.xpath;

public class UpstoxHomepage {
	
	//declaration
	
	@FindBy("xpath & title")private WebElement
	
	//initialization
	public UpstoxHomePage(webdriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void verifyPageTitle() {
		String expT="";
		String actT=driver.getTitle();
		if(acti.equals(exopi)) {
			System.out.println("tc pass");
			
		}
		else {
			System.out.println("tc is fail");
		}
	}
	
		
	
	
	

}
