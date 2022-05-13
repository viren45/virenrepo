package Day26_Constructor;

public class Cons2 {
	
	int age;
	double salary;
	/*
	 * below is default constructor that will be written by java compiler it's not seen in program
	 * 
	 * Cons3(){
	 *      //empty body
	 *   }
	 */
	public static void main(String[] args) {
	
	Cons2 c1 = new Cons2();
	
	System.out.println(c1.age);//at this time java compiler get default value of globle variable is 0
	
	System.out.println(c1.salary);//at this time java compiler get default value of globle variable is 0.0
		

	}

}
