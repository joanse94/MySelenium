import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_RegularExpression {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jones\\Documents\\My WorkSpace\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("CssUsername");
		driver.findElement(By.cssSelector("input#password")).sendKeys("password123");
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("input[value='Go']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='login']/div/div[1]")).getText());
		driver.quit();

	}

}
