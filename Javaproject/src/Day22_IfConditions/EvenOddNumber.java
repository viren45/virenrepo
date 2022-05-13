package Day22_IfConditions;

public class EvenOddNumber {

	public static void main(String[] args) {
	int num =10;
	for (int i=1; i<num; i++) {
		if (i % 2 == 0) {
			System.out.println("Given Number is Even:  "+i);
		}
		else {
			System.out.println("Given Number is Odd:  "+i);	
		}
	}

	}

}
