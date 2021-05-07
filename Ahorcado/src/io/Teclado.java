package io;

import java.util.Scanner;

public class Teclado {

	static Scanner sc;
	
	
	/*JAVA API Integer
	 * static int	parseInt​(String s)	
Parses the string argument as a signed decimal integer.*/
	
	
	public static int leerNumeroEntero() {
		sc = new Scanner (System.in);
		int var = sc.nextInt();	
		return var;
		
	}
        public static float leerNumeroFloat() {
		sc = new Scanner (System.in);
		float var = sc.nextFloat();
		return var;
		
	}
        public static double leerNumeroDouble() {
		sc = new Scanner (System.in);
		double var = sc.nextDouble();
		return var;
		
	}
        public static char leerCaracter() {
		sc = new Scanner (System.in);
		String var = sc.nextLine().toUpperCase();
		char var2=var.charAt(0);
                return var2;		
	}

    public static String leerCadena() {
		sc = new Scanner (System.in);
		String var = sc.nextLine().toUpperCase();	
		return var;		
	}
	
	
}
