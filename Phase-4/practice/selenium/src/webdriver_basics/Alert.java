package webdriver_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kartc.in/oprs-web/");
		driver.findElement(By.xpath("//button[0type='submit']")).click();
		Thread.sleep(1000);
		 String txt =driver.switchTo().alert().getText();
		 System.out.println(txt);
		
		 if(txt.contentEquals("Please select start place."))
		 {
		 driver.switchTo().alert().accept();
		 System.out.println("Invalid Alert");
		 driver.close();
		 
	}
	}
}
