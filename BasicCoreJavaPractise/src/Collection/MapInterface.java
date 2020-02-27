Spackage Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
	
	public static void main(String[] args) {
		
	
	
	Map<Integer, String> data = new HashMap<>();
	
	data.put(1, "Apoorva");
	data.put (2, "Pooja");
	data.put (3, "Prachi");
	data.put(1, "Abhishek");
	data.put(null, "Varsha");
	//System.out.println(data.get(1)); //if u know all the keys then u can pass the values
	
	/*Set<Integer>  set= data.keySet();
	
	for (int key:set)
	{
		System.out.println(data.get(key)); //dynamic
	}*/
	
	System.out.println(data.get(null));
	
}
}