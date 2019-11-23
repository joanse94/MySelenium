package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"H:\\Eclipse_Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		WebElement from = driver.findElement(By.xpath("//a[@value='BLR']"));
		from.click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));//Not required since it automatically opens the to drop down
		Thread.sleep(1500);
		WebElement to = driver.findElement(By.xpath("(//a[@value='MAA'])[2]"));
		to.click();
		
	}

}
