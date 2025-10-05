package pckg_Inheritance_05_10_2025;

import java.util.ArrayList;
import java.util.List;

public class ListExample_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>names=new ArrayList<>();
		names.add("Chaitanya");
		names.add("QUick");
		names.add("Kotak");
		
		for(String name: names) {
			System.out.println("Name :" + name);
		}
		

	}

}
