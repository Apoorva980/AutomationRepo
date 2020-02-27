package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		list.add("Apoorva");
		list.add("Sneha");
		list.add("jini");
		
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("******************");
	list = new LinkedList<>();
	list.add("Apoorva");
	list.add("Neha");
	list.add("hina");
	
	for(String s: list) {
		System.out.println(s);
		
	}
	
	
	System.out.println("******************");
	list = new Vector<>();
	list.add("Apoorva");
	list.add("Neha");
	list.add("hina");
	list.add("Apoorva");
	list.add("Neha");
	list.add("hina");
	
	for (String s : list) {
		System.out.println(s);
		
	}
	
	}
	}
