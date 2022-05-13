package Day26_Constructor;

class c{
	double i =10.23;
	c(double j){
		System.out.println("Running class C counstructor");
		i = j;
	}
}

public class Cons6 {

	public static void main(String[] args) {
	
		System.out.println("Main() of class cons6 is started...");
		c b1 = new c(15);
		System.out.println("class c globle variable i = " + b1.i);
		System.out.println("*****************************");
		c b2 = new c(0.32);
		System.out.println("class c globle variable i = " + b2.i);
		System.out.println("Main() of class cons6 is started...");	

	}

}
