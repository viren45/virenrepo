package A_MyPractice;

public class StaticGlobleVariable {
	
    static int mobilenumber=123;
    
	public static void main(String[] args) {
	System.out.println("program start.....\n");	
	System.out.println("SGV: "+mobilenumber);
	System.out.println("SGV with standard: "+StaticGlobleVariable.mobilenumber);
	
	System.out.println("********************************");
	
	mobilenumber=456;
	System.out.println("SGV: "+mobilenumber);
	System.out.println("SGV with standard: "+StaticGlobleVariable.mobilenumber);
	
	System.out.println("********************************");
	
	int mobilenumber=789;
	System.out.println("Local variable: "+mobilenumber);
	System.out.println("SGV with standard: "+StaticGlobleVariable.mobilenumber);
	System.out.println("\nprogram end......");
		

	}

}
