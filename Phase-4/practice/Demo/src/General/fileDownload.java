package General;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileDownload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	
		driver.findElement(By.name("q")).sendKeys("java download");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//h3[contains(text(),'Download Free Java Software')]"));
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//span[contains(text(),'Free Java Download')]")).click();
	Thread.sleep(3000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER);
	
	
	
	
	}
}

		
