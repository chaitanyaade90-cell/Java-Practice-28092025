package pckg_Inheritance_06_10_2025;

import pckg_Inheritance_05_10_2025.A;
import pckg_Inheritance_05_10_2025.B;

public class Inheritance_Class_1 {
	
	class A{

		int a=10;

		void inherit() {

			System.out.println(a);
		}


	}
	
	class B{ extends A
		
		int b=20;
		
		void inherit2() {
			
			System.out.println(b);
		}
		
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obA=new A();
		obA.inherit();

		System.out.println("******************");
		B obB=new B();
		obB.inherit2();
		obB.inherit2();

	}

}
