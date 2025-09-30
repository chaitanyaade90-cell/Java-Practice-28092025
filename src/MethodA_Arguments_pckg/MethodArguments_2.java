package MethodA_Arguments_pckg;

public class MethodArguments_2 {
	
	public static void add(int a1, int a2) {
		int sum=a1+a2;
		
		System.out.println(sum);
		
	}
	
	public static void sub(int a3, int a4) {
		int sum=a3-a4;
		
		System.out.println(sum);
		
	}
	public static void mul(int a5, int a6) {
		int sum = a5*a6;
		System.out.println(sum);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		MethodArguments_2.add(500, 1000);
		MethodArguments_2.sub(400, 200);
		MethodArguments_2.mul(400, 800);
	}

}
