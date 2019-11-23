package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1_Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"H:\\Eclipse_Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();//checking checkbox
		Thread.sleep(1500);
		Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		System.out.println("Checkbox selected:" +driver.findElement(By.cssSelector("#checkBoxOption1")) );
		driver.findElement(By.cssSelector("#checkBoxOption1")).click(); //unchecking checkbox
		
		Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		System.out.println("Total checkboxes present: "+driver.findElements(By.cssSelector("[type='checkbox']")).size());
	}

}
