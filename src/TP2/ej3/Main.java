package TP2.ej3;

import java.util.ArrayList;

import TP2.ej2.BinaryTree;

//	Defina una clase Java denominada ContadorArbol cuya función principal es proveer métodos de
//	validación sobre árboles binarios de enteros. Para ello la clase tiene como variable de instancia un
//	BinaryTree<Integer>. Implemente en dicha clase un método denominado numerosPares() que
//	devuelve en una estructura adecuada (sin ningún criterio de orden) todos los elementos pares del
//	árbol (divisibles por 2).
//	a) Implemente el método realizando un recorrido InOrden.
//	b) Implemente el método realizando un recorrido PostOrden.

public class Main {
	public static void main(String[] args) {
		
		BinaryTree<Integer> tree = new BinaryTree<>(1);
		
		tree.addLeftChild(new BinaryTree<Integer>(2));
        tree.addRightChild(new BinaryTree<Integer>(3));
        
        tree.getLeftChild().addLeftChild(new BinaryTree<Integer>(4));
        tree.getLeftChild().addRightChild(new BinaryTree<Integer>(5));
        tree.getRightChild().addLeftChild(new BinaryTree<Integer>(6));
        
        tree.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(18));
        tree.getRightChild().getLeftChild().addRightChild(new BinaryTree<Integer>(43));
        tree.getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(20));
		
        ContadorArbol contador = new ContadorArbol(tree);
        
        ArrayList<Integer> numerosParesPostOrden = contador.numerosParesPostOrden();
        ArrayList<Integer> numerosParesInOrden = contador.numerosParesInOrden();
        
        // Imprimir la lista de números pares
        System.out.println("Números pares en el árbol con reccorrido PostOrden: " + numerosParesPostOrden);
        System.out.println("Números pares en el árbol con reccorrido InOrden: " + numerosParesInOrden);

    }
}
