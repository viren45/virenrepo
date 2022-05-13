package TestNG;

import org.testng.annotations.Test;

public class Example3 {
	
	@Test
	public void testcase8() {
		desplayDetails();
		System.out.println("Hello I am TC8 of testcase8 ().....");
	}
	
	@Test
	public void testcase7() {
		desplayDetails();
		System.out.println("hello I am TC7 of testcase7 ()...");
	}
	
	void desplayDetails() {
		System.out.println("Hello I am DisplayDetails() of testcase7 ()...");
	}

}
                                