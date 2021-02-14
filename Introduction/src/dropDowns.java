import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class dropDowns {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/shabarishkesa/Desktop/chromedriver");
//		String test = "";
		// Create WebDriver Object for chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		handling dropdowns
//		with select tags
//		for currency tag
//		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropDown = new Select(staticDropDown);
//		dropDown.selectByIndex(2);
//		System.out.println(dropDown.getFirstSelectedOption().getText());
		
//		for passenger dropdown
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(2000L);
//		
//		for(int i = 0; i<5; i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
//		for departure dynamic dropdown
//		xpath = "//a[@value='MAA']"
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000L);
//		driver.findElement(By.xpath("//a[@value='BLR'][2]")).click();
//		xpath without indexes using parent child traversing
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[text() = ' Kolkata (CCU)']")).click();
		
		
		
//		driver.close();
		

	}
}
