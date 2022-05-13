package A_MyPractice;

public class MethodOverloading1 {

	static double res;
	static public void division() {
	System.out.println("No method parameter called");	
	}
	static public void division(int number) {
	res=number/25;
	System.out.println("Method with int parameter: "+res);
	
	}
	static public void division(double number) {
	res=number/25;
	System.out.println("Method with double parameter "+res);
	}
	
	public static void main(String[] args) {
		System.out.println("Result: "+res);
		MethodOverloading1.division();
		MethodOverloading1.division(75);
		System.out.println("Result: "+res);
		MethodOverloading1.division(75.5f);
		System.out.println("Result: "+res);

	}

}
