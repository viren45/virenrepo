package Day31_Inheritance;

//final methods cannot be overridden
class Parent3 {
	// Can't be overridden
	 void show() {
		System.out.println("I am final method of Parents class");
	}
}
class Child3 extends Parent3 {
	// This would produce error if the parent class are declare with private keyword
	@Override
	void show() {
		System.out.println("I am show method of child3 class");
	}
}
//Driver class
public class Overriding7 {
	public static void main(String[] args) {
		
	Child3 v1=new Child3();	
	
	v1.show();

	}
}