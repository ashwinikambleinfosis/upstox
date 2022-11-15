package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/dmos/droppable/default.html");
		
		//inspect first element
		
		WebElement ele1=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		//inspect element 2
		
		WebElement ele2=driver.findElement(By.xpath("/div[@id='droppable']"));
		
		//create object of Actions class
		
		Actions act=new Actions(driver);
		
		//call dragAnddrop
		
		act.dragAndDrop(ele1, ele2).perform();
		
	}

}
