package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"H:\\Eclipse_Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.click();
		from.clear();
		from.sendKeys("MUM");
		from.sendKeys(Keys.ENTER);
		
		WebElement to= driver.findElement(By.xpath("//input[@placeholder='To']"));
		to.clear();
		to.sendKeys("DEL");
		to.sendKeys(Keys.ENTER);
		
	}

}
