package Day23_WhileLoop;

public class WhileLoop2 {

	public static void main(String[] args) {
	
	int i = 4;
	System.out.println("Printing Numbers from 4 to 0");
	
	while (i>=0) {
	System.out.println("Hello "+i);
	i--;
	}
	char c1 = 'a';
	System.out.println("\nPrinting alphabates from a to z\n");
	
	while (c1<'z') {
		System.out.print(c1+ " ");	
		c1++;
	}
	System.out.println("\n\nPrinting alphabates from z to a\n");
	
	char c2 = 'z';
	while (c2>'a') {
	System.out.print(c2+ " ");	
	c2--;
	}
	}

}
