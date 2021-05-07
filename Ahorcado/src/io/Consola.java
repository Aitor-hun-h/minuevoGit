package io;

public class Consola {

	
	
	public static void escribir(String cadena) {
		System.out.println(cadena);
	}
        public static void escribirSinSaltar(String cadena) {
		System.out.print(cadena);
	}
        
        public static void escribirArray(String[] cadena) {
		System.out.println(cadena);
	}
    public static void escribirEntero(int entero){
        System.out.print(entero);
    }
    public static void escribirDouble(double real){
        System.out.print(real);
    }
	
    public static void escribirCaracter(char caracter){
        System.out.print(caracter);
    }
    public static void escribirCaracterArray(char [][] caracter){
        System.out.print(caracter);
    }

    
}
