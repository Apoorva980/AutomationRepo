package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
	
	public static void main(String[] args) {
		
		Map<Integer, String> data = new HashMap <> ();
		
		data.put(1, "Apoorva");
		data.put(2, "Sneha");
		data.put(3, "David");
		
		System.out.println(data.get(1));
		
		Set<Integer> set = data.keySet();
		
		for (int key:set)
		{
			System.out.println(data.get(key));
			
		}
		
		System.out.println(data.get(null));
				
				
	}

}
