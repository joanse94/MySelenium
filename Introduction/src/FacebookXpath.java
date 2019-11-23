import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jones\\Documents\\My WorkSpace\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://facebook.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='globalContainer']/div[3]/div/div/div/text()")));
	}

}
