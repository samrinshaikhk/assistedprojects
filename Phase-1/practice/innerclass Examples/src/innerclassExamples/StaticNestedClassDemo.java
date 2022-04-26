package innerclassExamples;

class Outer3 {
	private static String msg = "Samrin";
	
	static class Inner3 {
		void msg() {
			System.out.println(msg);
		}
	}
}
public class StaticNestedClassDemo {

	public static void main(String[] args) {
		Outer3.Inner3 inner = new Outer3.Inner3(); 
		
		inner.msg();

	}


}
