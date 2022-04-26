package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoAutomation {

	


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ADMIN\\\\Documents\\\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			//driver.get("http://www.google.com");
			driver.get("http://www.ebay.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"gh=ac\"]")).sendKeys("mobile");
			driver.findElement(By.xpath("//*[@id=\"gh.btn\"]")).click();
			driver.close();
		}
	}


