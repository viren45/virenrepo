package Day22_IfConditions;

public class ReverseNumber2 {

	public static void main(String[] args) {
	
	int num = 123456789 , rev=0 , rem=0;
	while (num!=0) {
		rem=num % 10;
		rev=rev*10+rem;
		num = num/10;
	}
	System.out.println("Reverse Number: "+rev);

	}

}
