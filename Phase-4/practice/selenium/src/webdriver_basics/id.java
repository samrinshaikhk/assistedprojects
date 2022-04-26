package webdriver_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	  WebElement Unm= driver.findElement(By.id("email"));
	  Unm.sendKeys("A1@gmail.com");
	  
	  driver.findElement(By.name("pass")).sendKeys("test");
	  driver.findElement(By.id("loginbutton")).click();
	  
	  
	  
}
}