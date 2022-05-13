package Day15_Methods;

class Adder{
	static int salary=45000;
	static int add(int a, int b) {
	return a+b;	
	}
	static int add(int a, int b, int c) {
	return a+b+c;
}
    static void call() {
    System.out.println("I am call() of Adder class");	
    }
    }

public class MethodOverloading3 {
	static void display() {
		System.out.println("I am display() of MethodOverloading3");
	}
	public static void main(String[]args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11,11));
		Adder.call();
		System.out.println(Adder.salary);
		//display();
		//or
		MethodOverloading3.display();
	}
}

	