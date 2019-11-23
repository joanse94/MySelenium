package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"H:\\Eclipse_Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		WebElement dropdownlink = driver.findElement(By.linkText("Dropdown"));
		dropdownlink.click();
		Select s =new Select(driver.findElement(By.id("dropdown")));
		s.selectByValue("2");
		Thread.sleep(3000);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByVisibleText("Option 2");
		
	}

}