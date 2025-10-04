import java.util.ArrayList;
import java.util.List;

public class Ifloop_1 {

	/*
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>Cars=new ArrayList<>();
		
		Cars.add("Moto x");
		Cars.add("Bugati");
		Cars.add("Nope");
		Cars.add("Moto x");
		
		
		
		for (int i = 0; i < Cars.size(); i++) {
			
		
			if(Cars.get(i).contains("Moto")) {
				System.out.println(Cars.get(i));
			}
			
		
		}

	}

}
