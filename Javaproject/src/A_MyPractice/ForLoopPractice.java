package A_MyPractice;

public class ForLoopPractice {

	public static void main(String[] args) {
	
		System.out.println("Prime number frome 1 to 100 are: ");
		
		int primect = 0;
		
		for (int i=1; i<=100; i++) {
		
		int counter=0;
		
		for(int num=i; num>=1; num--) {
			
			if(i%num == 0) {
				counter = ++counter;
				
			}
		}
			
			if(counter==2) {
				System.out.println("Prime Number: "+i);
				primect++;
			}
			
		}
		System.out.println("The Total Prime Number count: "+primect);

	}

}

