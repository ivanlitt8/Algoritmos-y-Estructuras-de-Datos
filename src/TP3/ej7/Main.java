package TP3.ej7;

import java.util.LinkedList;
import java.util.List;

//	Dada una clase Caminos que contiene una variable de instancia de tipo GeneralTree de números
//	enteros, implemente un método que retorne el camino a la hoja más lejana. En el caso de haber
//	más de un camino máximo retorne el primero que encuentre.
//	El método debe tener la siguiente firma: public List<Integer> caminoAHojaMasLejana ()
//	Por ejemplo, para el siguiente árbol, la lista a retornar seria: 12, 17, 6, 1 de longitud 3
//	(Los caminos 12, 15, 14, 16 y 12, 15, 14, 7 son también máximos, pero se pide el primero).

public class Main {
	public static void main(String[] args) {
		
		List <GeneralTree<Integer>> children1 = new LinkedList<GeneralTree<Integer>>();
		children1.add(new GeneralTree<Integer>(16));
		children1.add(new GeneralTree<Integer>(7));
		GeneralTree<Integer> A1 = new GeneralTree<Integer>(14,children1);
		
		List <GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		children2.add(A1);
		children2.add(new GeneralTree<Integer>(18));
		GeneralTree<Integer> A3 = new GeneralTree<Integer>(15,children2);
		
		
		List <GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
		children3.add(new GeneralTree<Integer>(8));
		GeneralTree<Integer> A4 = new GeneralTree<Integer>(9,children3);
		
		
		List <GeneralTree<Integer>> children4 = new LinkedList<GeneralTree<Integer>>();
		children4.add(new GeneralTree<Integer>(1));
		GeneralTree<Integer> A5 = new GeneralTree<Integer>(6,children4);
		
		
		List <GeneralTree<Integer>> children5 = new LinkedList<GeneralTree<Integer>>();
		children5.add(new GeneralTree<Integer>(10));
		children5.add(A5);
		GeneralTree<Integer> A6 = new GeneralTree<Integer>(17,children5);
		
		
		List <GeneralTree<Integer>> children6 = new LinkedList<GeneralTree<Integer>>();
		children6.add(A6);
		children6.add(A4);
		children6.add(A3);
		GeneralTree<Integer> A7 = new GeneralTree<Integer>(12,children6);
		
		Camino camino = new Camino(A7);
		
		System.out.println("El camino a la hoja más lejana es: ");
		List<Integer> caminoLejano = camino.caminoAHojaMasLejana();
		for (Integer valor : caminoLejano) {
			System.out.print(valor + " ");
		}
	    System.out.println();
		
	}
}
