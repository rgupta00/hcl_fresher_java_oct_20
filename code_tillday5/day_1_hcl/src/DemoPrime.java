import java.util.Scanner;

public class DemoPrime {
	public static void main(String[] args) {
		
		//modularity: functions
		//boolean primeChecker(int no)
		
		// check for prime no
		// 1. take the value from the user

		System.out.println("pl enter two no bw which u want to calculate prime no");
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();

		int counter=primeCounter(n1, n2);
	
		System.out.println(counter);

	}



	public static int  primeCounter(int n1, int n2) {
		int counter=0;
		for(int j=n1 ; j<=n2; j++){
			if(primeChecker(j)) {
				counter =counter+1;
			}
		}
		
		return counter;
	}
	
	
	
	static boolean  primeChecker(int no) {
		if(no<=1) {
			return false;
		}
		boolean isPrime = true;// let assueme no is a prime no

		// Ctr+ shift + F
		for (int i = 2; i <=no/2; i++) {
			 if (no % i == 0) {
				isPrime = false;// our assumption was wrong, then 
				break;// what hell i am doing in this loop, comes out of it
				
			}
		}
		return isPrime;
	}
}
