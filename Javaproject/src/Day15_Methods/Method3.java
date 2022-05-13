package Day15_Methods;

public class Method3 {

		public static void printDetails(int age, int salary) {
			System.out.println("\nHi, Good morning Everyone");
			System.out.println("Staying in Pune");
			System.out.println("I am "+age+" yrs old");
			System.out.println("I am getting "+salary);
			//return;//optional because if you don't write it dn java compiler will write it
		}
		public static void main(String[] args) {
			
			Method3.printDetails(25, 96000);
			Method3.printDetails(24, 80000);
			Method3.printDetails(23, 85000);
			Method3.printDetails(26, 75000);
			Method3.printDetails(27, 75000);
			Method3.printDetails(28, 65000);
			Method3.printDetails(32, 95000);
			Method3.printDetails(31, 55000);
			Method3.printDetails(36, 57000);
			Method3.printDetails(23, 45202);
			
		}
		
	}	

