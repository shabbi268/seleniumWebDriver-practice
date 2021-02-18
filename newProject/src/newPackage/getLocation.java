package newPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class getLocation {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.facebook.com";
        Point tagName;
//        String name = "";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("passContainer")).getLocation();
//        name = driver.findElement(By.className("_6lux")).getText();
        System.out.println("result: " + tagName);
//        System.out.println(name);
        driver.close();
        System.exit(0);
}
}