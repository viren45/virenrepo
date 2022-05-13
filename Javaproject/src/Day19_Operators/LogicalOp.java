package Day19_Operators;

public class LogicalOp {

	public static void main(String[] args) {
	
	int	age =18;
	char blgrp='A';
	boolean res1 , res2;
	res1 =(age>18);
	res2 =(blgrp=='A');
	System.out.println("Result1: "+res1);
	System.out.println("Result: "+res2);
	
	//Logical AND
	System.out.println("bool1 && bol2: "+(res1 && res2));
	
	//Logical OR
	System.out.println("bool1 || bol2: "+(res1 || res2));
	
	//Logical NOT with Logical AND
	System.out.println("!(bool1 && bol2): "+!(res1 && res2));
	
	//Logical NOT with Logical OR
		System.out.println("!(bool1 || bol2): "+!(res1 || res2));
	}

}
