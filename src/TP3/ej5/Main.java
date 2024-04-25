package TP3.ej5;

import java.util.LinkedList;
import java.util.List;

//	Se dice que un nodo n es ancestro de un nodo m si existe un camino desde n a m.
//	Implemente un método en la clase GeneralTree con la siguiente firma:

//	public boolean esAncestro(T a, T b): devuelve true si el valor “a” es ancestro del valor “b”.

public class Main {
	public static void main(String[] args) {
		GeneralTree<Integer> A1 = new GeneralTree<Integer>(1);
		List <GeneralTree<Integer>> children1 = new LinkedList<GeneralTree<Integer>>();
		children1.add(new GeneralTree<Integer>(5));
		children1.add(new GeneralTree<Integer>(9));
		children1.add(new GeneralTree<Integer>(30));
		
		GeneralTree<Integer> A2 = new GeneralTree<Integer>(2,children1);
		List <GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		children2.add(new GeneralTree<Integer>(6));
		children2.add(new GeneralTree<Integer>(7));

		GeneralTree<Integer> A3 = new GeneralTree<Integer>(3,children2);
		List <GeneralTree<Integer>> children = new LinkedList<GeneralTree<Integer>>();
		children.add(A1);
		children.add(A2);
		children.add(A3);
		GeneralTree<Integer> A = new GeneralTree<Integer>(4,children);
		
		System.out.println(" "+A.esAncestro(3, 7)); 
	}
}
