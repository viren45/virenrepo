package Day12_Variables;

public class NonStaticvariable1 {

	int mobilenumber=123;//non static global variable
	
	public static void main(String[] args) {
	System.out.println("program start.......\n");
	
	NonStaticvariable1 ref = new NonStaticvariable1();
	
	System.out.println("1st ref. NonStaticvariable: "+ref.mobilenumber);//123
	
	ref.mobilenumber=456;
	
	System.out.println("1st ref. updated NonStaticvariable: "+ref.mobilenumber);//456
	
	NonStaticvariable1 ref2 = new NonStaticvariable1();
	System.out.println("2nd ref. Nonstaticvariable: "+ref2.mobilenumber);//123
	System.out.println("\nprogram end.....");
	

	}

}






//syntax to print a non static global variable is classname ref = new classname();


