package stringClass;

public class StringClass {
	
	public static void main(String[] args) {
		
		String str ="Your account number is 1234     ";
		String str2 = "your account number is 1234"	;
		
		
		System.out.println(str.charAt(20));

		System.out.println(str.length());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.equals(str2));
		
		System.out.println(str.equalsIgnoreCase(str2));
		
		System.out.println(str.replace("1234", "5678"));
		
		System.out.println(str.substring(23));
		
		System.out.println(str.substring(0, 20));
		
		System.out.println(str);
		System.out.println(str.trim());
		
		
		
		String [] arr = str.split(" ");
		for(int i =0; i<arr.length; i++)
			
			for (String s:arr)
			{
				System.out.println(s);
			}
		
		System.out.println(str.substring(23));
		
		String name = "Apoorva";
		
		if ('n'== name.charAt(4));
	}}
