package TP2.ej5;

//	Implemente una clase Java llamada ProfundidadDeArbolBinario que tiene como variable de
//	instancia un árbol binario de números enteros y un método de instancia
//	sumaElementosProfundidad (int p):int el cuál devuelve la suma de todos los nodos del árbol
//	que se encuentren a la profundidad pasada como argumento.

public class Main {
	public static void main(String[] args) {
		
		int nivel = 2;
	
		ProfundidadDeArbolBinario profAb = new ProfundidadDeArbolBinario(3,2);
		
		profAb.imprimir();
		
		int sumaProfundiadad = profAb.sumaElementosProfundidad(nivel);
		
		System.out.println();
		System.out.println("La suma de todos los nodos del nivel "+nivel+" es: "+sumaProfundiadad);
	}
	
	

}
