package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.rediffHomePage;
import objectRepository.rediffLoginPage;

public class LoginPage {

	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		rediffLoginPage rd = new rediffLoginPage(driver);
		
		rd.EmailId().sendKeys("shabarish.shabbi@gmail.com");
		
		rd.Password().sendKeys("password");
		
		rd.goButton().click();
		rd.home().click();
		rediffHomePage rh = new rediffHomePage(driver);
		
		rh.search().sendKeys("rediff");
		rh.submit().click();
		
		driver.close();
	}

}
