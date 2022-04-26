package General;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("unused")
public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    String  Fpath = "C:\\Users\\ADMIN\\OneDrive\\Documents\\testing.txt";
   @SuppressWarnings("resource")
BufferedReader bf = new BufferedReader(new FileReader(Fpath));
    String startline;
    
    while((startline = bf.readLine())!=null)
    {
    	System.out.println(startline);
    }
    
	}
}
