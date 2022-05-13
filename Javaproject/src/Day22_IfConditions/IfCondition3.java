package Day22_IfConditions;

public class IfCondition3 {

	public static void main(String[] args) {
	//creating two variable for age and weight
	int age = 17;
	int weight = 51;
	//applying condition on age and weight
	if (age >= 18) {
	if (weight > 50) {
	System.out.println("You are eligible to donate the blood");		
	}
	else {
	System.out.println("you are not eligible to donate blood as your weight is below 50");		
	}
	}
	else {
	System.out.println("you are not eligible to donate blood as your age is below 18");		
	}
	
	}

}
