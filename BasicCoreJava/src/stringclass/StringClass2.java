packagee stringclass;

public class StringClass2 {
	
	public static void main(String[] args) {
		
		String str = "Apoooooorva";

		int t = 0;
		
		for (int i =0; i <str.length(); i++)
		{
			if (str.charAt(i)== 'o')
				
				t ++;
		}
		System.out.println("number of n=" +t);
							
	}
}


