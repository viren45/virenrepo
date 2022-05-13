package A_MyPractice;

public class Method8 {

	public static void main(String[] args) {
	System.out.println("program start...");
	Method8 m1=new Method8();
	System.out.println("---------------------------------------");
	m1.display();
	System.out.println("---------------------------------------");
	m1.display('B',29,55000);
	System.out.println("---------------------------------------");
	m1.display('A',32,45000);
	System.out.println("---------------------------------------");
	m1.display('C',23,25000);
	System.out.println("---------------------------------------");
	m1.display(29,'A',25000);
	System.out.println("---------------------------------------");
	System.out.println("program ends...");

	}
	void display() {
	System.out.println("********display() without pm start*********");
	char grade='A';
	int age=30,salary=45000;
	System.out.println("Grade is: "+grade);
	System.out.println("Age is: "+age);
	System.out.println("Salary is: "+salary);
	System.out.println("********display() without pm end*********");
	}
	void display(char grade, int age,int salary) {
	System.out.println("********display(char,int,int) with pm start*********");
	System.out.println("Grade is: "+grade);
	System.out.println("Age is: "+age);
	System.out.println("Salary is: "+salary);	
	System.out.println("********display(char,int,int) with pm end*********");
	}
	void display(int age,char grade,int salary) {
	System.out.println("********display(char,int,int) with pm start*********");	
	System.out.println("Grade is: "+grade);
	System.out.println("Age is: "+age);
	System.out.println("Salary is: "+salary);
	System.out.println("********display(char,int,int) with pm end*********");	
	}
	void display(int age) {
	System.out.println("********display(int) with pm start*********");	
	System.out.println("Age is: "+age);
	System.out.println("********display(int) with pm end*********");	
	}
	void display(char grade) {
	System.out.println("********display(char) with pm start*********");	
	System.out.println("Grade is: "+grade);
	System.out.println("********display(char) with pm start*********");
	}

}
