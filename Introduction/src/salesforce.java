import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
		String message = "";
		// Create WebDriver Object for chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("shabarish.268@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("K@2513388a");
//		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		message = driver.findElement(By.cssSelector("div#error.loginError")).getText();
		System.out.println(message);
		
		driver.close();

	}

}
