package Day25_Blocks;

public class Blocks6 {
	/*static block or SIB*/
	static {
		System.out.println("Running static block-1");
	}
	/*non static block or IIB*/
	{
		System.out.println("Running non-static block-1");
	}

	public static void main(String[] args) {
	System.out.println("main() starts..");
	Blocks6 b1=new Blocks6();
	System.out.println("**********************");
	Blocks6 b2=new Blocks6();
	System.out.println("main() ends..");
	}
	/*static block or SIB*/
	static {
		System.out.println("Running static block-2");
	}
	/*non static block or IIB*/
	{
		System.out.println("Running non-static block-2");
	}

	}


