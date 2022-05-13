package Day22_IfConditions;

public class PrimeNumber2 {

	public static void main(String[] args) {
	System.out.println("Given Number is Prime Or Not: "+checkprimenumber(7));
	checkprimenumbertillpassednumber(7);	
	}
	static boolean checkprimenumber(int num) {
		int counter = 0;
		if (num > 1) {
			for (int i=1; i<=num; i++) {
				if (num % i == 0) {
					counter = ++counter;
				}
			}
		if (counter == 2) {
			System.out.println("Prime Number: "+num);
			return true;
			
		}
		else {
			System.out.println("Given Number is Not Prime: "+num);
			return false;
		}
		}
		else {
			System.out.println("Given Number is Not Prime: "+num);
			return false;
		}
}
	static void checkprimenumbertillpassednumber(int num) {
		
	}
}



