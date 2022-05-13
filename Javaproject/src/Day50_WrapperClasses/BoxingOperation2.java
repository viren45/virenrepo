package Day50_WrapperClasses;

public class BoxingOperation2 {

	public static void main(String[] args) {

		char c1 = 'A';

		Character charObj1 = new Character(c1);// Boxing

		System.out.println(c1 == charObj1);

		Character charObj2 = new Character('Z');

		Character charObj3 = 'H'; // Boxing

		System.out.println("\nc1: " + c1);

		System.out.println("\ncharObj1: " + charObj1);

		System.out.println("\ncharObj2: " + charObj2);

		System.out.println("\ncharObj3: " + charObj3);

		boolean b = true;

		Boolean bObj = new Boolean(b);

		System.out.println();

		System.out.println(bObj == b);

	}

}
