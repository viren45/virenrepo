package Day12_Variables;

public class StaticGlobalVariable2 {
	
	static int age=25;
	public static void main(String[] args) {
	System.out.println("program start....\n");
	System.out.println("SGV: "+age);
	System.out.println("SGV with std.: "+age);
	
	age=30;
	
	System.out.println("SGV: "+age);
	System.out.println("SGV with std.: "+age);
	System.out.println("\nprogram end....");
   

	}

}
