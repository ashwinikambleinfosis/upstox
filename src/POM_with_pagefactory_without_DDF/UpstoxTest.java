package POM_with_pagefactory_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		implicitly wait();
		maximize();
		driver.get("url of app");
		UpstoxLogin1page login1=new UpstoxLogin1page(driver);
		
		login1.UN();
		login1.enterPwd();
		login1.clickloginBtn();
		
		UpstoxLogin2page login2=new UpstoxLoginpage(driver);
		login2.enterPIN();
		UpstoxHomepage home=new UpstoxHomepage(driver);
		home.verifyPageTitle();
	}

}
