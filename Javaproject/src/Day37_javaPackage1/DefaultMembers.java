package Day37_javaPackage1;

public class DefaultMembers {

	public int accNum=12345;
	public void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		DefaultMembers p1=new DefaultMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessDefaultMembers {

	public static void main(String[] args) {
		
		DefaultMembers p1=new DefaultMembers();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}