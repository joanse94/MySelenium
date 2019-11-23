//Invoking Google search page
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jones\\Documents\\My WorkSpace\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/* driver.get("https://www.google.co.in"); */
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle()); //Get the title of the webpage
		/*
		 * driver.findElement(By.id("email")).sendKeys("hai@gmail.com");
		 * driver.findElement(By.name("pass")).sendKeys("password123");
		 * Thread.sleep(3000);
		 * driver.findElement(By.linkText("Forgotten account?")).click();
		 */
		driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("pass123");
		driver.findElement(By.id("loginbutton")).click();
	
	}

}
