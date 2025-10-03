package Pckg_03_10_2025;

import java.util.Scanner;

public class ScannerClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myscan =new Scanner(System.in); // create a scanner object
		
		System.out.println("Enter user name");
		System.out.println("Enter your age");
		System.out.println("Enter your salary");
		
		String name= myscan.nextLine();
		System.out.println("Username is " + name);

	}

}
