package stringClass;

public class s {

	public static void main(String[] args) {
		
		int t =0;
		
		String str = "Apoorva";
		
		for (int i =0; i<str.length(); i++)
		{
		if(str.charAt(i) == 'o')	
		
			t++;
		}
		System.out.println("the number of o is" +t);
		
		
	}
}

