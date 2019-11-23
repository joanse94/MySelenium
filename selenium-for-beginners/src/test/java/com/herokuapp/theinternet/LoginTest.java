package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
	@Test(priority = 1, groups = { "positiveTests", "smokeTests" })
	public void logintest() {
		System.out.println("Starting Login Test");
//			Create driver 
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		Sleep for 3 seconds
		sleep(3000);

		// Maximize the browser
		driver.manage().window().maximize();

//			Open test page
		String url = "http://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println("Page is open");

		// Sleep for 2 seconds
		sleep(2000);
		
//			Enter the username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		sleep(1000);
		
//			Enter the password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("SuperSecretPassword!");
		
		sleep(3000);
		
//			Click login button
		WebElement loginbutton = driver.findElement(By.tagName("button"));
		loginbutton.click();
		sleep(5000);
//		Verifications:
//         new url
		String expectedUrl = "http://the-internet.herokuapp.com/secure";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl,"Actual page URL is not the same as expected");
//			logout button is visible 
		WebElement logoutbutton = driver.findElement(By.xpath("//a[@class ='button secondary radius']"));

		//   		successful login message
	//	WebElement successmessage = driver.findElement(By.cssSelector("#flash"));
		WebElement successmessage = driver.findElement(By.xpath("//div[@id='flash']"));
		String expectedMessage = "You logged into a secure area!";
		String actualmessage = successmessage.getText();
//		Assert.assertEquals(actualmessage, expectedMessage,"Actual message is not the same as expected");
		Assert.assertTrue(actualmessage.contains(expectedMessage),"Actual message doesnot contains Expected message."
				+ "\n Actual Message:"+actualmessage + "\nExpected Message :" +expectedMessage);
		//Close the browser
		driver.quit();
	}
	public class NegativeTests {
		@Parameters({ "username", "password", "expectedMessage" })
		@Test(priority = 2, groups = { "negativeTests", "smokeTests" }) //Group name: SmokeTests
		public void negativelogintest(String username, String password, String expectedErrorMessage) {
			// TODO Auto-generated method stub
			System.out.println("Starting Incorrect Login Test");
//			Create driver 
			System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			// Maximize the browser
			driver.manage().window().maximize();
//				Open test page
			String url = "http://the-internet.herokuapp.com/login";
			driver.navigate().to(url);
			System.out.println("Page is open");

//			Enter the username
			WebElement usernameElement = driver.findElement(By.id("username"));
			usernameElement.sendKeys(username);
			// username.sendKeys("tomsmith");

			// Enter the password
			WebElement passwordElement = driver.findElement(By.name("password"));
			passwordElement.sendKeys(password);
//		Click login button
			WebElement loginbutton = driver.findElement(By.tagName("button"));
			loginbutton.click();
//			Verifications:
//	      new url
			String expectedUrl = "http://the-internet.herokuapp.com/login";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl, "Actual page URL is not the same as expected");

			WebElement failuremessage = driver.findElement(By.id("flash"));
			String expectedMessage = "Your username is invalid!";
			String actualmessage = failuremessage.getText();
			Assert.assertTrue(actualmessage.contains(expectedErrorMessage), "Actual message doesnot contains Expected message."
					+ "\n Actual Message:" + actualmessage + "\nExpected Message :" + expectedErrorMessage);
			// Close the browser

			driver.quit();
		}
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
