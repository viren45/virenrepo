package Day19_Operators;

public class UnaryOp3 {

	public static void main(String[] args) {
	
	int a = 0, b;
	b = a++ + ++a + ++a +a;
	System.out.println("a: "+a);
	System.out.println("b: "+b);
	
	a = -5;
	b = a-- + --a + --a + a;
	System.out.println("\na: "+a);
	System.out.println("b: "+b);
	
	a = 21;
	b = --a + --a + --a + a + ++a + a++;
	System.out.println("\na: "+a);
	System.out.println("b: "+b);
	
	a = -2;
	b = a-- + a + ++a + a + ++a + a++ + a;
	System.out.println("\na: "+a);
	System.out.println("b: "+b);

	}

}
