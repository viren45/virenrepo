package Day15_Methods;
	
	class SuperClass{
		void msg(int x , int y) {
		System.out.println("Hello java");
	}
}
	class SubClass{
		void msg(double x , double y) {
			System.out.println("Welcome you in java programming");
		}
	}
	
public class MethodOverloading8 {

	public static void main(String[] args) {
	SubClass sc = new SubClass();
	sc.msg(10,20);
	sc.msg(45,40);
	
	SuperClass sc1 = new SuperClass();
	sc1.msg(20,45);

	}
}

