package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffHomePage {
	
	
	WebDriver driver;
	public rediffHomePage(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.id("srchword");
	By Submit = By.className("newsrchbtn");
	
	public WebElement submit() {
		return driver.findElement(Submit);
	}
	
	public WebElement search() {
		return driver.findElement(search);
	}

}
