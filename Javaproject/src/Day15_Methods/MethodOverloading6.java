package Day15_Methods;

public class MethodOverloading6 {
	
	public int myMethod(int num1 , int num2) {
	System.out.println("First method of class demo");
	return num1+num2;
	}
	public double myMethod(double var1, int var2) {
	System.out.println("Second method of class demo");
	return var1+var2;
	}
	public static void main(String[] args) {
	 
	MethodOverloading6 obj1 = new MethodOverloading6();
	obj1.myMethod(10, 10);
	obj1.myMethod(20, 12);

	} 

}
