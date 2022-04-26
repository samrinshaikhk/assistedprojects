package exceptionhandling;
import java.io.FileNotFoundException;

public class ExceptionPropagationDemo {
		// TODO Auto-generated method stub

		void m() throws FileNotFoundException {
			throw new FileNotFoundException();
		} 
		
		void n() throws FileNotFoundException {
				m();
		}
		

		public static void main(String[] args) {
			ExceptionPropagationDemo	demo = new ExceptionPropagationDemo();
			try {
				demo.n();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("End of probram");
		
	}

}
