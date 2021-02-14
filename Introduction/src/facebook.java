import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
		// Create WebDriver Object for chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("testertesting");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("testpassword");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
//		driver.close();

	}

}
