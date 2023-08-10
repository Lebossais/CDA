package utilitaires;

import java.util.ArrayList;
import java.util.Scanner;

import bibliotheque2.Employe;
import forum.Utilisateur;

public class Input {

		private static Scanner scan = new Scanner(System.in);
		

	public static void print(ArrayList<Employe> employe) {
			System.out.println(employe);
		}
		
	public static void print(boolean dispo) {
		System.out.println(dispo);
	}
	
	public static void print(String string) {
		System.out.println(string);
	}
	
	public static void printo(char puissance4) {
		System.out.print(puissance4);
	}
	
	public static void printo(String string) {
		System.out.print(string);
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

	public static void print(char[][] string) {
		System.out.println();
		// TODO Auto-generated method stub
		
	}

	public static void print(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		System.out.println(utilisateur);
		
	}
	}
