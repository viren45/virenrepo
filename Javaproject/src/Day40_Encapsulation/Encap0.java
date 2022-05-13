package Day40_Encapsulation;

class Demo{
	private int empID=1000;
	private double salary =45000;
	//using getter concept to access the private data members outside the class
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class Encap0 {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		//System.out.println(d1.empID);// compile time error
		//System.out.println(d1.salary);// compile time error
		System.out.println("Emp ID is : "+d1.getEmpID());
		System.out.println("Salary ID is : "+d1.getSalary());
		System.out.println("*****************After setter***************************");
		d1.setEmpID(102);
		d1.setSalary(450000);
		System.out.println("Emp ID is : "+d1.getEmpID());
		System.out.println("Salary ID is : "+d1.getSalary());
		System.out.println("*************************************************");
		Demo d2=new Demo();
		System.out.println("Emp ID is : "+d2.getEmpID());
		System.out.println("Salary ID is : "+d2.getSalary());
	}
}

/**
 * In order to access private variable outside the class we need implement getter method
 * 		--> getter method--> helps to access private variable from outside the class
 * 				--> declared with public 
 * 				--> return type of this method should be same as private variable
 * 				--> it should return private variable
 * In order to modify private variable outside the class we need implement setter method
 * 		--> setter method--> helps to modify private variable from outside the class
 * 				--> declared with public 
 * 				--> return type of this method is void 
 * 				--> parameter datatype should be same as private variable
 * 
 * 
 */