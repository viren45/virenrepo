package Day26_Constructor;

public class Cons1 {
	
	Cons1 (){
		System.out.println("This is Zero-Para consructor..");
	}
	
	Cons1 (char c){
		System.out.println("This is Single-Para consructor..");
	}
	Cons1 (int num1 , int num2){
		System.out.println("This is int-int-Para consructor..");
	}
	
	Cons1 (double num1 , int num2){
		System.out.println("This is double-int-Para consructor..");
	}
	Cons1 (int num1 , double num2){
		System.out.println("This is intdouble-Para consructor..");
	}
	
	public static void main(String[] args) {
	Cons1 c1 = new Cons1();
	Cons1 c2 = new Cons1('d');
	Cons1 c3 = new Cons1(45,45);	
	Cons1 c4 = new Cons1(45.25,78);
	Cons1 c5 = new Cons1(41,50.25);
	
	}

}
