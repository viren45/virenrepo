package A_MyPractice;

public class MyClassMethod {

	public static void main(String[] args) {
    
   System.out.println("Program Start....");
   MyClassMethod v1=new MyClassMethod();
   v1.additionresult(25, 27);
   
   int res=v1.getadditionresult(26,28);
   System.out.println("Result: "+res);
   double total=res*100;
   System.out.println("Total double result: "+total);
		
   System.out.println("Program End...");
	}
	public void additionresult(int a, int b) {
		int res=a+b;
		System.out.println("Addition Result is : "+res);
	}
	public int getadditionresult(int a, int b) {
		int res=a+b;
		return res;
	}
}
