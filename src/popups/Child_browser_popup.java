package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_popup {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 20000",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		
	   Set<String> allwin=driver.getWindowHandles();
	   ArrayList<String> al=new ArrayList<String>(allwin);
	   
	   String mainwin=al.get(0);
	   Thread.sleep(3000);
	   System.out.println(mainwin);
	   
	   
	   String childwin = al.get(1);
	   System.out.println(childwin);
		System.out.println("hi")
	   
	    
		
		
	}

}
