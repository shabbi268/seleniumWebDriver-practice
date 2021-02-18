import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hacker {

	public static <JSONArray> void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
		// Create WebDriver Object for chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hackerrank.com/leaderboard");
		
		List<WebElement> tBody = driver.findElements(By.xpath("//div[@class = 'table-row flex']"));
		
		int size = driver.findElements(By.xpath("//div[@class = 'table-row flex']")).size();
		
		System.out.println(size);
		
		for(int i = 0; i<size; i++) {
			System.out.println(tBody.get(i).findElement(By.tagName("a")).getText());
			System.out.println(driver.findElements(By.xpath("//span[@class='ellipsis']")).get(i).getText());
			System.out.println(driver.findElements(By.xpath("//span[@class='flag-tooltip']")).get(i).getAttribute("data-balloon"));
			System.out.println(driver.findElements(By.xpath("//div[@class='table-row-column ellipsis score']/span")).get(i).getText());
			
		}
		
		
		driver.close();
	}

}
