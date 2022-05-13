package Day26_Constructor;

class student101{
	int rollno;
	float fee;
	student101(int rollno){
		this.rollno = rollno;
	}
	student101(int rollno, float fee){
		this(rollno);
		this.fee = fee;
	}
	void display() {
		System.out.println(rollno + " " + fee);
	}
}

public class ThisStatement3 {

	public static void main(String[] args) {
		System.out.println("************Creating S1 object***********");
		
		student101 s1 = new student101(111);
		System.out.println(s1.rollno + " " + s1.fee);
	
		System.out.println("************Creating S2 object***********");
		
		student101 s2 = new student101(112 , 6000f);
		System.out.println(s2.rollno + " " + s2.fee);
		
		System.out.println("**********display()***************");
		s1.display();
		s2.display();

	}

}
