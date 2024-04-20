package TP2.ej6;

import TP2.ej4.BinaryTree;

public class Transformacion {
	
	private BinaryTree<Integer> data;
	
	public Transformacion(int nivel, int valor) {
		super();
		if (nivel > 0) {
			this.data = crearArbolLleno(nivel,valor);
		}    
	}
	
	public BinaryTree<Integer> crearArbolLleno(int nivel, int valor) {
        
		if (nivel == 0) {
	        return new BinaryTree<>(valor);
	    }
		
		BinaryTree<Integer> nodo = new BinaryTree<Integer>(valor);
        nodo.addLeftChild(crearArbolLleno(nivel - 1, valor * 2));
        nodo.addRightChild(crearArbolLleno(nivel - 1, valor * 2 + 1));
        
        return nodo;
    }
	
    
    public BinaryTree <Integer> suma() {
        suma(this.data);
        return this.data;
    }
    
    private int suma(BinaryTree<Integer> tree) {
        int sum = 0;
        if(tree.isLeaf()) {
            sum = tree.getData();
            tree.setData(0);
            return sum;
        }
        if(tree.hasLeftChild()) {
            sum	+= suma(tree.getLeftChild());
        }
        if(tree.hasRightChild()) {
            sum+= suma(tree.getRightChild());
        }
        int actual = tree.getData();
        tree.setData(sum);
        return actual + sum;
    }
   
	public void imprimir() {
		this.data.printLevelTraversal();
	}
}
