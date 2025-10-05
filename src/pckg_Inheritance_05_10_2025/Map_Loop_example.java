package pckg_Inheritance_05_10_2025;

import java.util.HashMap;
import java.util.Map;

public class Map_Loop_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer, String> employees=new HashMap();
		
		employees.put(9, "Keve");
		employees.put(10, "Shawn");
		employees.put(12, "jose");
		
		for(Map.Entry<Integer, String> entry : employees.entrySet());
		
		System.out.println();
		

	}

}
