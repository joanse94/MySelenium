import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the Number");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int count = 0;
		for (int i = 2; i < n; i++) {
			//System.out.println(n%i);
			if ((n % i) == 0) {
				count++;
			}
		}

		System.out.println("Count = " + count);
		if (count == 0) {
			System.out.println("The number " + n + " is a prime number.");
		} else {
			System.out.println("Not a prime number");
		}
	}

}
