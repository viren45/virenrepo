package Day31_Inheritance;

class A2 {
	void msg() {
		System.out.println("Hello");
	}
}
class B2 {
	void msg(int a) {
		System.out.println("Welcome");
	}
}
class Inheritance5 extends A2{
	
	Inheritance5(){
		super();//confusion 
	}

	public static void main(String args[]) {
		Inheritance5 obj = new Inheritance5();
		obj.msg();
	}
}


/**
 *multiple inheritance is not possible in java 
*Inheritance : inherit the subclass to more than one super class that time 
*using super statement compiler got confused/ambiguity due to which class get called because of this 
*confusion at compile time he will throw error
*/