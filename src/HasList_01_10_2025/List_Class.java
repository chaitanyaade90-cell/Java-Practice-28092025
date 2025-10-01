package HasList_01_10_2025;

import java.util.ArrayList;
import java.util.List;

public class List_Class {
	
	public static void main(String[] args) {
		
		List<String> Cars=new ArrayList<>();
		
		Cars.add("Mercedez");
		Cars.add("Benz");
		Cars.add("Kia");
		
		for (int i = 0; i < Cars.size(); i++) {
			
			System.out.println(Cars);
			
		}
	}

}
