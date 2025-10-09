package Inheritance_pckg_09_10_2025;

class C
{
	
	int c= 200;
	
	void inherit() {
		
		System.out.println(c);
	}
	

}

class D extends C

{

	int d = 300;
	
	void inherit2() {
		
		System.out.println(d);
	}
	
}




public class Inheritance_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C obj=new C ();
		obj.inherit();
		
		System.out.println("************");
		
		D obj1=new D();
		obj1.inherit2();
		

	}

}
