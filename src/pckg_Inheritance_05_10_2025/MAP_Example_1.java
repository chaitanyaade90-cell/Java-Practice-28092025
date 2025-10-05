package pckg_Inheritance_05_10_2025;

import java.util.HashMap;
import java.util.HashSet; ///
import java.util.Map;

public class MAP_Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> employees =new HashMap();
		
		employees.put(1, "chaitanya");
		employees.put(2, "rock");
		employees.put(3, "elon");
		
		for(Map.Entry<Integer, String> entry : employees .entrySet()) {
			
			System.out.println("ID : " + entry.getKey() + ", Name: " + entry.getValue());
			
		}

	}

}
