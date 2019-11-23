import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jones\\Documents\\My WorkSpace\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  driver.get("https://login.salesforce.com/");
		/*
		 * driver.findElement(By.id("username")).sendKeys("hello");
		 * driver.findElement(By.name("pw")).sendKeys("122345"); //
		 * driver.findElement(By.className("button r4 wide primary")).click(); //Error
		 * line driver.findElement(By.xpath("//*[@id='Login']")).click();
		 */
	
		  driver.findElement(By.cssSelector("#username")).sendKeys("emailaddress");
		  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("pass123");
		  driver.findElement(By.xpath("//*[@id='Login']")).click();
		  System.out.println(driver.findElement(By.cssSelector("#error.loginError")).getText());
		
		  
	}

}
