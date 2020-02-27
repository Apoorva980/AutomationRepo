package arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] arr = new String [3][2];
		
		//Row1
		
		arr[0][0] = "Sneha";
		arr[0][1] = "Apoorva";
		
		//Row2
		arr[1][0]= "Pallavi";
		arr[1][1]= "Prachi";
		
		//Row3
		arr[2][0]= "abhishek";
		arr[2][1]= "Yogesh";

	// for definite value
	
	/*for (int r=0; r<=2; r++)
	{
		for (int c=0; c<=1; c++)*/
		
		// for indefinite value
		
		for (int r =0; r<arr.length; r++)
			
		{
			for (int c=0; c<arr [r].length; c++)
			{
			System.out.print(arr[r][c]+ ",");
			
			
			
		}
	System.out.println();
		
	}

	}
}
