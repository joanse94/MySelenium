import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sampleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","H:\\Eclipse_Workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.google.com"); // Invoke the browser and load the webpage
		Thread.sleep(3000);						// Waiting on particular page
		driver.get("https://www.facebook.com");		
		System.out.println(driver.getTitle()); 	//Getting the title of the webpage
		//System.out.println(driver.getPageSource()); // Get the Page Source
		driver.navigate().back();  // To go back to the previous webpage
		driver.navigate().forward(); // To go to next webpage 
		driver.close(); //closes the current browser window alone.
		driver.quit();  //Closes all the browser windows opened by selenium
	}

}
