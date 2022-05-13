package A_MyPractice;

public class MethodOverloading2 {

	
	/**
	 * Method Overloading: Any method declare more than once in the class body with
	 * anyone of below rules:
	 * 1.type of argument different or
	 * 2.number of argument /parameter should different of
	 * 3.position of argument/parameter should different
	 */

	public static void main() {
		System.out.println("I am main().....");
	}
	
    static int addNumbers() {
	System.out.println("*************addNumber() started************");
	int num1=10, num2=20;
	System.out.println("***********addNumners() before return*******");
	return num1+num2;
	
	}
   static double addNumbers(int num1,int num2) {
		System.out.println("********* addNumbers(int,int) started *********");		
		System.out.println("********* addNumbers(int,int) before return *********");
		return num1+num2;		
	}	
	static int addNumbers(int num1,int num2,int num3) {
	System.out.println("********* addNumbers(int,int,int) started *********");		
	System.out.println("********* addNumbers(int,int,int) before return *********");
		return num1+num2+num3;		
	}
	static double addNumbers(int num1,double num2,int num3) {
	System.out.println("********* addNumbers(int,double,int) started *********");		
	System.out.println("********* addNumbers(int,double,int) before return *********");
		return num1+num2+num3;	
	}	
	static double addNumbers(int num1,double num2,int num3,double num4) {
		System.out.println("********* addNumbers(int,double,int,double) started *********");		
		System.out.println("********* addNumbers(int,double,int,double) before return *********");
			return num1+num2+num3+num4;	
		}	
	public static void main(String[] args) {
		System.out.println("Program Start......");
		System.out.println("Sum1: "+addNumbers());
		System.out.println("Sum2: "+addNumbers(25,36));
		System.out.println("Sum3: "+addNumbers(47,78,96));
		System.out.println("Sum4: "+addNumbers(48,59.26,89));
		System.out.println("Sum5: "+addNumbers(49,26.57,48,45.45));
		System.out.println("Program Ends......");
			
		}
}
