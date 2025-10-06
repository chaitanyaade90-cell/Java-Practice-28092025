package pckg_Inheritance_06_10_2025;

class A
{
	
	int a=10;
	
	void inherit() {
		
		System.out.println(a);
	}
	
}

class B
{
	int b=20;
	
	void inherit2() {
		
		System.out.println(b);
	}
}



public class Inheritance_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj=new A();
		obj.inherit();
		
		System.out.println("***********");
		
		B obB=new B();
		obB.inherit2();
		System.out.println("*********");
		
		

	}

}
