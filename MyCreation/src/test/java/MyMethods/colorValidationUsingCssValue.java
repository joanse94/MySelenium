package MyMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class colorValidationUsingCssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://outlook.live.com/owa/";
		driver.get(url);
		driver.manage().window().maximize();
		String cssValue = driver.findElement(By.cssSelector("aside.static-strip")).getCssValue("background-color");
		System.out.println("The Css value of the tob bar : "+cssValue);
		String expectedcssValue ="rgba(255, 255, 255, 0.2)"; 
		if(cssValue == expectedcssValue) {
			System.out.println("The Color of the top header is matched with the css value ");
		}
		else {
			System.out.println("Color of the top bar is not matched with css value");
			System.out.println("Expected Css value : "+expectedcssValue + " Actual Css value : " +cssValue);
		}
		
		driver.close();
		
	}

}
