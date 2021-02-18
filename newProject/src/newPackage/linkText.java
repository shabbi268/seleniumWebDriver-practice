package newPackage;
import org.openqa.selenium.By;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class linkText {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.linkText("Forgot account?")).getTagName();
        System.out.println("tagName: " + tagName);
        driver.close();
        System.exit(0);
}
    
};

