package A_MyPractice;

public class Method9 {

	public static void main(String[] args) {
	
		System.out.println("Program Start.....");
		Method9 a1=new Method9();
		a1.display();
		a1.display();
		a1.display();
		a1.display();
		System.out.println("Program Ends....."); 
	}
	void display(){
	System.out.println("******display() without param started******");
	int age=30,salary=45000;
	char grade='A';
	System.out.println("Age is: "+age);
	System.out.println("Grade is: "+grade);
	System.out.println("Salary is: "+salary);
	System.out.println("******display() without param ends******");
	}
	void dislay(char grade, int age,int salary) {
	System.out.println("******display(int,int,char) with param started******");
	System.out.println("Grade is: "+grade);
	System.out.println("Salary is: "+salary);
	System.out.println("Age is: "+age);
	System.out.println("******display(int,int,char) with param ends******");
	}
	void dislay(int age,char grade,int salary) {
	System.out.println("******display(int,char,int) with param started******");
	System.out.println("Age is: "+age);
	System.out.println("Grade is: "+grade);
	System.out.println("Salary is: "+salary);
	System.out.println("******display(int,char,int) with param ends******");
	}
	void dislay(int age) {
	System.out.println("******display(int) with param started******");
	System.out.println("Age is: "+age);	
	System.out.println("******display(int) with param ends******");
}
	void dislay(char grade) {
	System.out.println("******display(char) with param started******");
	System.out.println("Age is: "+grade);
	System.out.println("******display(char) with param ends******");
}
}	
