package Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pradi/OneDrive/Documents/Webtable.html");
		
		//print only student name
		String sn = driver.findElement(By.xpath("//table[@id='2244']th[2]")).getText();
		System.out.println(sn);
		
		//print city
		String ct = driver.findElement(By.xpath("//table[@id='2244']th[3]")).getText();
		System.out.println(ct);

	}

}
