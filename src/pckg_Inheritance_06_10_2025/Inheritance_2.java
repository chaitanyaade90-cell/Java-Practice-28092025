package pckg_Inheritance_06_10_2025;

class D
{
	
	int a=10;
	
	void inherit() {
		
		System.out.println(a);
	}
	
}

class E
{
	int b=20;
	
	void inherit2() {
		
		System.out.println(b);
	}
}



public class Inheritance_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D obj=new D();
		obj.inherit();
		
		System.out.println("***********");
		
		E obB=new E();
		obB.inherit2();
		System.out.println("*********");
		
		

	}

}
