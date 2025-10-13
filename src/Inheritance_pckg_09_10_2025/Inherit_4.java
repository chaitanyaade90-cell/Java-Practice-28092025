package Inheritance_pckg_09_10_2025;

class G
{
	int g= 100;
	
	void inherit() {
		
		System.out.println(g);
	}
	
}

class H extends G

{
	
	int h=200;
	
	void inherit2() {
		
		System.out.println(h);
		
		
	}
}


public class Inherit_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		G obj=new G();
		
		obj.inherit();
		
		System.out.println("********");
		
		H obj2=new H();
		
		obj2.inherit2();

	}

}
