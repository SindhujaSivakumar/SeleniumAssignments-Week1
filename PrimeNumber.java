package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=13;
		boolean flag = true;
		for (int i=2;i<=n/2;i++) {
			int a = n%i;
			if (a == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is not a prime number");
		
	}

}
