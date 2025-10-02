package List_02_10_2025;

import java.util.ArrayList;
import java.util.List;

public class ListClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> City=new ArrayList<>();
		
		City.add("Pune");
		City.add("Nagpur");
		City.add("Nashik");
		
		for (int i = 0; i < City.size(); i++) {
			
			System.out.println(City);
			
		}

	}

}
