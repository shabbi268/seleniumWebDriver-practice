//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
//		String text = "Shabarish";
//		String test = "";
		// Create WebDriver Object for chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://cleartrip.com");
//		Thread.sleep(2000L);
//		driver.switchTo().alert().accept();
		driver.findElement(By.id("FromTag")).sendKeys("cin");
//		List<WebElement> options = driver.findElements(By.className("list"));
//		System.out.println(options);
//		TODO
		

	}

}
