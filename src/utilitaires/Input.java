package utilitaires;

import java.util.Scanner;

public class Input {

		private static Scanner scan = new Scanner(System.in);
		

	public static void print(boolean dispo) {
		System.out.println(dispo);
	}
	
	public static void print(String string) {
		System.out.println(string);
	}
	
	public static void print(int string) {
		System.out.println(string);
	}

	public static void print(double d) {
		System.out.println(d);
	}
	
	public static int nextInt() {
		return scan.nextInt();
		
	}
	public static String nextLine() {
		return scan.nextLine();
	}
	
	public static void close() {
		scan.close();
	}

	public static boolean nextBoolean() {
		return scan.nextBoolean();
	}
	}
