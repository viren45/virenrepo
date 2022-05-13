package Day22_IfConditions;

public class IfCondition1 {

	public static void main(String[] args) {
	
	int num1 = 45 , num2=30;
	
	if (!(num1 == num2)) {
	System.out.println("Number1 is greater than Number2");
	}
	else {
	System.out.println("Number1 is smaller than Number2");	
	}
	if (num1 > num2) {
	System.out.println("\nNumber1 is greater than Number2");
	}
	else {
	System.out.println("\nNumber1 is smaller than Number2");
	}
	if (num1 >= num2) {
	System.out.println("\nNumber1 is greater than or equal to Number2");
	}
	else {
	System.out.println("\nNumber1 is less than or equal to Number2");
	}
	if (num1 <= num2) {
		System.out.println("\nNumber1 is greater than or equal to Number2");
	}
	else {
	System.out.println("\nNumber1 is less than or equal to Number2");
	}
	if (num1 >= num2  && num1 > num2) {
	System.out.println("\nNumber1 is greater than or equal to Number2");
	}
	else {
	System.out.println("\nNumber1 is smaller than Number2");	
	}
	if (num1 == num2) {
	System.out.println("\nNumber1 is equal to Number2");
	}
	else if (num1 > num2) {	
	System.out.println("\nNumber1 is greater than Number2");	
	}
	else {
	System.out.println("\nNumber1 is smaller than Number2");	
	}
	int sub1 = 50 , sub2 = 45;
	if (sub1 >= 35 && sub2 >= 35) {
	System.out.println("\nPass.......");
	}
	else {
	System.out.println("\nFail.......");	
	}

	}
}





