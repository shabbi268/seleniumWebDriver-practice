package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class newTab {
	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver","/Users/shabarishkesa/Desktop/geckodriver");
//		WebDriver driver  = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//		driver.switchTo().window(WindowType.TAB);
		driver.navigate().to("https://www.crmpro.com/");
//		driver.get("https://www.google.com/search?q=Lunar+New+Year&oi=ddle&ct=174786444&hl=enm");
		String expectedTitle = "Lunar New Year - Google Search";
		String actualTitle = null;
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Expected Value is "+expectedTitle);
			System.out.println("Actual Value is "+actualTitle);
			System.out.println("Test Passed");
		} else {
			System.out.println("Expected Value is "+expectedTitle);
			System.out.println("Actual Value is "+actualTitle);
			System.out.println("Test Failed");
		}

        driver.close();
        System.exit(0);
}
}
