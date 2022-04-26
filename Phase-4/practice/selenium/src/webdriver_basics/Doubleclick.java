package webdriver_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		
	WebElement signin = driver.findElement(By.xpath("//span[contains(text(),'Hello,Sign in')]"));
			//act.moveToElement(signin).doubleclick().build().perform();
	//act.doubleClick(sigin).build().perform();
	act.contextClick(signin).perform();
	}

}
