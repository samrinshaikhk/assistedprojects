package webdriver_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveTo {

	@SuppressWarnings("unused")
	private static Object unm;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Actions act = new Actions(driver);
		
		 WebElement Unm =driver.findElement(By.id("email"));
		 WebElement pwd =driver.findElement(By.id("pass"));
		 WebElement log =driver.findElement(By.id("loginbutton"));
		 int x =log.getLocation().getX();
		int y = log.getLocation().getY();
		
		Unm.click();
		 act.moveToElement(Unm).sendKeys("a1@gmail.com");
		 act.moveToElement(pwd).sendKeys("test").build().perform();
		 act.moveByOffset(x, y).click().build().perform();
		 
		
	}

}
