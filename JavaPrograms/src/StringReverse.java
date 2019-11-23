import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ,result;
		System.out.println("Enter the string " );
		Scanner inputReader = new Scanner(System.in);
		str = inputReader.nextLine();
		result = "";
		for (int i = str.length()-1 ; i>=0 ;i--)
		{
			result = result + str.charAt(i);
		
		}
		System.out.println("Reversed String : " +result);
		
	}

}
