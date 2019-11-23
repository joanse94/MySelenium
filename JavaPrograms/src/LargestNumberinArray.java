
public class LargestNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,12,15,19,25,30};
		int val =arr[0];
		for (int i=0;i<=arr.length - 1 ; i++)
		{
			if(arr[i]>=val) {
				val = arr[i];
			
		}
			
	}System.out.println("The Largest number is "+val);
}
}