package TP1.ej1;

public class EjercicioUno {

	public static void imprimirNumerosFor(int a, int b) {
	    for (int i = a; i <= b; i++) {
	        System.out.print(i + " ");
	    }
	}
	
	public static void imprimirNumerosWhile(int a, int b) {
	    int i = a;
	    while (i <= b) {
	        System.out.print(i + " ");
	        i++;
	    }
	}
	
	public static void imprimirNumeros(int a, int b) {
	    if (a <= b) {
	        System.out.print(a + " ");
	        imprimirNumeros(a + 1, b);
	    }
	}	
	

}
