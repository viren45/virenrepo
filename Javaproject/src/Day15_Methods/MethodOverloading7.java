package Day15_Methods;

public class MethodOverloading7 {
	
	public static int vp(int num1 , int num2) {
		return num1+num2;
	}
	public static double vp(int num1 , int num2 , double salary) {
	return salary+num1+num2;	
	}
	public static int vp(int num1 , int num2 , int num3) {
	return num1+num2+num3;	
	}
	public static void vp(double salary1 , int age) {
	System.out.println("salary1: "+salary1);
	System.out.println("Age: "+age);
	
	}
	

	public static void main(String[] args) {
		System.out.println("Program Start......");
		System.out.println("Sum1: "+vp(60000 , 25));
		System.out.println("Sum2: "+vp(45 , 58));
		System.out.println("Sum3: "+vp(45 , 56 , 78.35));
		System.out.println("Sum4: "+vp(49 , 78 , 89));

	}

}
