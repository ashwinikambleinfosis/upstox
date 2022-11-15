package with_DDF_Upstox;

import org.openqa.selenium.By;

public class A {
	public static void main(String[] args) {
		//parameterization
		FileInputStream fis=new FileInputStream(" ");
		Sheet sh=WorkbookFactory.create(fis).getsheet("sheet1");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=ChromeDriver();
		maximize();
		implicitly wait();
		deleteallcookies();
		
		driver.get("url of upstox");
		
		String UN=sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("UN")).sendby(UN);
		
		String pwd=sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("pwd")).sendby(pwd);
		
		String date=sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath(" ")).sendby(date);

	}

}
