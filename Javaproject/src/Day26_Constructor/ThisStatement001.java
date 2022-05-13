package Day26_Constructor;

public class ThisStatement001 {
	
	ThisStatement001()
	{
	    this('A',45.40);
		System.out.println("********Zero-Param*********");
	}
	ThisStatement001(int age)
	{
		
		System.out.println("********int-Param*********");
	}
	ThisStatement001(char c , double d)
	{
		this(10);
		System.out.println("********char-double-Param*********");
	}

	public static void main(String[] args) {
	
		ThisStatement001 t1= new ThisStatement001();

	}

}
