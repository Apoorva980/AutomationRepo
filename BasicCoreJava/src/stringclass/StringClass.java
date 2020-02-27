.abstract ,.''''']\


package stringclass;


public class StringClass {
	
	public static void main(String[] args) {
		
		
		String str = "your account Number is 1234     ";
		String str2 = "your account number is 1234";
				
				//Function 1
				System.out.println(str.charAt(23));
				
				//function2
				System.out.println(str.length());
				
				
				//function3
				System.out.println(str.toUpperCase());
				
				//function4
				System.out.println(str.toLowerCase());
				
				// function 5
				System.out.println(str.equals(str2));
				
				//function6
				System.out.println(str.equalsIgnoreCase(str2));
				
				//function7
				System.out.println(str.replace("1234", "5678"));
				
				//function8
				System.out.println(str.substring(23));
				
				//function9
				System.out.println(str.substring(0,26));
				
				//Function10
				System.out.println(str);
				System.out.println(str.trim());
				
				//function11
				String[] arr =str.split("");
				for (int i =0; i<arr.length; i++)
				
				for (String s :arr)
				{
					System.out.println(s);
				}
				
				System.out.println(str.substring(23));
				
	
				String name = "Apoorva";
				
				if ('n' == name.chartAt(1));
				
				
	}
}


