package webdriver_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Status {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement img = driver.findElement(By.xpath("//div[0class='_5iyy']//img[0class='img']"));
		System.out.println(img.isDisplayed());
		System.out.println(img.isEnabled());
		System.out.println(img.isSelected());
		//********************
		WebElement Unm = driver.findElement(By.id("email"));
		Unm.sendKeys("Welcome");
		Thread.sleep (500);
		Unm.clear();
		Unm.sendKeys("A1@gmail.com");
	}

}
