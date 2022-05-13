package Day37_javaPackage1;

public class PrivateMembers {

	public int accNum=12345;
    public void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
//class AccessPrivateMembers2 {
//
//	public static void main(String[] args) {
//		
//		PrivateMembers p1=new PrivateMembers();
//		System.out.println(p1.accNum);
//		p1.displayAccNum();
//	}
//
//}