package Day22_ForLoop;

public class ForLoop3 {

	public static void main(String[] args) {
	
	for (char c1='a'; c1<='z';c1++) {
	System.out.print(c1+ " ");		
	}
	System.out.print("\n\n**************print in Capital**************\n\n");
	
	for (char c1='A'; c1<='Z'; c1++){
	System.out.print(c1+ " ");	
	}
	System.out.print("\n\n**********print in reverse Capital**********\n\n");
	
	for (char c1='Z'; c1>='A'; c1--){
	System.out.println(c1+ " ");	
	
	}

	for (int v1=2000; v1<=2022; v1++) {
	System.out.print(v1+ " ");	
	}
	System.out.print("\n\n**************print years**************\n\n");
	
}
}