package POM_with_pagefactory_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin2page {

	//step1-declaration
	
  @FindBy(xpath="DOB")private WebElement PIN;
  
  //step-2 initialization
  
  public UpstoxLogin2page(WebDriver driver) {
	  PageFactory.initElements(driver,this);
	  
  }
  //step3-implementation
  
  public void enter PIN() {
	  PIN.sendKeys("1995");
  }
}
