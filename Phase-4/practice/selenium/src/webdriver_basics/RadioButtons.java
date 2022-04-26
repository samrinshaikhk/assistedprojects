package webdriver_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("sex"));
		
		@SuppressWarnings("unchecked")
		List <WebElement> gender = (List<WebElement>) driver.findElement(By.name("sex"));
		
		int cnt = gender.size();
		System.out.println(cnt);
	//***********************
		
		for(int i =0; i<cnt ; i++)
		{
			String txt = gender.get(i).getText();
			System.out.println(txt);
			
			gender.get(i).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
}