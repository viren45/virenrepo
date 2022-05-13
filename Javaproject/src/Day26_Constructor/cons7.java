package Day26_Constructor;

class B {
	int i = 10;
	
	B(){
		System.out.println("Running class B Constructor");
		i = 23;
	}
}

public class cons7 {

	public static void main(String[] args) {
		System.out.println("Main () of class Cons7 started..");
		B b1 = new B();
		System.out.println("Class B globle variable i = " + b1.i);
		System.out.println("********************************");
		B b2 = new B();
		System.out.println("Class B globle variable i = " + b2.i);
		System.out.println("Main () of class Cons7 started..");
	}

}
