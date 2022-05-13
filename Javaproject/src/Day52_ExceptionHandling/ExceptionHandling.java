package Day52_ExceptionHandling;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		//1. abnormal statements
		int i = 10;
		try {
		int j = i/0;//ArithmeticException
		System.out.println("res: "+j);
		}
		catch(ArithmeticException obj) {
			System.out.println("Exception handle: "+obj);
		}
		//2. abnormal statements
		int[] empIds=new int[3];
		empIds[2]=101;//ArrayIndexOutOfBoundsException 
		//3. abnormal statements
		String str=null;
		//System.out.println(str.length());//NullPointerException  
		//4. abnormal statements
		//String s="abc";  
		//int num=Integer.parseInt(s);//NumberFormatException  
		//System.out.println("num: "+num);
		System.out.println("Programs ends here...");
	}
}
