package Inheritance_pckg_14_10_2025;

class ZZ
{
	
	int zz=100;
	
	public void inherit() {
		
		System.out.println(zz);
	}
}

class AN extends ZZ
{
	
	int an=200;
	
	public void inherit2() {
		
		System.out.println(an);
	}
	
}

public class Inherit_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZZ obj=new ZZ();
		obj.inherit();
		
		System.out.println("*******");
		
		AN obj2=new AN();
		obj2.inherit2();
		
		
		

	}

}
