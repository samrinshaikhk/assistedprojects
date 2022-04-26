package webdriver_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		//driver.findElement(By.linkText("Data Policy"));
		
		driver.findElement(By.partialLinkText("Data")).click();
		driver.close();//close parent window
		driver.quit();//close parent and child window
	}

}
