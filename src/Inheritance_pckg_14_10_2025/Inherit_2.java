package Inheritance_pckg_14_10_2025;

class AY
{
	
	int ay=1000;
	
	public void inherit() {
		
		System.out.println(ay);
	}
	
}

class YA extends AY
{
	
	int ya=200;
	
	public void inherit2() {
		
		System.out.println(ya);
	}
}

public class Inherit_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AY obj=new AY();
		obj.inherit();
		
		System.out.println("****");
		
		YA obj2=new YA();
		obj2.inherit2();
				
		
		

	}

}
