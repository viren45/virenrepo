package Day31_Inheritance;

class Animal2 {
	public void move() {
		System.out.println("Animals can move");
	}
}
class Dog2 extends Animal2 {
	@Override
	public void move() {
		super.move(); // 
		System.out.println("Dogs can walk and run");
	}
}
public class Overriding2 {

	public static void main(String args[]) {
		Animal2 b = new Dog2(); // Animal reference but Dog object
		b.move(); //
	}
}
