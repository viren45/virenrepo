package Day12_Variables;

public class Variable1 {
	
	double salary;
	static char grade;
	int age=28;
	static int empId=123;
			
	public static void main(String[] args) {
	
	int empId=456;
	
	System.out.println("program start....\n");
	
	System.out.println("***************************\n");

	
	System.out.println("Local empId with std.: "+empId);
	System.out.println("SGV empID with std: "+Variable1.empId);
	System.out.println("SGV grade without std: "+grade);
	System.out.println("SGV grade with std: "+Variable1.grade);
	
	System.out.println("\n***************************\n");

	Variable1 v1 = new Variable1();
	
	System.out.println("NSGV salary with std: "+v1.salary);
	System.out.println("NSGV age with std: "+v1.age);
	
	System.out.println("\n***************************\n");

	Variable1 v2 = new Variable1();
	
	v2.salary=45000;
	v2.age=30;
	
	System.out.println("NSGV salary with std: "+v2.salary);
	System.out.println("NSGV age with std: "+v2.age);
	
	System.out.println("\n***************************\n");

	
	System.out.println("program end.....");


	}

}
