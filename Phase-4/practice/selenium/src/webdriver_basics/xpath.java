package webdriver_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//absolute: using attribute:use//
		//Relative:using Position:use/
	//driver.findElement(By.xpath("//input[@id "email"]").Sendkeys("welcome"));
	}
}
