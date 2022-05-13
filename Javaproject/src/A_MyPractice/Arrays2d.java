package A_MyPractice;

import java.util.Scanner;

//Q).Take a matrix as input from the user. Search for a given number x 
//and print the indices at which it occurs.

public class Arrays2d {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 int row = sc.nextInt();
	 int col = sc.nextInt();
	 
	 int number[][] = new int[row][col];
	 
	 int x = sc.nextInt();
	 
	 for(int i=0; i<row; i++) {
		 for(int j=0; j<col; j++) {
			 //Compare with x
			 if(number[row][col]==x) {
				 System.out.println("X found at location: "+ i + "," +j+ ",");
			 }
		 }
	 }
	 

	}

}
