package A_MyPractice;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(); 
		int col = sc.nextInt();
		
		System.out.println("\n*******input arrays*********\n");
		
		int [][] number = new int[row][col];
		
		//input rows
		for(int i=0; i<row; i++) {
			//input column
			for(int j=0; j<col; j++) {
				
				number[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("\n*******output arrays*********\n");
		//output rows
		for(int i=0; i<row; i++) {
			//output column
			for(int j=0; j<col; j++) {
				System.out.print(number[i][j] + " ");
				
			}
			System.out.println();
		}

	}

}
