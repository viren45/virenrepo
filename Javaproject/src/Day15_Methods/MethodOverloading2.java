package Day15_Methods;

public class MethodOverloading2 {
		
	public void square() {
	System.out.println("\nNo parameter method called");
	
	}
	public void square(int number) {
	int square=number*number;
	System.out.println("\nMethod with parameter int called: "+square);
    }
    public void square(float number) {
    float square=number*number;
    System.out.println("Method with parameter float called: "+square);
    }
    public static void main(String[]args) {
    MethodOverloading2 obj = new MethodOverloading2();
    obj.square(2.5f);
    obj.square();
    obj.square(5);
    }
}

