package parallel_execution;


	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class parallel2 {
	  @Test
	  public void Tc2() {
		  System.setProperty("webdriver.chrome.driver","\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
			
			
		}

	


}
