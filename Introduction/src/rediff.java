import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
		// Create WebDriver Object for chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com");
		// by regex Xpath
		driver.findElement(By.xpath("//*[contains(@title, 'Already a user? Sign in')]")).click();
		// by CSSSelector Reg Ex
//		driver.findElement(By.cssSelector("a[title*='Already a user? Sign in']")).click();
		// Xpath regex for username
//		driver.findElement(By.xpath("//input[contains(@id, 'login1')]")).sendKeys("xpath reg ex");
//		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("xpath password reg ex");
//		driver.findElement(By.xpath("//*[contains(@name, 'procee')]")).click();
		// css regex
		driver.findElement(By.cssSelector("input[id*='login1']")).sendKeys("css username reg ex");
		driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("css username reg ex");
		driver.findElement(By.cssSelector("input[name*='proceed']")).click();

	}

}
