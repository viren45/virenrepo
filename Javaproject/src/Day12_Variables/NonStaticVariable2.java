package Day12_Variables;

public class NonStaticVariable2 {
	
	int mobilenumber=123;
	char grade;
	public static void main(String[] args) {
	
	System.out.println("program start.......\n");	
	
	System.out.println("************r1 object***********\n");
	
	NonStaticVariable2 r1 = new NonStaticVariable2();
	
	System.out.println("mobilenumber with r1 reference: "+r1.mobilenumber);
	System.out.println("grade with r1 reference: "+r1.grade);
	
	System.out.println("\n************x1 object***********\n");
	
	NonStaticVariable2 x1 = new NonStaticVariable2();
	
	System.out.println("mobilenumber with x1 reference: "+x1.mobilenumber);
	System.out.println("grade with x1 reference: "+x1.grade);
	
	System.out.println("\n************updated x1 object***********\n");
	
	x1.mobilenumber=789;
	x1.grade='A';
	
	System.out.println("updated mobilenumber with x1 reference: "+x1.mobilenumber);
	System.out.println("updated grade with x1 reference: "+x1.grade);
	
	System.out.println("\n************r2 object***********\n");
	
	NonStaticVariable2 r2 = new NonStaticVariable2();
	
	System.out.println("mobilenumber with r2 reference: "+r2.mobilenumber);
	System.out.println("grade with r2 reference: "+r2.grade);
	
	System.out.println("\nprogram end......");
	
	}

}
