package Day37_javaPackage2;

import Day37_javaPackage1.ProtectedMembers;

class AccessProtectedMembers2 extends ProtectedMembers {

	public static void main(String[] args) {
		
		AccessProtectedMembers2 p1=new AccessProtectedMembers2();
		System.out.println("Accessing Protected members from another class outside of package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}