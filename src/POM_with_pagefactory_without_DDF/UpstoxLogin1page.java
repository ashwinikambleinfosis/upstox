package POM_with_pagefactory_without_DDF;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpstoxLogin1page {
	
	//step 1-Declaration
	
		@FindBy(xpath="UNxpath")private WebElement UN;
		@FindBy(xpath="pwdxpath")private WebElement Pwd;
		@FindBy(xpath="Btnxpath")private WebElement Btn;
		
		//Initialization
		
		public UpstoxLogin1page(webdriver driver) {
			PageFactory.initElements(driver,this);
			
			public void enter UN() {
				UN.sendKeys(" ");
				}
			public void enterPwd() {
				Pwd.sendkeys(" ");
				
				public void clickloginBtn() {
					loginBtn.click();
					
				}

}
