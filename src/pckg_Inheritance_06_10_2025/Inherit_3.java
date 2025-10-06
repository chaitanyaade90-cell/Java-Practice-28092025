package pckg_Inheritance_06_10_2025;


class A
{
	
	int A=10;
	 
	void inherit() {
		
		System.out.println(A);
		
	}
	
	
}

class B
{
	
	int B=20;
	void inherit2() {
		
		System.out.println(B);
	}
}

public class Inherit_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj =new A();
		obj.inherit();
		
		System.out.println("***********");
		
		B obB=new B();
		obB.inherit2();
		System.out.println("***********");

	}
	

}
