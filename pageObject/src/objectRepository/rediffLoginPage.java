package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffLoginPage {
	
	
	WebDriver driver;
	public rediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.xpath(".//*[@id='login1']");
	By password = By.name("passwd");
	By goButton = By.name("proceed");
	By home = By.linkText("rediff.com");
	
	public WebElement EmailId() {
		return driver.findElement(username);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	public WebElement goButton() {
		return driver.findElement(goButton);
	}
	
	public void close() {
		driver.close();
	}
	
	public WebElement home() {
		return driver.findElement(home);
	}

}
