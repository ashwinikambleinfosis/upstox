package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class scrrenshot {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//find particular object
		WebElement d=driver.findElement(By.xpath("//div[@class=\"atLogoImg\"]"));
		//TakesScreenshot t=(TakesScreenshot)driver;
		File src=d.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\pradi\\OneDrive\\Pictures\\scrrenshort\\actitime.png");
		Files.copy(src,dest);
		
		
		
	}

}
