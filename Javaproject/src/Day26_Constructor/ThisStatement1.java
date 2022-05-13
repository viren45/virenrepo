package Day26_Constructor;

class A1{
	A1()
	{
		this(10);
		System.out.println("Hello Zero");
	}
	A1(double d)
	{
		
		System.out.println("Hello double "+d);
	}
	A1(int x)
	{
		this(10.23);
		System.out.println("Hello int "+x);
	}
}
	
public class ThisStatement1 {
	
	public static void main(String[] args) {
		//A1 a1=new A1();
		//A1 a2=new A1(10);
		//A1 a3=new A1(10.23);
		     //or
		A1 a1 = new A1();
	
	}

}
