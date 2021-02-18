import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 5);
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//a[text() = 'Click to load get data via Ajax!']")).click();
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		
		System.out.println(driver.findElement(By.id("results")).getText());

	}

}
