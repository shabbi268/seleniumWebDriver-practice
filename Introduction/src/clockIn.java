import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clockIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			
		System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ucflex.uc.edu/irj/portal/fiori#Shell-home");
		
		driver.findElement(By.id("username")).sendKeys("kesash");
		driver.findElement(By.id("password")).sendKeys("Qwerty@3300");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000L);
		
		driver.findElement(By.xpath("//div[text() = 'Clock In / Clock Out']")).click();
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("name"))).build();

	}

}
