package css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//enter un
		driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys("admin");
		
		//enter pwd
		
		
		driver.findElement(By.cssSelector("input[name=\"pwd\"]")).sendKeys("manager");
	}
}
