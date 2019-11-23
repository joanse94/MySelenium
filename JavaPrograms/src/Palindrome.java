import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,rev;
		System.out.println("Enter the String:");
		Scanner input = new Scanner(System.in);
		str =input.nextLine();
		rev = "";
		for (int i=str.length() - 1 ; i>=0; i--)
		{
			rev =rev +str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev))
			System.out.println(str+" is a Palindrome");
		else
			System.out.println(str+" is not a palindrome");
		
	}

}
