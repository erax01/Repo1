package rieder;

import java.util.Scanner;

/**
 * Dieses Programm addiert 2 vom Benutzer eingebene ganze Zahlen
 * @author Jordi Rieder
 * @version 2018-02-13
 */
public class Projekt1 {
	public static void main(String[] args) {
		System.out.println(Addieren());
	}
	public static int Addieren() {
		System.out.println("Bitte geben Sie die erste Zahl ein:");
		Scanner s = new Scanner(System.in);
		int eingabe1 = s.nextInt();
		System.out.println("Bitte geben Sie die zweite Zahl ein:");
		int eingabe2 = s.nextInt();
		s.close();
		return(eingabe1 + eingabe2);
	}
	public static int Subtrahieren() {
		System.out.println("Bitte geben Sie die erste Zahl ein:");
		Scanner s = new Scanner(System.in);
		int eingabe1 = s.nextInt();
		System.out.println("Bitte geben Sie die zweite Zahl ein:");
		int eingabe2 = s.nextInt();
		s.close();
		return(eingabe1 - eingabe2);
	}
}
