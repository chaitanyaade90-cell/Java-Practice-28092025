package Inheritance_pckg_09_10_2025;

class E
{
	int e=500;
	
	void inherit() {
		
		System.out.println(e);
	}
	
}

class F extends E
{
	
	int f=600;
	
	void inherit2() {
		
		System.out.println(f);
	}
}




public class Inheritance_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		E obj = new E();
		
		obj.inherit();
		
		System.out.println("**************");
		
		F obj1=new F();
		
		obj1.inherit2();
		
		
		

	}

}
