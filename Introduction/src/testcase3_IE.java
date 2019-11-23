import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testcase3_IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub#
		
		System.setProperty("webdriver.ie.driver","H:\\Eclipse_Workspace\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://mail.google.com");
		System.out.println(driver.getTitle());
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("sweetjoanse@gmail.com");

	}

}
