import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));
		
		wait.until(new Function<WebDriver, WebElement>() {
			  public WebElement apply(WebDriver driver) {
				  if(driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed()) {
					  return driver.findElement(By.xpath("//div[@id='finish']/h4"));  
				  }
				  return null;
			  }
			});
		System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed());
	}

}
