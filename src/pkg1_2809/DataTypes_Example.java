package pkg1_2809;

public class DataTypes_Example {
	
	String name;
	int id;
	String location;
	
	public void M1() {
		
		System.out.println("My company name is " + name);
	}
	
	public void M2() {
		System.out.println("My id is " + id );
	}
	
	public void M3() {
		System.out.println("My location is " + location);
	}
	
	public static void main(String[] args) {
		
		DataTypes_Example d1=new DataTypes_Example();
		d1.name="Colage";
		d1.id=99;
		d1.location="pune";
		
		d1.M1();
		d1.M2();
		d1.M3();
	}

}
