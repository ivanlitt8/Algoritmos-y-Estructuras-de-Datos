package TP1.ej7;

import java.util.ArrayList;
import java.util.List;

public class InvertirArrayList {
	
	public static void invertirArrayList(ArrayList<Integer> lista) {
		invertirRecursivamente(lista, 0, lista.size() - 1);
	}
	
	private static void invertirRecursivamente(ArrayList<Integer> lista, int inicio, int fin) {
		if (inicio < fin) {   // Intercambiar los elementos en las posiciones inicio y fin
			int temp = lista.get(inicio);
	        lista.set(inicio, lista.get(fin));
	        lista.set(fin, temp);
	            
	        // Llamar recursivamente al método con las posiciones actualizadas
	        invertirRecursivamente(lista, inicio + 1, fin - 1);
	    }
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>(); 
		lista.add(2);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(29);
		lista.add(99);
		invertirArrayList(lista);
		for(Integer i: lista) {
			System.out.print(i+" ");
		}
    }
}
