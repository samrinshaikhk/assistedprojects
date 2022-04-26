package webdriver_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.xpath("//input[0value='Go')")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[0id='leftnavcontainer']//ul[4]//div[1]//li[4]")).click();
		

	}

}
