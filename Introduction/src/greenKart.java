import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
//		String test = "";
		// Create WebDriver Object for chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
//		driver.findElement(By.cssSelector("a[href*='#/offers']")).click();
		
//		store the min windowHandle and switch to main window
//		test = driver.getWindowHandle();
//		driver.switchTo().window(test);
		driver.findElement(By.xpath("//div[@class='products']/div[2]/div[3]/button")).click();
		
//		driver.close();

	}

}
