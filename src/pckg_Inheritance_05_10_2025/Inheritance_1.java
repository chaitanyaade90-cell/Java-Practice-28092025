package pckg_Inheritance_05_10_2025;


class A{

	int a=10;

	void inherit() {

		System.out.println(a);
	}


}

class B extends A
{
	int b=20;

	void inherit2() {

		System.out.println(b);
	}
}

public class Inheritance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obA=new A();
		obA.inherit();

		System.out.println("******************");
		B obB=new B();
		obB.inherit();
		obB.inherit2();









	}

}
