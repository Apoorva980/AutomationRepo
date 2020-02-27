package arrays;

public class TwoDimensionArray {
	public static void main(String[] args) {
		
		String [][] arr = new String [3][2];
		
		arr [0][1] = "Sneha";
		arr [0][2] = "Apoorva";
		
		arr[1][1] ="beta";
		arr[1][2]="alpha";
		
		arr [2][1] = "sima";
		arr [2][2] = "jima";
		
		/*for (int r=0; r<=2; r++)
		{
			for (int c =0; c<=1; c++) */
		
		for (int r =0; r<arr.length; r++)
		{
			for (int c=0; c<arr.length; c++)
			
			System.out.print(arr[r][c]+ ",");
		}
				
	System.out.println();
	}

	}

