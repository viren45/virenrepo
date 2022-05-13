package A_MyPractice;

public class MethodOverloading {
	

	static double res;//0.0
	static public void square() {
	System.out.println("No parameter method called");//output: No parameter method called
		
	}
	static public void square(int number) {
	res=number*number;
	System.out.println("Method with int argument called: "+res);
	
	}
	static public void square(double number) {
		res=number*number;
	System.out.println("Method with double argument called: "+res);
	
	}
	
	public static void main(String[] args) {
	
	System.out.println("Result: "+res);//0.0
	MethodOverloading.square();
	MethodOverloading.square(5);
	System.out.println("Result: "+res);
	MethodOverloading.square(2.5f);//6.25
	System.out.println("Result: "+res);
	

	}

}
