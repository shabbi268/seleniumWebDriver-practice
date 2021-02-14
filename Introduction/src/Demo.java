import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
		// Create WebDriver Object for chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("shabarish.268@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("K@2513388");
//		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[@id=\'u_0_a_wl\']/div[3]/a")).click();
//		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("shabarish.shabbi@gmail.com");
		driver.findElement(By.name("did_submit")).click();
		
		
		driver.close();

	}

}
