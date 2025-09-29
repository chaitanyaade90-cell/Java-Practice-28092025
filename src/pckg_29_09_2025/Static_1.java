package pckg_29_09_2025;

public class Static_1 {
	
	static String name;
	static int number;
	static String location;
	
	public static void M1() {
		
		System.out.println("My Company name is " + name);
	}
	
	public static void M2() {
		System.out.println("My number is " + number);
	}
	
	public static void M3() {
		System.out.println("My location is " + location);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static_1.name="Coforge";
		Static_1.number=88;
		Static_1.location="Pune";
		
		Static_1.M1();
		Static_1.M2();
		Static_1.M3();

	}

}
