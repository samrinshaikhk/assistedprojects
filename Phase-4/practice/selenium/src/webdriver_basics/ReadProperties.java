package webdriver_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
@SuppressWarnings("unused")
public class ReadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties p1= new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\Sam");
		p1.load(fis);
		
		System.out.println(p1.getProperty("cource"));
		System.out.println(p1.getProperty("name"));
		System.out.println(p1.getProperty("time"));
		System.out.println(p1.getProperty("sub-cource"));
		
	}	

}
