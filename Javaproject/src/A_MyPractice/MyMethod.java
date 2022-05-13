package A_MyPractice;

public class MyMethod {

	public static void main(String[] args) {
	System.out.println("....with non-static...");
	MyMethod v1=new MyMethod();
	int res=v1.getaddition(75,36);
	int get=res*75;
	System.out.println("\nAddition Result: "+res);
	System.out.println("\nMultiplication Result: "+get);
	System.out.println("\n.....with static.....");
	
	int res2=MyMethod.additionresult(85, 95);
	double mul=res2*85;
	System.out.println("\nAddition Result: "+res2);
	System.out.println("\nMultiplication Result: "+mul);
	}
	public int getaddition(int a, int b) {
	int res=a+b;
	return res;
	}
	public static int additionresult(int c, int d) {
	int res=c+d;
	return res;
	}

}
