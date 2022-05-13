package Day40_Encapsulation;

class vp {
	private int empID = 45;
	private double salary = 45000;

	public int getempID() {
		return empID;
	}

	public double getSalary() {
		return salary;
	}

	public void setempID(int empID) {
		this.empID = empID;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class MyEncap {

	public static void main(String[] args) {

		vp v1 = new vp();

		System.out.println("empID is: " + v1.getempID());

		System.out.println("Salary is: " + v1.getSalary());

		v1.setempID(50);

		v1.setSalary(50000);

		System.out.println("empID is: " + v1.getempID());

		System.out.println("Salary is: " + v1.getSalary());

	}

}
