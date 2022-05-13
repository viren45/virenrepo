package A_MyPractice;

public class MethodOverloading3 {

	public static void main(String[] args) {
	System.out.println("Program Start.....");
	MethodOverloading3 x1=new MethodOverloading3();
	System.out.println("Sum1: "+x1.addNumbers());
	System.out.println("Sum2: "+x1.addNumbers(25,32));
	System.out.println("Sum2: "+x1.addNumbers(25.23,32.36));
	System.out.println("Sum2: "+x1.addNumbers(25,32,45));
	System.out.println("Sum2: "+x1.addNumbers(25,32.45,58));
	System.out.println("Program Ends.....");
	}
	void display() {
	System.out.println("I am in pune");
 }
	int addNumbers() {
	System.out.println("************addNumber() started********");
	int num1=10,num2=20;
	System.out.println("************addNumber() before return********");
	return num1+num2;
	}
	int addNumbers(int num1,int num2) {
	System.out.println("************addNumber(int,int) started********");
	System.out.println("************addNumber(int,int) before return********");
	return num1+num2;
	}
	double addNumbers(double num1,double num2) {
	System.out.println("************addNumber(double,double) started********");
	System.out.println("************addNumber(double,double) before return********");
	return num1+num2;
	}
	int addNumbers(int num1,int num2,int num3) {
	System.out.println("************addNumber(int,int,int) started********");	
	System.out.println("************addNumber(int,int,int) before return********");
	return num1+num2;
	}
	double addNumbers(int num1,double num2,int num3) {
	System.out.println("************addNumber(int,double,int) started********");
	System.out.println("************addNumber(int,double,int) before return********");
	return num1+num2;
	}
}

