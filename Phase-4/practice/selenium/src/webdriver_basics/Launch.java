package webdriver_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("unused")
public class Launch {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.seleniumhq.org/download/");
		//driver.get("https://www.google.com");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	}


