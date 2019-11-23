package CoreJava;

public class MaxNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]= {{2,4,6},{1,3,8},{9,2,5}};
		int max= abc[0][0];
		
		for(int i=0;i<abc.length;i++){
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]>max)
				{
					max=abc[i][j];
				}
					
			}
		}
		System.out.println(max);
	}

}
