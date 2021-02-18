package newPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class PG2 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
//        String name = "";
        
        driver.get(baseUrl);
        driver.navigate().to("http://google.com");
        tagName = driver.findElement(By.id("passContainer")).getTagName();
//        name = driver.findElement(By.className("_6lux")).getText();
        System.out.println(tagName);
//		Checking login click working or not
//      driver.findElement(By.name("login")).click();
//      System.out.println(name);
        driver.close();
        System.exit(0);
}
}