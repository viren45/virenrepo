package A_MyPractice;

public class Overloading1 {
	
	void getOverloading(int a, int b) {
		System.out.println("I am the int int para method");
	}
	void getOverloading(double a, int b) {
		System.out.println("I am the double int para method");
	}
	void getOverloading(char a , int b) {
		System.out.println("I am the char int para method");
	}
	static void vp(int a, int b) {
		System.out.println("I am the vp method");
	}

	public static void main(String[] args) {
	
	Overloading1 v1 = new Overloading1();
	
	v1.getOverloading(45, 78);
	v1.getOverloading('A', 79);
	v1.getOverloading(45.28, 41);
	v1.vp(25,36);

	}

}
