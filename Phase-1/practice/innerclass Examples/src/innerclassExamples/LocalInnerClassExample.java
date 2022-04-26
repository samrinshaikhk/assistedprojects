package innerclassExamples;
class OuterClass2 {
	private String msg = "Samrin";
	
	void display() {
		
		class InnerClass2 {
			void msg() {
				System.out.println(msg);
			}
		}
		
		InnerClass2 innerObj = new InnerClass2();
		innerObj.msg();
	}
}
public class LocalInnerClassExample {

	public static void main(String[] args) {
		OuterClass2 outer = new OuterClass2();
		outer.display();

	}
}
