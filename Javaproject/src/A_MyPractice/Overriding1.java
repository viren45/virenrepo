package A_MyPractice;

class vp {
	vp(){
		System.out.println("I am Cool");
	}
	void mp() {
		System.out.println("I am class vp Method");
	}
}
class sp extends vp {
	sp(){
		System.out.println("I am also Cool");
	}
	void mp() {
		System.out.println("I am class sp method");
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		sp v1 = new sp();
		v1.mp();
		System.out.println("\n");
		vp v2 = new vp();
		v2.mp();
		System.out.println("\n");
		vp v3 = new sp();
		v3.mp();
	

	}

}
