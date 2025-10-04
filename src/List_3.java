import java.util.ArrayList;
import java.util.List;

public class List_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> Company=new ArrayList<>();
		
		Company.add("NortherTrust A");
		Company.add("Cigniti");
		Company.add("Coforege A");
		Company.add("NortherTrust A");
		
		for (int i = 0; i < Company.size(); i++) {
			
			if(Company.get(i).contains("NortherTrust"));
			
			System.out.println(Company.get(i));
			
		}

	}

}
