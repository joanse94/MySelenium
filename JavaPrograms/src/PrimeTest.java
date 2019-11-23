import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count =0;
		System.out.println("Enter the Number :");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		for (int i =2 ; i< n ;i++)
		{
			if((n%i)==0)
				count++;
				
		}System.out.println("Count : "+count);
		if(count == 0)
			System.out.println("The Number " +n+ " is a Prime  number");
		else
			System.out.println(n+" is not a prime number");
	}

}
