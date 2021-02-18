import java.util.Arrays;

import java.util.List;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.support.ui.ExpectedConditions;

//import org.openqa.selenium.support.ui.WebDriverWait;

public class p2 {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/shabarishkesa/Desktop/chromedriver");

		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 5);

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text() = 'PROCEED TO CHECKOUT']")).click();
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		
		driver.findElement(By.xpath("//button[text() = 'Place Order']")).click();
//		
//		driver.findElement(By.xpath("//select")).click();
//		driver.findElement(By.xpath("//option[@value='India']")).click();
		WebElement countryDropDown = driver.findElement(By.xpath("//select"));
		Select options = new Select(countryDropDown);
		options.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text() = 'Proceed']")).click();
		

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

//Brocolli - 1 Kg

//Brocolli,    1 kg

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{

				j++;

//click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}

}
