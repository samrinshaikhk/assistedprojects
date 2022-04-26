package com.finalExample;
class A {
	 final int i = 0;
	
	
	 final int test() {
		return 1;
	}
	 
	 

}


/*final class B extends A{
	
	int test() {
		return 1;
	}
	
}*/

public class FinalDemo {

	public static void main(String[] args) {
		
			A a = new A();
			System.out.println(a);
			//a.i++;
			
			//B b = new B();

		}

	}
	


