//Invoking Facebook login page
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestCase_Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Selenium Code
		//Create driver object for chrome driver
		//we strictly implement the  methods of webdriver
		/* Class name = ChromeDriver
		 	X driver = new X();
		 	//Invoke .exe extension first
		 	
		 */
		System.setProperty("webdriver.gecko.driver","H:\\Eclipse_Workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("sweetjoanse@gmail.com");
	}

}
