package innerclassExamples;

class OuterClass1 {
	private String msg = "Samrin";

	class InnerClass1 {
		void hello() {
			System.out.println(msg);
		}
	}
}
public class MemberInerClassDemo {

	public static void main(String[] args) {
		OuterClass1 outer = new OuterClass1();
		
		OuterClass1.InnerClass1 inner = outer.new InnerClass1();
		inner.hello();
	}

}
