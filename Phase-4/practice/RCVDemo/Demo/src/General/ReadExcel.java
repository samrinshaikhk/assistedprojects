package General;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
		
		WebElement Unm = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		
Workbook wb = Workbook.getWorkbook(new File("C:\\Users\\ADMIN\\OneDrive\\Desktop\\Book1.xlsl"));

Sheet sh = wb.getSheet("abc");

for(int i=0; i< sh.getRows(); i++) {
	    //System.out.println("U name: "+sh.getCell(0,i).getContents());
	    //System.out.println("password :"+sh.getCell(1,i).getContents());
	
	
	Unm.sendKeys(sh.getCell(0, i).getContents());
	pwd.sendKeys(sh.getCell(1, i).getContents());
	Thread.sleep(200);
	Unm.clear();
	pwd.clear();
	
}
	}

}
