package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Interger>  list=
				
		List<String> list = new ArrayList<>();
		list.add("sneha");
		list.add("Apoorva");
		list.add("naysha");
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("*****************");		
		list = new LinkedList<>();
		list.add("sneha");
		list.add("Apoorva");
		list.add("naysha");
		for(String s:list) {
			System.out.println(s);
	}


	System.out.println("*****************************");


		
list = new Vector<>();
list.add("sneha");
list.add("Apoorva");
list.add("naysha");
list.add("sneha");
list.add("Apoorva");
list.add("naysha");
for(String s:list) {
	System.out.println(s);
}

}
}