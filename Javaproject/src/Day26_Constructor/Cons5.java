package Day26_Constructor;

class A{
	int i = 10;
	A(){
		System.out.println("Running Class A() Constructor..");
	}
	void display () {
		System.out.println("I am display() Class A");
	}
}
class X{
	int j=20;
	X(){
		System.out.println("Running Class x() Constructor..");
	}
	void display () {
		System.out.println("I am display() Class x");
	}
}


public class Cons5 {
	
	void display(){
		System.out.println("I am display() Class Cons5");
	}

	public static void main(String[] args) {
	
		System.out.println("main() of class cons5 is Starting....");
		
		A a1 = new A();
		a1.display();
		System.out.println("class A globle variable j = "+a1.i);
		
		X x1 = new X();
		x1.display();
		System.out.println("class X globle variable j = "+x1.j);
		

	}

}
