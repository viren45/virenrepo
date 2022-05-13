package Day25_Blocks;

public class Blocks1 {
	
	static {
		display();
		System.out.println("Runnung static block1...");
	}

	public static void main(String[] args) {
		System.out.println("Main() starts...");
		System.out.println("I am main() of block1 class...");
		System.out.println("Main() ends...");
	}

	static {
		System.out.println("Runnung static block2...");
	}
	static void display() {
		System.out.println("Runnung display()...");	
	}
}
